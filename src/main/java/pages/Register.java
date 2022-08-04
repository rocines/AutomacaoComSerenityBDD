package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    public void accessPage(){
        open();
    }

    public String enterFirstName(String firstName){
        $("//input[@placeholder='First Name']").sendKeys(firstName);
        return firstName;
    }

    public String enterLastName(String lastName){
        $("//input[@placeholder='Last Name']").sendKeys(lastName);
        return lastName;
    }

    public String enterAddress(String address){
        $("//textarea[@ng-model='Adress']").sendKeys(address);
        return address;
    }

    public String enterEmail(String email){
        $("//input[contains(@type,'email')]").sendKeys(email);
        return email;
    }

    public String enterPhone(String phone){
        $("//input[@type='tel']").sendKeys(phone);
        return phone;
    }

    public String selectGender(String gender){
        $("//input[@value='" + gender + "']").click();
        return gender;
    }

    public String selectHobby(String hobby){
        $("//input[contains(@value,'" + hobby + "')]").click();
        return hobby;
    }

    public String selectLanguage(String language){
        find(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).sendKeys(language);
        return language;
    }

    public String selectSkill(String skill){
        find(By.id("Skills")).selectByValue(skill);
        return skill;
    }

    public String selectCountry(String country){
        $("//span[@role='combobox']").click();
        $("//input[contains(@class,'select2-search__field')]").sendKeys(country);
        $("//li[contains(.,'" + country + "')]").click();
        return country;
    }

    public String selectYear(String year){
        find(By.id("yearbox")).selectByValue(year);
        return year;
    }

    public String selectMonth(String month){
        find(By.xpath("//select[@placeholder='Month']")).selectByValue(month);
        return month;
    }

    public String selectDay(String day){
        find(By.xpath("//select[@placeholder='Day']")).selectByValue(day);
        return day;
    }

    public String enterPassword(String password){
        $("//input[@ng-model='Password']").sendKeys(password);
        return password;
    }

    public String confirmPassword(String password){
        $("//input[@ng-model='CPassword']").sendKeys(password);
        return password;
    }

    public String uploadImage(String path){
        upload(path).to($("//input[@type='file']"));
        return path;
    }

    public void clickSubmitButton(){
        $("//button[@type='submit']").click();
    }
}
