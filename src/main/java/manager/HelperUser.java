package manager;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase {


    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void subnitRegistration()
    {
        click(By.xpath("//input[2]"));
    }
    public void fillLoginRegistrationForm(String email,String password)
    {
        type(By.xpath("//input[1]"),email);
        type(By.xpath("//input[2]"),password);
    }
    public void openLoginRegistrationForm(){
        click(By.xpath("//a[text()='LOGIN']"));
    }
    public void submitLogin()
    {click(By.xpath("//button[1]"));}

    public boolean isLogged()
    {
        return isElementPresent(By.xpath("//button[text()='Sign Out']"));
    }

    public void logout(){
        click(By.xpath("//button[text()='Sign Out']"));
    }
}
