package Main;

import java.sql.*;

import static Main.ConnectDB.getText;
import static Main.CountWords.countWords;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String text = getText(1);
        int numOfWords = countWords(text);
        System.out.println("Текст: " + text);
        System.out.println("Количество слов в тексте = " + numOfWords);
    }
}