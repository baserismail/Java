
public abstract class Cisim {
    private String sekil;

    public Cisim(String sekil) {
        this.sekil = sekil;
    }
    
    public void sekil_ismi(){
        System.out.println("Belirmiş olduğunuz cisim "+sekil+" dir... ");   
    }
    
abstract void alan_hesapla();

    public String getSekil() {
        return sekil;
    }

    public void setSekil(String sekil) {
        this.sekil = sekil;
    }

}