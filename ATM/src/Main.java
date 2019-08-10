
public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap= new Hesap("ismail", "1", 5000);
    // ikinci bir hesap eklemeye çalıştım olmadı. onun için daha gelişmiş bir sistem lazım.
    // normalde veritabanından bu işlemleri yaparız ama burada bir veri tabanımız yok
    // bunun yerine sınıfları kullanarak veritabanı benzeri bir şey yapabilir miyiz?
    // bir kaç tane hesap ekleyebilmek ve bunun kontrolünü yapabilmek için
      
        
        atm.calis(hesap);
        System.out.println("Sistemden çıktınız..");
    }
}
