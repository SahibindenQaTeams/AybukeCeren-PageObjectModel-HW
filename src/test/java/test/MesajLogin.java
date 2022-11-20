package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.*;

public class MesajLogin extends BaseClass{

    HomePage homePage;
    EmlakVitrinPage vitrin;
    EmlakIlanPage ilan;
    LoginFrame login;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        vitrin = new EmlakVitrinPage(driver);
        ilan = new EmlakIlanPage(driver);
        login = new LoginFrame(driver);
    }

    @Test
    public void test(){

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.
        homePage.clickEmlak();//Emlak kategorisi tıklanıyor.
        vitrin.clickVitrinIlan();//Soldaki ilk emlak vitrin ilanına tıklandı.
        ilan.clickMesaj();//mesaj gönder tıklanır.
        login.enterName();//login frameinde isim girilir
        login.enterPassword();//login frameinde şifre girilir
        login.clickGiris();//login olunur.

    }
}
