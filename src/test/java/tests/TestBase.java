package tests;

import manager.ApplicationManger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static ApplicationManger app = new ApplicationManger();


    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite
    public void TearDown() {
        app.stop();
    }


}