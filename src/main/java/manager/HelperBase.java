package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
    WebDriver wd;
    private By locator;
    private String text;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }
    public void type (By locator,String text)
    {
        this.locator = locator;
        this.text = text;
        if(text !=null){
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }
    public void pause(int millis)
    {
        try {
            Thread.sleep(millis);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
