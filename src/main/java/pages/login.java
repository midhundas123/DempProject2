package pages;

import Utilities.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends PageUtility {
    WebDriver driver;

    By uName = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");

    By password = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");

    By loginButton = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input");

    public login(WebDriver driver) {
        this.driver = driver;
    }

    public void login (String Uname , String Pwd){
        driver.findElement(uName).sendKeys(Uname);
        driver.findElement(password).sendKeys(Pwd);
        driver.findElement(loginButton).click();
    }



}
