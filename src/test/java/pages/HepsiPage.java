package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import javax.xml.xpath.XPath;

public class HepsiPage {

    public HepsiPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(id ="com.pozitron.hepsiburada:id/nav_graph_category")
    public MobileElement kategorilerimButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bilgisayar, Teknoloji, Elektronik']")
    public MobileElement bilgisayarTekElekButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Laptop']")
    public MobileElement laptopButton;

    @AndroidFindBy (id ="com.pozitron.hepsiburada:id/tv_product_list_options_bar_filter")
    public MobileElement filtreleButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Marka']")
    public MobileElement markaButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text()='Everest']")
    public MobileElement everestButton;

    @AndroidFindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Monster\"]/android.widget.LinearLayout/android.widget.TextView")
    public MobileElement monsterButton;

    @AndroidFindBy (id = "com.pozitron.hepsiburada:id/btn_filters_apply")
    public MobileElement uygulaButton;

    @AndroidFindBy (id = "com.pozitron.hepsiburada:id/btn_filters_main_close")
    public MobileElement urunleriGorButton;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Sepete Ekle\"])[1]")
    public MobileElement sepeteEkle;

    @AndroidFindBy(id="com.pozitron.hepsiburada:id/nav_graph_cart")
    public MobileElement sepetim;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Monster Abra A5 V17.2.3 Intel Core i5-11400H 16GB RAM 500GB SSD 4GB RTX3050Ti FreeDOS 15.6\" FHD 144Hz Oyun Bilgisayarı']")
    public MobileElement urunSepette;
}
