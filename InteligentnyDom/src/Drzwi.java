import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Drzwi implements Uslugi {
	private Boolean otwarte;

	public Drzwi() {
		otwarte = true;
	}

	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		otwarte = true;
		label.setIcon(new ImageIcon("img/otwarte.png"));
		panel.add(label);
	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		otwarte = false;
		label.setIcon(new ImageIcon("img/zamkniete.png"));
		panel.add(label);
	}

	public Boolean getOtwarte() {
		return otwarte;
	}

	public void setOtwarte(Boolean zamkniete) {
		this.otwarte = zamkniete;
	}

}
