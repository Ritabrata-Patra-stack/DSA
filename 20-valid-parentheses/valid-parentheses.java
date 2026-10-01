class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            // Closing brackets
            else {
                if (top == -1) {
                    return false;
                }

                char open = stack[top--];

                if (ch == ')' && open != '(') {
                    return false;
                }

                if (ch == '}' && open != '{') {
                    return false;
                }

                if (ch == ']' && open != '[') {
                    return false;
                }
            }
        }

        return top == -1;
    }
}