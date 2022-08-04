package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.Register;

public class RegisterSteps extends PageObject {
    private Register register;

    @Step("Dado que estou na página inicial")
    public void openPage(){
        register.accessPage();
    }

    @Step("Quando preencho os dados do formulário")
    public void fillForm(){
        register.enterFirstName("Nome");
        register.enterLastName("Sobrenome");
        register.enterAddress("Rua Teste, 123");
        register.enterEmail("teste@teste.com.br");
        register.enterPhone("11 91234-5678");
        register.selectGender("Male");
        register.selectHobby("Movies");
//        register.selectLanguage("English");
        register.selectSkill("Java");
        register.selectCountry("Australia");
        register.selectYear("1994");
        register.selectMonth("September");
        register.selectDay("7");
        register.enterPassword("123456");
        register.confirmPassword("123456");
        register.uploadImage("C://Users//ROCINES//Pictures//craiyon_170827_Junji_Ito_Giorno_Giovanna.png");
    }
}
