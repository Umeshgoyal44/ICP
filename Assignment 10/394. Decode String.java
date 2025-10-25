class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = current;
                current = stringStack.pop();
                int count = countStack.pop();
                while (count-- > 0) current.append(temp);
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }
}
