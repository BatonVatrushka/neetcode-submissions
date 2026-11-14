class Solution {
    public boolean isValid(String s) {
        // 1. map each closing bracket to its opening bracket
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        // 2. stack of unclosed opening brackets
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                // 3. c is a closing bracket
                if (stack.isEmpty() || stack.peek() != pairs.get(c)) {
                    return false;
                }
                stack.pop(); // matched, so remove the opener
            } else {
                // 4. c is an opening bracket
                stack.push(c);
            }
        }
        // 5. Valid only if every opener was closed
        return stack.isEmpty();
    }
}
