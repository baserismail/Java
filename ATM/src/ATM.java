
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
    Login login=new Login();
    
    Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoş geldiniz...");
        System.out.println("***********************************");
        int giris_hakki=3;
        while(true){
        if(login.login(hesap))
        {
            System.out.println("Giriiş başarılı..");
            break;
        }
        else{
            System.out.println("opps!! yanlış giriş");
            giris_hakki-=1;
            System.out.println("Kalan giriş hakkınız: "+giris_hakki);
        }
        if(giris_hakki==0){
            System.out.println("Giriş hakkınız bitti...");
        return;
        }
            System.out.println("***************************************");
        }
        String islemler="Yapmak istediğiniz işlemi seçiniz\n"+
                "1 - Bakiye Görüntüle\t"+
                "2 - Para Yatırma\n"+
                "q - Çıkış\t\t"+
                "3 - Para Çek\n";
        System.out.println(islemler);
        
        while(true){
            System.out.print("İşlem Seçiniz: ");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yaptınız.. Tekrar bekleriz..");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Hesap bakiyeniz: "+ hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatırmak istediğiniz miktar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
            
                System.out.print("Çekmek istediğiniz miktar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz seçenek");
            }
        }
    }
}
