# Login Fonksiyon Kontrolü
# Önce Siteye git
# Login bilgilerini gir(username password sendkeys)
# Sonra giriş yaptığını kontrol et(verify,Assert)


  Feature: Login Functionality


    Scenario: : Login with valid username and password


      Given Navigate to Campus
      When Enter uername and password and click login button
      Then User should login succesfully