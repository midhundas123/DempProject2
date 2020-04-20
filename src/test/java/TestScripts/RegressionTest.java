package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.login;

public class RegressionTest extends TestHelper{

    @Test
    public void VerifyLogin(){
        login x = new login(driver);
        x.login("un","psd");
        Homepage y = new Homepage(driver);
       // String z=  y.gettextofdiplaymessage();
        Assert.assertTrue(false);
    }

    @Test
    public void VerifyLogin1(){
        login x = new login(driver);
        x.login("un","psd");
        Homepage y = new Homepage(driver);
        // String z=  y.gettextofdiplaymessage();
        Assert.assertTrue(true);
    }

    //@Test
    public void VerifyLogin2(){
        login x = new login(driver);
        x.login("un","psd");
        Homepage y = new Homepage(driver);
        // String z=  y.gettextofdiplaymessage();
        Assert.assertTrue(true);
    }
}
