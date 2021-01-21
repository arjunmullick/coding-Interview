public class DecodeString {
    //https://leetcode.com/problems/decode-string/
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
}
