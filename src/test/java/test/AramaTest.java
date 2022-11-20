package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.HomePage;
import page.SearchPage;

public class AramaTest extends BaseClass{

    HomePage homePage;
    SearchPage search;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        search = new SearchPage(driver);
    }

    @Test
    public void test() {

        homePage.acceptCookie();//cookie kabul edildi.
        homePage.closeOnurBuldu();//Eğer Onur Buldu videosu yüklenirse, onu kapatıyor.

        homePage.clickDetayliArama();//detaylı arama tıklanır.
        search.clickEmlak();//detaylı arama sayfasında kategori olarak emlak tıklanır.
        search.clickIl();//detaylı arama sayfasında şehir olarak İstanbul-tümü seçilir.
        search.enterMinFiyat();//detaylı arama sayfasında min fiyat olarak 1000000 girilir.
        search.enterMaxFiyat();//detaylı arama sayfasında max fiyat olarak 10000000 girilir.
        search.clickArama();//arama butonu tıklanır.
    }

}
