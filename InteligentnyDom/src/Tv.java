
public class Tv implements Uslugi{

	private Boolean wlaczony;
	private int kanal;
	private int glosnosc;
	
	@Override
	public void wlaczFunkcje() {
		wlaczony=true;
	}

	@Override
	public void wylaczFunkcje() {
		wlaczony=false;
	}
	
	public void ustawKanal(int kanal){
		this.kanal=kanal;
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

	public int getKanal() {
		return kanal;
	}

	public void setKanal(int kanal) {
		this.kanal = kanal;
	}

	public int getGlosnosc() {
		return glosnosc;
	}

	public void setGlosnosc(int glosnosc) {
		this.glosnosc = glosnosc;
	}
	
	

}
