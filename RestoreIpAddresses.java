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