import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Alarm implements Uslugi {

	private Boolean wlaczony;

	public Alarm() {
		wlaczony = false;
	}

	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = true;
		label.setIcon(new ImageIcon("img/alarmOn.png"));
		panel.add(label);
	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = false;
		label.setIcon(new ImageIcon("img/alarmOff.png"));
		panel.add(label);
	}

}
