
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Zabezpieczenie {

	Uslugi uslugi;
	String pin;

	public Zabezpieczenie() {
		pin = "1234";
	}

	public void wlaczFunkcje(List<JPanel> panele, List<JLabel> label, List<Uslugi> uslugi) {

		uslugi.get(0).wylaczFunkcje(panele.get(0), label.get(0), null);
		uslugi.get(1).wylaczFunkcje(panele.get(0), label.get(1), Pokoj.SALON);
		uslugi.get(1).wylaczFunkcje(panele.get(1), label.get(1), Pokoj.POKOJ);
		uslugi.get(2).wylaczFunkcje(panele.get(1), label.get(3), null);
		uslugi.get(1).wylaczFunkcje(panele.get(2), label.get(6), Pokoj.KUCHNIA);
		uslugi.get(1).wylaczFunkcje(panele.get(3), label.get(7), Pokoj.LAZIENKA);
		uslugi.get(3).wylaczFunkcje(panele.get(4), label.get(4), null);
		uslugi.get(4).wlaczFunkcje(panele.get(4), label.get(5), null);

		//uslugi.get(1).wlaczFunkcje(panele.get(3), label.get(7), null);
		// drzwi
		//alarm
		//zarowka kuchnia
		//zarowka lazienka
		
		for (JLabel l : label)
			l.setEnabled(false);

			label.get(5).setEnabled(true);
	}

	public void wylaczFunkcje(List<JPanel> panele, List<JLabel> label, List<Uslugi> uslugi) {
		for (JLabel l : label)
			l.setEnabled(true);
		
		uslugi.get(3).wlaczFunkcje(panele.get(4), label.get(4), null);
		uslugi.get(4).wylaczFunkcje(panele.get(4), label.get(5), null);
	}

	public boolean sprawdzPin(String pin) {
		if (this.pin.equals(pin)) {
			return true;
		} else {
			return false;
		}
	}

}
