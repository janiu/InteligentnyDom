
public class Drzwi implements Uslugi{
	private Boolean zamkniete;

	@Override
	public void wlaczFunkcje() {
			zamkniete=true;
	}

	@Override
	public void wylaczFunkcje() {
			zamkniete=false;
	}

	public Boolean getZamkniete() {
		return zamkniete;
	}

	public void setZamkniete(Boolean zamkniete) {
		this.zamkniete = zamkniete;
	}
	
}
