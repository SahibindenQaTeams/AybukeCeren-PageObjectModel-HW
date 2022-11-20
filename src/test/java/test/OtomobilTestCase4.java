package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.HomePage;
import page.OtoTumIlanlar;
import page.OtomobilDetayPage;
import page.OtomobilPage;

import java.io.IOException;

public class OtomobilTestCase4 extends BaseClass{

    HomePage homePage;
    OtomobilPage otomobil;
    OtoTumIlanlar ilanlar;
    OtomobilDetayPage detay;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        otomobil = new OtomobilPage(driver);
        ilanlar = new OtoTumIlanlar(driver);
        detay = new OtomobilDetayPage(driver);
    }

    @Test
    public void test4() throws IOException {

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.
        homePage.clickOtomobil();//Anasayfada "otomobil" menüsüne tıklanır.
        otomobil.clickIlanlar();//"Bu kategorideki tüm ilanlar" tıklanır.
        ilanlar.ilkIlanClick();//sayfadaki ilk ilana tıklanır.
        detay.checkUrl();//ilan detay sayfasındaki URL deki ilan no ile ilan detaydaki ilan no'nun aynı olduğu kontrol edilir.
    }
}
