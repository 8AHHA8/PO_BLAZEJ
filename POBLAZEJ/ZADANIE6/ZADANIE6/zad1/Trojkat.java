package nomp;

public class Trojkat extends Figura
{
	private double wys = 0;
	private double podst = 0;

	public Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(Punkt punkt, String kolor, double wys, double podst) {
		super(punkt, kolor);
		this.wys = wys;
		this.podst = podst;
	}


	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public double getWys() {
		return wys;
	}

	public void setWys(double wys) {
		this.wys = wys;
	}

	public double getPodst() {
		return podst;
	}

	public void setPodst(double podst) {
		this.podst = podst;
	}

	@Override
	public String opis() {
		return super.opis();
	}

}