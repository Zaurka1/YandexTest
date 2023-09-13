import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
    @Before
    public void before() {
        System.out.println("Действие перед тестом");
    }

    @Test
    public void test1() {
      open("https://demoqa.com/automation-practice-form");
    }

    @After
    public void after() {
        System.out.println("Действие после теста");
    }
}
