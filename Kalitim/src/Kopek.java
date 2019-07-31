
public class Kopek extends Hayvan{
    private  int dis_sayisi;

    public Kopek(int dis_sayisi, String isim, int kilo, int boy, int bacak_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
     public void hareketEt(int hiz){
        System.out.println("Köpek "+ hiz+" hızında koşuyor..");
    }
    public void Kos(int hiz){
        System.out.println("Köpek koşuyor..");
        
        hareketEt(hiz);
    
    }
}
