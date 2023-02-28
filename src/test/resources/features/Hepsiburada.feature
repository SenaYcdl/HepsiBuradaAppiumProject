@HepsiBurada
Feature: Hepsiburada Mobil Uygulamasi
  Scenario: Hepsiburada Mobil Uygulamasi ile Sepete Bilgisayar Ekleme
    Given app yuklesin
    And kullanici ana sayfada oldugunu dogrular
    And kullanici "Kategoriler" butonuna tiklar
    And kullanici "Telefon,Bilgisayar ve Elektronik" butonuna tiklar
    Then kullanici "Bilgisayar ve Aksesuarlari" butonuna tiklar
    And kullanici "Dizustu Bilgisayarlar" butonuna tiklar
    And kullanici sayfayi asagi kaydirip "Filtrele" secenegine tiklar
    And kullanici "Marka" tiklar
    Then kullanici "Monster" secer
    And kullanici ilk cikan urunu sepete ekler
    And kullanici sepetindeki urunun gorunurlugunu dogrular