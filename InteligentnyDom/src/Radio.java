
public class Radio implements Uslugi{
	private Boolean wlaczony;
	private double czestotliwosc;
	private int glosnosc;
	
	@Override
	public void wlaczFunkcje() {
		wlaczony=true;
	}

	@Override
	public void wylaczFunkcje() {
		wlaczony=false;
	}
	
	public void ustawKanal(double czestotliwosc){
		this.czestotliwosc=czestotliwosc;
	}
	
	public void ustawGlosnosc(int glosnosc){
		this.glosnosc=glosnosc;
	}

	public Boolean getWlaczony() {
		return wlaczony;
	}

	public void setWlaczony(Boolean wlaczony) {
		this.wlaczony = wlaczony;
	}

	public double getCzestotliwosc() {
		return czestotliwosc;
	}

	public void setCzestotliwosc(double czestotliwosc) {
		this.czestotliwosc = czestotliwosc;
	}

	public int getGlosnosc() {
		return glosnosc;
	}

	public void setGlosnosc(int glosnosc) {
		this.glosnosc = glosnosc;
	}
	
	
}
