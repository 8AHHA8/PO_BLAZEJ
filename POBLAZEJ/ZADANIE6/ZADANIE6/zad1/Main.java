package nomp;

public class Main {
    public static void main(String[] args) {
        Punkt pkt1 = new Punkt();
        Punkt pkt2 = new Punkt(5, 8);
        Figura f1 = new Figura();
        Trojkat t1 = new Trojkat( 8, 10);
        Prostokat p1 = new Prostokat(8, 8);
        Prostokat p2 = new Prostokat(new Punkt(1, 1), "bialy", 4, 2);
        Kwadrat k1 = new Kwadrat(4);


        pkt1.opis();
        pkt1.przesun(4, 5);
        pkt1.opis();

        pkt2.opis();
        pkt2.przesun(6, 3);
        pkt2.opis();

        System.out.println(f1.opis());
        System.out.println(p1.getPowierzchnia());

        p2.przesun(3, 5);
        System.out.println(p2.opis());

        pkt1.opis();
        pkt2.opis();
        f1.opis();
        t1.opis();
        p1.opis();
        p2.opis();
        k1.opis();



    }


}
