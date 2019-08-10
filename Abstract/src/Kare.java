
public class Kare extends Cisim {
private int kenar;

    public Kare(int kenar, String sekil) {
        super(sekil);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getSekil()+" alanı: "+ (kenar*kenar));
    }
   
}
