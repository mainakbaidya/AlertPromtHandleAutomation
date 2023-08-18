package alertprompthandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCases {

    public void endTest(WebDriver driver)
    {
        System.out.println("End Test: TestCases");
        
        driver.quit();

    }

    
    public  void testCase01(WebDriver driver){
        

        try {

            System.out.println("Start Test case: testCase01");

            // navigate website 
            driver.get("https://web-locators-static-site-qa.vercel.app/Alerts");

            //Click on Add remarks button
            driver.findElement(By.xpath("//button[@class='button_alert']/p[contains(text(), 'Remarks')]")).click();
            Thread.sleep(1000);

            //Remark
            String remark = "Excellent";
            
            //Send remark in alert Box
            driver.switchTo().alert().sendKeys(remark);
            Thread.sleep(1000);
            
            //Accept
            driver.switchTo().alert().accept();
            Thread.sleep(1000);

            //Verify remark is printed
            Boolean status = driver.findElement(By.xpath("//p[contains(text(), '"+remark+"')]")).isDisplayed();

            if(status){
                System.out.println("'" + remark + "'" + " is printed : " + status );
            }
            else{
                System.out.println("'" + remark + "'" + " is printed : " + status );
            }





            System.out.println("End Test case: testCase01");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    
}
