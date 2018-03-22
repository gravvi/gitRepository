package punkt.rosy.wysokosc.oblicz;

import org.springframework.stereotype.Component;

@Component
public class Oblicz33 {
	
	private  int temp ;
	private int dewP;
	private Oblicz33 dane;
	private Oblicz33 dane2;
	
	
	public int getDewP() {
		return dewP;
	}
	
	public int getTemp() {

		return temp;
	}
	
	public int oblicz33(int temp, int dewP) {
		
		int wynik = (temp - dewP) * 125;
		return wynik;
	}
	
	public int oblicz44() {
		dane2 = new Oblicz33();
		dane2.setTemp(35);
		dane2.setDewP(9);
		int wynik = dane2.oblicz33(dane2.getTemp(), dane2.getDewP());
		return wynik;
	}
	
	public void setDewP(int dewP) {
		this.dewP = dewP;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
}
