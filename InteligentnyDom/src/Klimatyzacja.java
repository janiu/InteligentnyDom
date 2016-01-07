
public class Klimatyzacja implements Uslugi{

	private Boolean wlaczona;
	private double tempPokoj;
	private double tempSalon;
	private double tempKuchnia;
	private double tempLazienka;
	
	@Override
	public void wlaczFunkcje() {
		wlaczona=true;
	}

	@Override
	public void wylaczFunkcje() {
		wlaczona=false;
	}
	
	public void ustawTemperature(Pokoj nazwa, double wartosc){
		if(nazwa==Pokoj.POKOJ)
			tempPokoj=wartosc;
		else if(nazwa==Pokoj.SALON)
			tempSalon=wartosc;
		else if(nazwa==Pokoj.KUCHNIA)
			tempKuchnia=wartosc;
		else if(nazwa==Pokoj.LAZIENKA)
			tempLazienka=wartosc;
		
	}

	public Boolean getWlaczona() {
		return wlaczona;
	}

	public void setWlaczona(Boolean wlaczona) {
		this.wlaczona = wlaczona;
	}

	public double getTempPokoj() {
		return tempPokoj;
	}

	public void setTempPokoj(double tempPokoj) {
		this.tempPokoj = tempPokoj;
	}

	public double getTempSalon() {
		return tempSalon;
	}

	public void setTempSalon(double tempSalon) {
		this.tempSalon = tempSalon;
	}

	public double getTempKuchnia() {
		return tempKuchnia;
	}

	public void setTempKuchnia(double tempKuchnia) {
		this.tempKuchnia = tempKuchnia;
	}

	public double getTempLazienka() {
		return tempLazienka;
	}

	public void setTempLazienka(double tempLazienka) {
		this.tempLazienka = tempLazienka;
	}	

}
