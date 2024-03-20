package Main;

public class CountWords {
    public static int countWords(String text){
        String[] words = text.split(" ");

        return words.length;
    }
}
