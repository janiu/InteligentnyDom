import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Radio implements Uslugi {
	private Boolean wlaczony;
	private double czestotliwosc;
	private int glosnosc;

	public Radio() {
		wlaczony = false;
		czestotliwosc = 104.1;
		glosnosc = 12;
	}

	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = true;
		label.setIcon(new ImageIcon("img/radioOn.png"));
		panel.add(label);
	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = false;
		label.setIcon(new ImageIcon("img/radioOff.png"));
		panel.add(label);
	}

	public void ustawKanal(double czestotliwosc) {
		this.czestotliwosc = czestotliwosc;
	}

	public void ustawGlosnosc(int glosnosc) {
		this.glosnosc = glosnosc;
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
