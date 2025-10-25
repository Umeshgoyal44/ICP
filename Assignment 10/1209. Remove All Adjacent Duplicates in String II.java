class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == c) {
                int count = stack.peek().getValue() + 1;
                stack.pop();
                if (count < k) stack.push(new Pair<>(c, count));
            } else {
                stack.push(new Pair<>(c, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Pair<Character, Integer> p : stack) {
            sb.append(String.valueOf(p.getKey()).repeat(p.getValue()));
        }
        return sb.toString();
    }
}
