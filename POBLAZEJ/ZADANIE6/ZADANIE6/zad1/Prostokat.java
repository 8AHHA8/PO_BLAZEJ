package nomp;

import org.w3c.dom.ls.LSOutput;

public class Prostokat extends Figura  {

	private double wys = 0;
	private double szer = 0;
	
	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

	public Prostokat(Punkt punkt, String kolor, double wys, double szer) {
		super(punkt, kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;

	}

	public double getWys() {
		return wys;
	}

	public void setWys(double wys) {
		this.wys = wys;
	}

	public double getSzer() {
		return szer;
	}

	public void setSzer(double szer) {
		this.szer = szer;
	}

	public void przesun(double x, double y){
		this.punkt.x=x;
		this.punkt.y=y;
	}

	public double getPowierzchnia() {
		return wys * szer;
	}

//	public String wyswietlDane(){
//		return "wspolrzedna x: " + punkt.x +
//				"\nwspolrzedna y: " + punkt.y;
//	}


	@Override
	public String opis() {
		return "wspolrzedna x: " + punkt.x +
				"\nwspolrzedna y: " + punkt.y;
	}

}