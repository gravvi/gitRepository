package punkt.rosy.wysokosc.oblicz;

import org.springframework.stereotype.Component;

import punkt.rosy.wysokosc.domain.Dane;

@Component
public class ObliczImpl implements Oblicz {
	static final double STALA = 125;
	
	/*public static double getDane() {
		Scanner sc = new Scanner(System.in);
		System.out.println("wprowadz temp powietrza");
		double in = sc.nextDouble();
		return in;
	}*/
	
	public static void main(String[] args) {
		Oblicz ob = new ObliczImpl();
		ob.oblicz();
	}
	
	@Override
	
	public double oblicz() {
		double temp1;
		double height;
		Dane dane = new Dane();
		dane.setTemp(6);
		dane.setDewPoint(-1.5);
		
		temp1 = dane.getTemp() - dane.getDewPoint();
		height = temp1 * STALA;
		dane.setHeight(height);
		System.out.println(dane.getHeight());
		height = dane.getHeight();
		return height;
	}
}
