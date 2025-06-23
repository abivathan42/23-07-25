public class RemoveWhitespace {
    public static void main(String[] args) {
        String text = "Java is fun!";
        String result = text.replaceAll("\\s", "");
        System.out.println("Without spaces: " + result);
    }
}
