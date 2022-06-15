package nomp;

public class Punkt {

    protected double x;
    protected double y; //pola klasy

    //konstruktor bezparametrowy
    public Punkt() {
        this.x=0;
        this.y=0;
    }

    //konstruktor parametrowy
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        this.x=0;
        this.y=0;
    }

    public void opis(){
        System.out.println("punkt o wspolrzednych: " +x +" " +y);
    }

    public void przesun(int x, int y){
        this.x += x;
        this.y += y;
    }

}
