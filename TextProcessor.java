public class TextProcessor {
    public static void main(String[] args) {
        try {
            // Input text with extra spaces and tabs
            String inputText = "This   is   a    test.  It should replace    spaces and tabs!";
            System.out.println("Original Text:");
            System.out.println(inputText);

            // Remove extra spaces and tabs
            String cleanedText = inputText.replaceAll("\\s+", " ");

            // Parse the cleaned text into structured classes
            Text text = new Text(cleanedText);

            // Output the processed text
            System.out.println("Processed Text:");
            System.out.println(text);
        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}
