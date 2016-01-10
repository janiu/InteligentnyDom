import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tv implements Uslugi {

	private Boolean wlaczony;
	private int kanal;
	private int glosnosc;

	public Tv() {
		wlaczony = false;
		kanal = 1;
		glosnosc = 15;
	}

	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = true;
		label.setIcon(new ImageIcon("img/tvOn.png"));
		//panel.add(label);

	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczony = false;
		label.setIcon(new ImageIcon("img/tvOff.png"));
		//panel.add(label);
	}

	public void ustawKanal(int kanal) {
		this.kanal = kanal;
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
