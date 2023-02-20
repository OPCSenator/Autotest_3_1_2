
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



    class CallbackTest {
        @Test
        void firstTest() {
            open("http://localhost:9999");
            SelenideElement formName = $("[data-test-id=name]");
            formName.$("[data-test-id=name] input").setValue("Иван Иванович-Иванов");
            SelenideElement formPhone = $("[data-test-id=phone");
            formPhone.$("[data-test-id=phone] input").setValue("+01234567890");
            $("[class = 'checkbox__box']").click();
            $("[type = 'button']").click();
            $(withText("Ваша заявка успешно отправлена!")).shouldBe(visible);
            }
    }



