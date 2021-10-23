import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    WebDriver wd;

    @BeforeMethod
    public void init()
    {
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void registrationTestPositive()
    {
        int i =(int) (System.currentTimeMillis()/1000)%3600;
        String email = "nik"+ i + "@gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:"+ email);
    }


    @Test
    public void registrationTestWrongEmail()
    {
        int i =(int)(System.currentTimeMillis()/1000)%3600;
        String email = "nik"+ i + "gmail.com";
        String password = "Nik12345$";
        System.out.println("Email:"+ email);}




        @AfterMethod
                public void tearDown(){
        wd.quit();
        }
    }
