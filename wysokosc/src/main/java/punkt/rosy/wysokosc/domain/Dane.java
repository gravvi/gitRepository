package punkt.rosy.wysokosc.domain;

public class Dane  {
	private double dewPoint;
	private double temp;
	private double height;

	public Dane() {
		// TODO Auto-generated constructor stub
	}
	public Dane (double dewPoint, double temp){
		this.setDewPoint(dewPoint);
		this.setTemp(temp);
	}
	public double getDewPoint() {
		return dewPoint;
	}
	public double getHeight() {
		return height;
	}
	public double getTemp() {
		return temp;
	}
	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
}
