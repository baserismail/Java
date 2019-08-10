
public class Daire extends Cisim{
private  int yariCap;

    public Daire(int yariCap, String sekil) {
        super(sekil);
        this.yariCap = yariCap;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getSekil()+" alanı: "+(Math.PI*yariCap*yariCap));
    }
    
}
