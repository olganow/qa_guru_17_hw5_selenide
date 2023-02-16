import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DropAndDrop {
    //(опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
    // - Откройте https://the-internet.herokuapp.com/drag_and_drop
    // - Перенесите прямоугольник А на место В
    // - Проверьте, что прямоугольники действительно поменялись
    // - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void DropAndDrop (){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").hover();
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
    }

}
