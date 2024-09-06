public class StringManipulatorJesper {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
        // Käytin StringBulderiä koska jo entuudesta tuttu ja helppo käyttää
    }

    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}