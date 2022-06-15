package nomp;

public class Figura {
	
	//pola metody i kontruktory
	protected Punkt punkt;
	protected String kolor = "bialy";
	
	public Figura(){
		punkt = new Punkt(0,0);
	}

	public Figura(String kolor){
		this.kolor=kolor;
	}

	public Figura(Punkt punkt){
		this.punkt=punkt;
	}

	public Figura(Punkt punkt, String kolor) {
		this.punkt = punkt;
		this.kolor = kolor;
	}

	public String getKolor(){
		return kolor;
	}

	public String opis(){
		return "Klasa Figura. Kolor obiektu: "+kolor;
	}

}
