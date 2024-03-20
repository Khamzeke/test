package Tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Main.CountWords.countWords;

public class TestCount {
    @Test
    public void check(){
        String text = "Это первый тест";
        Assertions.assertEquals(3,countWords(text));
        text = "а это уже второй тест";
        Assertions.assertEquals(5,countWords(text));
        text = "Ну а это новый третий тест";
        Assertions.assertEquals(6,countWords(text));
    }

}
