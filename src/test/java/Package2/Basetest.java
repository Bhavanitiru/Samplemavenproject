package Package2;

import Package1.Businesslibrary;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Dell on 16-12-2014.
 */
public class Basetest  extends Businesslibrary
{
    @BeforeClass
    public static void openbrowser()
    {
        System.out.println("browser is opened");
        driver = new FirefoxDriver();
        driver.get("http://insoftt.trial47.orangehrmlive.com/");
    }

    @AfterClass
    public static void closebrowser() {
        System.out.println("browser is closed");
        driver.quit();
    }

    @Before
    public void login()
    {
        System.out.println("it is logged in");
        WebElement uID = driver.findElement(By.id("txtUsername"));
        uID.sendKeys("Admin");
        WebElement PWD = driver.findElement(By.id("txtPassword"));
        PWD.sendKeys("Insoft12");
        WebElement lOGIN = driver.findElement(By.id("btnLogin"));
        lOGIN.click();

    }

    @After
    public void logout() {
        System.out.println("I am logging out from Admin account");
        //------------Logout----------------------------
        //Click on Welcome Admin
        WebElement welcome = driver.findElement(By.id("welcome"));
        welcome.click();
        //Click on Logout link
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
    }



}
