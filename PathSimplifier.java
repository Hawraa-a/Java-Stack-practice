import java.util.Stack;

class PathSimplifier {
    /**
     * TO-DO: Simplify a Unix-style file path.
     * For example, "/a/./b/../../c/" should become "/c".
     * And "/../" should become "/".
     * \*
     *
     * @param path The absolute path string.
     * @return The simplified canonical path.
     */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // Your code here:
        for (String component : components) {
            if (component.equals(".") || component.isEmpty()) {
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        // Your code here:
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.toString(); // Placeholder
    }
}