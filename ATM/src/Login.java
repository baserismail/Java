
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap){
    String kullanici;
    String sifre;
    Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı: ");
        kullanici=scanner.nextLine();
        System.out.print("Şifre: ");
        sifre=scanner.nextLine();
        
        if(hesap.getKullanici().equals(kullanici)&&hesap.getSifre().equals(sifre)){
        return true;
        }
        else
        {
        return false;
        }
                
    
    }
}
