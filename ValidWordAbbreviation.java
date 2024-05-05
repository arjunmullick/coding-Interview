//https://leetcode.com/problems/valid-word-abbreviation/
//s10n" is a valid abbreviation of "substitution" b
//Time O(m + n), where m is the length of word and n is the length of abbr.
// Space " O(1), which represents constant space.
class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0, j=0;
        while(i<word.length() && j<abbr.length()){
            char x = word.charAt(i);
            char y = abbr.charAt(j);
            if(x==y){
                i++;
                j++;
            } else if(y>='a' && y<='z')
                return false;
            else {
                int num = 0;
                if(y=='0')
                    return false;
                while(j<abbr.length()&&abbr.charAt(j)>='0' && abbr.charAt(j)<='9'){
                    num = num*10+(abbr.charAt(j)-'0');
                    j++;
                }
                if(i+num>word.length())
                    return false;
                i=i+num;
            }
        }
        if(i==word.length() && j==abbr.length())
            return true;
        return false;
    }
}
