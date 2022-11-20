package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.*;


public class IlanVermeTest extends BaseClass{

    HomePage homePage;
    LoginPage login;
    IlanVer ilanver;
    KategoryPage kategori;
    AltKategori altkategori;
    IlanVermeDetay ilandetay;
    OnızlemePage onizleme;
    DopingPage doping;
    SuccessPage success;

    @BeforeEach
    public void before() {

        homePage = new HomePage(driver);
        login = new LoginPage(driver);
        ilanver = new IlanVer(driver);
        kategori = new KategoryPage(driver);
        altkategori = new AltKategori(driver);
        ilandetay = new IlanVermeDetay(driver);
        onizleme = new OnızlemePage(driver);
        doping = new DopingPage(driver);
        success = new SuccessPage(driver);

    }

    @Test
    public void test() throws InterruptedException {

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.
        homePage.clickGiris();//anasayfada giriş yap butonu tıklanır.
        login.enterName();//login ekranında isim girilir.
        login.enterPassword();//login ekranında şifre girilir.
        login.clickGiris();// giriş yapılır.
        ilanver.clickUcretsizIlan();//login olduktan sonra anasayfada "Ücretsiz İlan" butonu tıklanır.
        kategori.clickKategori();//kategori seçilir, hayvanlar alemi kategori olarak seçilir.
        altkategori.clickEvcilHayvanlar();//alt kategori olarak evcil hayvanlar tıklanır.
        altkategori.clickKedi();//alt-alt kategori olarak kedi tıklanır.
        altkategori.clickAmerican();//alt-alt-alt kategori olarak american shorthair kedisi seçilir.
        altkategori.clickDevam();//devam butonu tıklanır.
        ilandetay.enterBaslik();//ilana başlık girilir.
        ilandetay.enterAciklama();//ilan açıklaması girilir.
        ilandetay.selectYas();// yaş 1 olarak seçilir.
        ilandetay.selectCinsiyet();// cinsiyet dişi olarak seçilir.
        ilandetay.selectSehir();//şehir olarak izmir seçilir.
        ilandetay.selectIlce();//ilçe olarak Bergama seçilir.
        ilandetay.selectMahalle();//Mahalle olarak Ayaşkent seçilir.
        ilandetay.clickIlanVerme();//ilan verme kuralları checklenir.
        ilandetay.clickDevam();//devam butonu tıklanır.
        onizleme.clickdevam();//önizleme sayfasında devam butonu tıklanır
        doping.clickdevam();//doping sayfasında devam butonu tıklanır, doping almadan ilerleme yapıldı.
        success.clickBanaOzeleGit();//tebrikler sayfasında "bana özele git" butonu tıklanır.
    }
}
