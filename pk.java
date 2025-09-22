//revese words in an sentence

public class pk {
    public static String reverseWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]).append(" ");
    }
    return sb.toString().trim();
}
}
