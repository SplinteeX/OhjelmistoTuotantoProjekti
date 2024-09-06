public class StringManipulatorJesper {
    public String reverse(String input) {
        // Check for null input
        if (input == null) {
            return null;
        }
        return input;
    }
    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}