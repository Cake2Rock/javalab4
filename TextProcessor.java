public class TextProcessor {
    public static void main(String[] args) {
        String inputText = "This   is   a    test.\tIt should replace    spaces and tabs!";
        System.out.println("Original Text:");
        System.out.println(inputText);

        // Удаление лишних пробелов и табуляций
        String cleanedText = inputText.replaceAll("\\s+", " ");
        Text text = new Text(cleanedText);

        System.out.println("Processed Text:");
        System.out.println(text);
    }
}
