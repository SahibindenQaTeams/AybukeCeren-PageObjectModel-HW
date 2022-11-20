package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.*;

import java.io.IOException;

public class OtomobilTest1 extends BaseClass{

    HomePage homePage;
    OtomobilPage otomobil;
    OtoTumIlanlar ilanlar;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        otomobil = new OtomobilPage(driver);
        ilanlar = new OtoTumIlanlar(driver);
    }

    @Test
    public void test() throws IOException {

       homePage.acceptCookie();//cookie kabul edildi.
       homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.
       homePage.clickOtomobil();//Anasayfada "otomobil" menüsüne tıklanır.
       otomobil.clickIlanlar();//"Bu kategorideki tüm ilanlar" tıklanır.
       ilanlar.checkIlanSayisi();// açılan sayfadaki ilan sayısının 20 olup olmadığı kontrol edilir.
    }



}
