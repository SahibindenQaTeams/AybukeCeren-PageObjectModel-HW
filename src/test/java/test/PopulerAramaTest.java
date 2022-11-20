package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.HomePage;
import page.PopulerArama;

import java.io.IOException;

public class PopulerAramaTest extends BaseClass{

    HomePage homePage;
    PopulerArama populerArama;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        populerArama = new PopulerArama(driver);
    }

    @Test
    public void test() throws IOException {

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.

        String title1 = homePage.getTitle1();
        homePage.clickPopuler1();//1. popüler arama kategorisi yani iphone12 mini tıklanır.
        populerArama.checkEslesme(title1);//Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir
        populerArama.back();//anasayfaya geri dönülür.

        String title2 = homePage.getTitle2();
        homePage.clickPopuler2();//2. popüler arama kategorisi yani pplaystation5 tıklanır.
        populerArama.checkEslesme(title2);//Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir
        populerArama.back();//anasayfaya geri dönülür.

        String title3 = homePage.getTitle3();
        homePage.clickPopuler3();//2. popüler arama kategorisi yani koşu bandı tıklanır.
        populerArama.checkEslesme(title3);//Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir
        populerArama.back();//anasayfaya geri dönülür.

        String title4 = homePage.getTitle4();
        homePage.clickPopuler4();//2. popüler arama kategorisi yani elektrikli ısıtıcı tıklanır.
        populerArama.checkEslesme(title4);//Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir
        populerArama.back();//anasayfaya geri dönülür.

        String title5 = homePage.getTitle5();
        homePage.clickPopuler5();//2. popüler arama kategorisi yani toyota fiyatları tıklanır.
        populerArama.checkEslesme(title5);//Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir
        populerArama.back();//anasayfaya geri dönülür.
    }

}
