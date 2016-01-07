
public class Oswietlenie implements Uslugi {
	private Boolean wlPokoj;
	private Boolean wlSalon;
	private Boolean wlLazienka;
	private Boolean wlKuchnia;

	@Override
	public void wlaczFunkcje() {
		wlPokoj = true;
		wlSalon = true;
		wlKuchnia = true;
		wlLazienka = true;
	}

	@Override
	public void wylaczFunkcje() {
		wlPokoj = false;
		wlSalon = false;
		wlKuchnia = false;
		wlLazienka = false;
	}

	public void ustawTemperature(Pokoj nazwa, Boolean stan) {
		if (nazwa == Pokoj.POKOJ)
			wlPokoj = stan;
		else if (nazwa == Pokoj.SALON)
			wlSalon = stan;
		else if (nazwa == Pokoj.KUCHNIA)
			wlKuchnia = stan;
		else if (nazwa == Pokoj.LAZIENKA)
			wlLazienka = stan;
	}

	public Boolean getWlPokoj() {
		return wlPokoj;
	}

	public void setWlPokoj(Boolean wlPokoj) {
		this.wlPokoj = wlPokoj;
	}

	public Boolean getWlSalon() {
		return wlSalon;
	}

	public void setWlSalon(Boolean wlSalon) {
		this.wlSalon = wlSalon;
	}

	public Boolean getWlLazienka() {
		return wlLazienka;
	}

	public void setWlLazienka(Boolean wlLazienka) {
		this.wlLazienka = wlLazienka;
	}

	public Boolean getWlKuchnia() {
		return wlKuchnia;
	}

	public void setWlKuchnia(Boolean wlKuchnia) {
		this.wlKuchnia = wlKuchnia;
	}

	
}
