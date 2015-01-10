package Package2;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Dell on 16-12-2014.
 */
public class Smoketestsuite extends Basetest
{
    @Test
    public void jobtitleadded()

    {
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Assert.assertEquals("Welcome Admin",driver.findElement(By.id("Welcome")).getText());

        driver.get("http://insoftt.trial47.orangehrmlive.com/symfony/web/index.php/admin/viewJobTitleList/jobTitleId/");
        System.out.println("jobtitle is added");
        // driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_Job")).click();
        driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Test Lead");
        driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Acting has a second line manager");
        //  driver.findElement(By.id("jobTitle_jobSpec")).sendKeys("C:/Users/Dell/Desktop/bhavani email recovery.docx");

        driver.findElement(By.id("btnSave")).click();

    }

}
