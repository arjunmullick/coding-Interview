class Solution {
    public NestedInteger deserialize(String s) {
        
        Stack<NestedInteger> stack = new Stack<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        if(n == 0) return new NestedInteger();
        
        //special case 
        if(s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));
        
        NestedInteger curr = null;
        for ( r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (ch == '[') {
                if (curr != null) {
                    stack.push(curr);
                }
                curr = new NestedInteger();
                l = r+1;
            } else if (ch == ']') {
                String num = s.substring(l, r);
                if (!num.isEmpty())
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                if (!stack.isEmpty()) {
                    NestedInteger pop = stack.pop();
                    pop.add(curr);
                    curr = pop;
                }
                l = r+1;
            } else if (ch == ',') {
                if (s.charAt(r-1) != ']') {
                    String num = s.substring(l, r);
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                l = r+1;
            }
        }
        
        return curr;
    }
}
