class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<String> strStack = new ArrayDeque<>();
        StringBuilder tail = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = c - '0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++;
                }

                numStack.push(num);
            } else if (c == '[') {
                strStack.push(tail.toString());
                tail = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder(strStack.pop());

                int repeatedTimes = numStack.pop();
                for (int j = 0; j < repeatedTimes; j++) {
                    tmp.append(tail);
                }

                tail = tmp;
            } else {
                tail.append(c);
            }
        }

        return tail.toString();
    }
}

    
    //better approach above.
    /**
    public String decode(String s){
        String result = "";
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(isNumber(s.charAt(i))){
                int firstStart = i+2;
                int firstEnd = getSubEnd(s);
                String prefix = s.substring(0,i);
                String last = s.substring(firstEnd,n);
                int count = Integer.parseInt(String.valueOf(s.charAt(i)));
                String decode = "";
                for(int j = 0 ; i < count ; j++){
                    decode = decode + s.substring(firstStart,firstEnd);
                }
                result = prefix + decode + last;
                break;
            }
        }
        if(result.indexOf('[') > 0){
            result = decode(result);
        }
        return result;
    }
    
    public int getSubEnd(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '['){
                count++;
            }
            if(s.charAt(i) == ']' && count == 1){
                return i;
            } 
            if(s.charAt(i) == ']'){
                count--;
            }
        }
        return s.length();
    }
    
    public boolean isNumber(char c){
        try{
            int no = Integer.parseInt(String.valueOf(c));
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
    **/
