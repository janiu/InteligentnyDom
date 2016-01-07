import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Oswietlenie implements Uslugi {
	private boolean wlPokoj;
	private boolean wlSalon;
	private boolean wlLazienka;
	private boolean wlKuchnia;

	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlPokoj = true;
		wlSalon = true;
		wlKuchnia = true;
		wlLazienka = true;
	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlPokoj = false;
		wlSalon = false;
		wlKuchnia = false;
		wlLazienka = false;
		label.setIcon(new ImageIcon("img/zarowka.png"));
		panel.add(label);
	}

	public void ustawOswietlenie(JPanel panel, JLabel label, Pokoj nazwa) {
		if (nazwa == Pokoj.POKOJ) {
			if (wlPokoj == true) {
				label.setIcon(new ImageIcon("img/zarowka.png"));
				wlPokoj = false;
			} else {
				label.setIcon(new ImageIcon("img/zarowka2.png"));
				wlPokoj = true;
			}
		} else if (nazwa == Pokoj.SALON) {
			if (wlSalon == true) {
				label.setIcon(new ImageIcon("img/zarowka.png"));
				wlSalon = false;
			} else {
				label.setIcon(new ImageIcon("img/zarowka2.png"));
				wlSalon = true;
			}
		} else if (nazwa == Pokoj.KUCHNIA) {
			if (wlKuchnia == true) {
				label.setIcon(new ImageIcon("img/zarowka.png"));
				wlKuchnia = false;
			} else {
				label.setIcon(new ImageIcon("img/zarowka2.png"));
				wlKuchnia = true;
			}
		} else if (nazwa == Pokoj.LAZIENKA) {
			if (wlLazienka == true) {
				label.setIcon(new ImageIcon("img/zarowka.png"));
				wlLazienka = false;
			} else {
				label.setIcon(new ImageIcon("img/zarowka2.png"));
				wlLazienka = true;
			}
		}
		panel.add(label);
	}

	public Oswietlenie(boolean wlPokoj, boolean wlSalon, boolean wlLazienka, boolean wlKuchnia) {
		super();
		this.wlPokoj = wlPokoj;
		this.wlSalon = wlSalon;
		this.wlLazienka = wlLazienka;
		this.wlKuchnia = wlKuchnia;
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
