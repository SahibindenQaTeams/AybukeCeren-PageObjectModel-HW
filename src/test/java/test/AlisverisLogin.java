package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.*;

public class AlisverisLogin extends BaseClass{

    HomePage homePage;
    AlisverisPage alisveris;
    AlisverisVitrinPage vitrin;
    AlisverisIlanPage ilanDetay;
    LoginFrame login;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        alisveris = new AlisverisPage(driver);
        vitrin = new AlisverisVitrinPage(driver);
        ilanDetay = new AlisverisIlanPage(driver);
        login = new LoginFrame(driver);
    }

    @Test
    public void test(){

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.
        homePage.clickAlisveris();//Alışveriş kategorisi tıklanıyor.
        alisveris.clickVitrin();//Alışveriş sayfasında "Tüm vitrin ilanlarını göster" tıklandı.
        vitrin.clickIlkIlan();//Alışveriş vitrin sayfasındaki ilk ilan tıklandı.
        ilanDetay.clickFavori();//Alışveriş ilan detayında "Favorilere ekle" butonuna tıklandı, ve sonra login ekranı görüldü.
        login.enterName();//Login ekranında isim girilir.
        login.enterPassword();//Login ekranında şifre girilir.
        login.clickGiris();
    }



}
