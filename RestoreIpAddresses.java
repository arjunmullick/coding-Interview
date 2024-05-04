/**
A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

 

Example 1:

Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
Example 2:

Input: s = "0000"
Output: ["0.0.0.0"]
Example 3:

Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
**/

class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        backtrack(sb, 0, s, n, 0);
        return res;
    }

    private void backtrack(StringBuilder sb, int index, String s, int max, int num) {
        if (num > 4) return;
        if (index == max) {
            if (num < 4) return;
            res.add(sb.substring(0, sb.length() - 1));
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (i + index < max && isValid(s.substring(index, index + i + 1))) {
                sb.append(s.substring(index, index + i + 1)).append('.');
                backtrack(sb, index + i + 1, s, max, num + 1);
                sb.delete(sb.length() - i - 2, sb.length());
            }
        }
    }

    private boolean isValid(String s) {
        if (s.equals("0")) return true;
        if (s.startsWith("0") || Integer.parseInt(s) > 255 || s.length() > 3) return false;
        return true;   
    }
}
