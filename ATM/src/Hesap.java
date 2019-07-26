

public class Hesap {
    private String kullanici;
    private String sifre;
    private int bakiye;

    public Hesap(String kullanici, String sifre, int bakiye) {
        this.kullanici = kullanici;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int miktar){
          
        bakiye+=miktar;
        
        System.out.println("Yani bakiyeniz: "+bakiye);
    }
    
    public void paraCek(int miktar){
       
        if(miktar>bakiye){
            System.out.println("Yeterli bakiyeniz yok..");
            System.out.println("Mevcut bakiyeniz: "+ bakiye);
        }
        else{
        bakiye-=miktar;
            System.out.println("Kalan Bakiyeniz: "+bakiye);
        }
    }
                
}
