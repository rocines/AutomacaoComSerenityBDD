package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Steps
    RegisterSteps registerSteps;

    @Managed
    WebDriver browser;

    @Before
    public void setup(){
        registerSteps.openPage();
    }

    @Title("Preencher formulário")
    @Test
    public void loginTest(){
        registerSteps.fillForm();
    }
}
