public class TextJustification {

    //https://leetcode.com/problems/text-justification/
    class Solution {
        public List<String> fullJustify(String[] words, int maxWidth) {
            int left = 0; List<String> result = new ArrayList<>();

            while (left < words.length) {
                int right = findRight(left, words, maxWidth);//max words we can fit with 1 space in between.
                result.add(justify(left, right, words, maxWidth));//add spaces and justify
                left = right + 1;
            }

            return result;
        }

        //max words we can fit with 1 space in between.
        private int findRight(int left, String[] words, int maxWidth) {
            int right = left;
            int sum = words[right].length();
            right++;
            while (right < words.length && (sum + 1 + words[right].length()) <= maxWidth){
                sum += 1 + words[right].length();
                right++;
            }
            return right - 1;
        }

        //add spaces and justify
        private String justify(int left, int right, String[] words, int maxWidth) {
            if (right - left == 0) return padResult(words[left], maxWidth);

            boolean isLastLine = right == words.length - 1;
            int numSpaces = right - left;
            int totalSpace = maxWidth - wordsLength(left, right, words);

            String space = isLastLine ? " " : blank(totalSpace / numSpaces);
            int remainder = isLastLine ? 0 : totalSpace % numSpaces;

            StringBuilder result = new StringBuilder();
            for (int i = left; i <= right; i++)
                result.append(words[i])
                        .append(space)
                        .append(remainder-- > 0 ? " " : "");

            return padResult(result.toString().trim(), maxWidth);
        }


        private int wordsLength(int left, int right, String[] words) {
            int wordsLength = 0;
            for (int i = left; i <= right; i++) wordsLength += words[i].length();
            return wordsLength;
        }

        private String padResult(String result, int maxWidth) {
            return result + blank(maxWidth - result.length());
        }

        private String blank(int length) {
            return new String(new char[length]).replace('\0', ' ');
        }
    }
}
