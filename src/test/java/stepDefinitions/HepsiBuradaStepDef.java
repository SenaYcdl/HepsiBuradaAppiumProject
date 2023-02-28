package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HepsiPage;
import utils.Driver;
import utils.ReusableMethods;


public class HepsiBuradaStepDef extends ReusableMethods {

    HepsiPage hepsiPage =new HepsiPage();

   AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) Driver.getAppiumDriver();

    @Given("app yuklesin")
    public void app_yuklesin() {

        Driver.getAppiumDriver();

    }

    @Given("kullanici ana sayfada oldugunu dogrular")
    public void kullanici_ana_sayfada_oldugunu_dogrular() {

        ReusableMethods.wait(5);
        hepsiPage.kategorilerimButton.click();


    }


    @Then("kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String text) {


        ReusableMethods.wait(3);
        hepsiPage.bilgisayarTekElekButton.click();

    }

    @Then("kullanici sayfayi asagi kaydirip {string} secenegine tiklar")
    public void kullanici_sayfayi_asagi_kaydirip_secenegine_tiklar(String string) {

        hepsiPage.laptopButton.click();

    }

    @Then("kullanici {string} tiklar")
    public void kullanici_tiklar(String string) {

        hepsiPage.filtreleButton.click();


    }

    @Then("kullanici {string} secer")
    public void kullanici_secer(String text) {

        ReusableMethods.wait(3);
        hepsiPage.markaButton.click();



    }

    @Then("kullanici ilk cikan urunu sepete ekler")
    public void kullanici_ilk_cikan_urunu_sepete_ekler() {

        hepsiPage.monsterButton.click();
        hepsiPage.uygulaButton.click();
        ReusableMethods.wait(2);
        hepsiPage.urunleriGorButton.click();


    }

    @Then("kullanici sepetindeki urunun gorunurlugunu dogrular")
    public void kullanici_sepetindeki_urunun_gorunurlugunu_dogrular() {

        ReusableMethods.wait(3);
        hepsiPage.sepeteEkle.click();
        ReusableMethods.wait(3);
        hepsiPage.sepetim.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(hepsiPage.urunSepette.isDisplayed());


        ReusableMethods.wait(3);
        driver.closeApp();

    }


}
