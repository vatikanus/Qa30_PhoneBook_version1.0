package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class RegistrationTest extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(app.getUser().isLogged()){
            app.getUser().logout();
        }
    }



    @Test
    public void registrationTestPositive() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        String email = "nik" + i + "@gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:" + email);

        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().subnitRegistration();
        app.getUser().pause(2000);


        //Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Sign Out']")));
        //Assert.assertTrue(app.getUser().isElementPresent());
    }
    @Test
    public void registrationTestWrongEmail()
    {
        int i =(int)(System.currentTimeMillis()/1000)%3600;
        String email = "nik"+ i + "gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:"+ email);}

    }
