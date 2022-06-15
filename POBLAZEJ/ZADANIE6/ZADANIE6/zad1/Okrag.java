package nomp;

public class Okrag extends Figura{

    private Punkt srodek;
    private double promien;

    public Okrag() {
        this.promien = 0;
        this.srodek.x = 0;
        this.srodek.y = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public Okrag(Punkt punkt, String kolor, Punkt srodek, double promien) {
        super(punkt, kolor);
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien, 2);
    }

    public double getSrednica(){
        return 2*promien;
    }

    public void setPromien(double p){
        this.promien = p;
    }

    public boolean wSrodku(Punkt p){
        if(Math.pow((p.x + srodek.x), 2) + Math.pow((p.y + srodek.y), 2) <= Math.pow(promien, 2))
            return true;
        else
            return false;

    }

}
