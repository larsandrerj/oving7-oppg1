public class NewString {
    private final String originalText;

    public NewString(String input) {
        this.originalText = input;
    }

    public String abbrev() {
        String[] words = originalText.split(" ");
        String abbreviatedText = "";
        for (String word : words) {
            abbreviatedText += word.substring(0, 1);
        }
        return abbreviatedText;
    }

    public String remove(char c) {
        char[] textCharList = originalText.toCharArray();
        String returnText = "";
        for (char value : textCharList) {
            if (Character.toLowerCase(value) != Character.toLowerCase(c)) {
                returnText += String.valueOf(value);
            }
        }
        return returnText;
    }

}
