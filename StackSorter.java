import java.util.Stack;

class StackSorter {
    /**
     * TO-DO: Sort the given stack so that the smallest element is at the top.
     * You may use a temporary stack, but no other data structures.
     * \*
     *
     * @param stack The stack of integers to be sorted.
     */
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();
        while (!stack.isEmpty()) {
            int tempStack = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > tempStack) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(tempStack);
        }
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}