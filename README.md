# AybukeCeren-PageObjectModel-HW
## Test notları
<sup> Tb182'de testler yapıldı; test ortamının bazı elementleri geç yüklemesinden dolayı wait süresi uzun. page packageında page classları var; test packageında test classları var. Test ekranlarının web elementleri @FindBy annotation tanımlamasıyla page packageındadır. </sup>
## Test caseleri (test class isimleriyle birlikte)
<sup> - **OtomobilTest1.java**: Kullanıcı anasayfada “otomobil” kategorisine tıklar. “Bu kategorideki tüm ilanlar” menüsüne tıklar.Sayfa başına ilan sayısı prodda 20, sayfa başına ilan sayısının 20 olarak geldiği kontrol edildi. Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada otomobil kategorisine tıklanınca açılan sayfanın page classı **OtomobilPage.java**. Otomobil sayfasında "bu kategorideki tüm ilanlar" tıklandığında açılan sayfanın page classı **OtoTumIlanlar.java**. Bu casein kontrolünü OtoTumIlanlar page classının checkIlanSayisi() metoduyla yaptım. </sup>
<br/>
<br/>
<sup> -**OtomobilTestCase2.java**: Kullanıcı anasayfada “otomobil” kategorisine tıklar. Bu kategorideki tüm ilanlar” menüsüne tıklar.Arama sonuçtaki ilk ilan incelenir. İlk ilanda aracın marka, seri, model, başlık, yıl, km ve renk bilgisinin null olarak gelmediği kontrol edildi. Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada otomobil kategorisine tıklanınca açılan sayfanın page classı **OtomobilPage.java**. Otomobil sayfasında "bu kategorideki tüm ilanlar" tıklandığında açılan sayfanın page classı **OtoTumIlanlar.java**. Kontrolü OtoTumIlanlar page classının checkNull()metoduyla yaptım.  </sup>
<br/>
<br/>
<sup> -**OtomobilTest3.java**: Kullanıcı anasayfada “otomobil” kategorisine tıklar.“Bu kategorideki tüm ilanlar” menüsüne tıklar.Soldaki adres menüsünde “İl”e tıklandığında, il sayısının 0 olmadığı  kontrol edilir. Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada otomobil kategorisine tıklanınca açılan sayfanın page classı **OtomobilPage.java**. Otomobil sayfasında "bu kategorideki tüm ilanlar" tıklandığında açılan sayfanın page classı **OtoTumIlanlar.java**. Bu casein kontrolünü OtoTumIlanlar page classının checkIlSayisi() metoduyla yaptım. Bu metodun algortiması il sayısını 83 olarak hesapladı (İstanbul tümü'nün yanında İstanbul Anadolu ve İstanbul Avrupa olduğu için). Assertion ile algoritmanın hesapladığı il sayısının sıfır olup olmadığını kontrol ettim. </sup>
<br/>
<br/>
<sup> -**OtomobilTestCase4.java**: Anasayfada "otomobil" menüsüne tıklanır."Bu kategorideki tüm ilanlar" tıklanır.Sayfadaki ilk ilana tıklanır.ilan detay sayfasındaki URL deki ilan no ile ilan detaydaki ilan no'nun aynı olduğu kontrol edilir.Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada otomobil kategorisine tıklanınca açılan sayfanın page classı **OtomobilPage.java**. Otomobil sayfasında "bu kategorideki tüm ilanlar" tıklandığında açılan sayfanın page classı **OtoTumIlanlar.java**. Tıklanan ilanın detayının görüntüleyen page classı **OtomobilDetayPage**. Bu casein kontrolünü OtomobilDetayPage page classının checkUrl() metoduyla sağladım. Kodda metod açıklamasına algoritma ile ilgili comment geçtim.</sup>
<br/>
<br/>
<sup> -**PopülerAramaTest.java**: Kullanıcı anasayfada scroll yapar. Anasayfadaki 'Popüler Aramalar' daki 1. kategoriye tıklanır.Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir. Aynı senaryo dğer 4 popüler arama kategorisi için uygulanır.1. popüler arama kategorisi yani iphone12 mini tıklanır. Arama sonuçtaki sol menüdeki kategori isminin tıkladığımız kategori ismi ile eşleştiği kontrol edilir. Anasayfaya geri dönülür.Kodun devamında diğer 4 kategori için aynı senaryoyu tekrarladım. Anasayfa ekranının page class'ı **HomePage.java**. Popüler arama kategorisi tıklandığında açılan sayfanın page classı **PopulerArama.java**. Bu casein kontrolünü PopülerArama page classının checkEslesme() metoduyla yaptım, metodun algoritması kodda bu metodun commentlerindedir. </sup>
<br/>
<br/>
<sup> -**AlisverisLogin.java**: Login olmamış bir şekilde sahibinden.com sitesini gezen bir kullanıcı “ikinci el ve sıfır alışveriş”e tıklar.Açılan sayfada “Tüm vitrin ilanlarını göster”e tıklar.Bu sayfadaki ilk ilana tıklar.“Favorilerime ekle”ye tıklar."İlanı favorilerinize eklemek için giriş yapın” başlıklı bir frame açılır.Kullanıcı login olur. Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada alışveriş kategorisi tıklandığında açılan sayfanın page classı **AlisverisPage.java**. Bu sayfada "Tüm vitrin ilanlarını göster" tıklandıktan sonra açılan alışveriş vitrin sayfasının page classı **AlisverisVitrinPage.java**.Bu sayfada ilan tıklandıktan sonra açılan alışveriş ilan detay sayfasının page classı **AlisverisIlanPage.java**.İlan favoriler eklenmek istediğinde açılan login frameinin page classı **LoginFrame.java**.  </sup>
<br/>
<br/>
<sup> -**MesajLogin.java**: Login olmamış bir şekilde sahibinden.com sitesini gezen bir kullanıcı “Emlak”a tıklar. Açılan sayfada “Tüm vitrin ilanlarını göster”e tıklar. Bu sayfadaki ilk ilana tıklar.“Mesaj Gönder”e tıklar. "Mesaj göndermek için giriş yapın” başlıklı bir frame açılır.Kullanıcı login olur.Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada emlak kategorisi tıklandığında açılan sayfanın page classı **EmlakVitrinPage.java**. Bu sayfadaki ilk ilana tıkladığımızda açılan emlak ilanının detayının page classı **EmlakIlanPage.java**. Mesaj gönderilmek istediğinde açılan login frameinin page classı **LoginFrame.java**. </sup>
<br/>
<br/>
<sup> -**IlanVermeTest.java**: Kullanıcı "Hayvanlar Alemi" kategorisinde ilan verir, alt kategori olarak "Evcil Hayvanlar" seçilir. Bunun alt kategorisi olarak "Kedi" seçilir, "Kedi"nin alt kategorisi olarak "American Shorthair" seçilir. Anasayfa ekranının page class'ı **HomePage.java**. Anasayfada "giriş yap" butonu tıklanır, açılan login ekranının page classı **LoginPage.java**. Login olduktan sonra açılan ekranın page classı **IlanVer.java**. Bu ekranda "ücretsiz ilan ver" butonu tıklanır. Kullanıcı ilan kategorisi seçme sayfasına yönlendirilir. Bu sayfanın page classı **KategoryPage.java**. Kullanıcı bu sayfada "hayvanlar alemi" kategorisini seçer. Kategori seçimi yapıldıktan sonra alt kategorilerin olduğu sayfaya yönlendirme yapılır. Bu sayfanın page classı **AltKategori.java**. Bu sayfada sırasıyla "Evcil Hayvanlar", "Kedi" , "American shorthair" alt kategorileri seçilir.Devam butonu tıklanır, ilan detay sayfasına yönlendirme yapılır. İlan detay sayfasının page classı **IlanVermeDetay.java**. Kullanıcı bu sayfada başlık ve açıklama yazar. Evcil hayvanın yaş, cinsiyet, şehir, ilçe, mahalle seçimini yapar, ilan verme kuralları checklenir. Devam et'e basar.İlan önizleme sayfasına yönlendirme yapılır. İlan önizleme sayfasının page classı **OnizlemePage.java**. Devam et'e basar. Doping sayfasına yönlendirme yapılır.Doping sayfasının page classı **DopingPage.java**. Burada doping alınmadan "devam et" butonu tıklanır. Tebrikler sayfasına yönlendirme olur. Tebrikler sayfasının page classı **SuccessPage.java**. Kullanıcı burada "bana özele git" butonuna tıklar.  </sup>
<br/>
<br/>
<sup> -**AramaTest.java**: Kullanıcı anasayfada "Detaylı Arama"ya tıklar. Açılan sayfada kategori olarak emlak tıklanır.Şehir olarak İstanbul-tümü seçilir. Min fiyat olarak 1000000 girilir. Max fiyat olarak 10000000 girilir. Arama butonu tıklanır. Anasayfa ekranının page class'ı **HomePage.java**. Detaylı arama tıklandıktan sonra açılan sayfanın page classı **SearchPage.java**. </sup>
<br/>
<br/>

## Test classlarının çalıştırılması sonrası bulguları: (tbların patlama ihtimaline karşılık ekledim)
<img width="343" alt="OtomobilTest1" src="https://user-images.githubusercontent.com/36036370/202979071-69821787-4257-4cf8-98f5-d8a480a7b689.png">
<br/>
<br/>
<img width="342" alt="OtomobilTestCase2" src="https://user-images.githubusercontent.com/36036370/202979097-1d8c7ccb-2730-4263-ae8a-5af3235e0b05.png">
<br/>
<br/>
<img width="346" alt="OtomobilTest3" src="https://user-images.githubusercontent.com/36036370/202979113-4947f19d-64aa-458b-9436-b9445b4f6d87.png">
<br/>
<br/>
<img width="349" alt="OtomobilTestCase4" src="https://user-images.githubusercontent.com/36036370/202979137-30dd3432-24ca-4319-9ca2-d3cfccb4f0e7.png">
<br/>
<br/>
<img width="348" alt="PopulerArama" src="https://user-images.githubusercontent.com/36036370/202980252-8cb89244-05b6-4b81-b4c1-fb7195e01310.png">
<br/>
<br/>
<img width="346" alt="alisverislogin" src="https://user-images.githubusercontent.com/36036370/202979201-d5229435-735d-4bb6-ad24-d01f8b433a2a.png">
<br/>
<br/>
<img width="350" alt="mesajlogin" src="https://user-images.githubusercontent.com/36036370/202979221-ea4aa969-d196-4053-b2e9-cf8c972eba82.png">
<br/>
<br/>
<img width="349" alt="ilanvermetest" src="https://user-images.githubusercontent.com/36036370/202979252-d7839dea-76ce-4141-9554-7ec8d70eaf6d.png">
<br/>
<br/>
<img width="345" alt="aramatest" src="https://user-images.githubusercontent.com/36036370/202979262-d50dfd5b-635d-42fa-bdf6-7330002d3edb.png">
<br/>
<br/>
