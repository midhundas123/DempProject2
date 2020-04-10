package pages;

import Utilities.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends PageUtility {

    WebDriver driver;

    By uName = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
    WebElement x;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public String gettextofdiplaymessage( ){
        isElementLoaded(driver,x,20);
        return driver.findElement(uName).getText();
    }

}
