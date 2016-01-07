import javax.swing.JLabel;
import javax.swing.JPanel;

public class Klimatyzacja implements Uslugi{

	private Boolean wlaczona;
	private double temperatura;
	
	public Klimatyzacja() {
		temperatura=18.0;
		wlaczona=false;
	}
	@Override
	public void wlaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczona=true;
	}

	@Override
	public void wylaczFunkcje(JPanel panel, JLabel label, Pokoj nazwa) {
		wlaczona=false;
	}
	
	public void ustawTemperature( double temperatura){
		this.temperatura=temperatura;
	}

	public Boolean getWlaczona() {
		return wlaczona;
	}

	public void setWlaczona(Boolean wlaczona) {
		this.wlaczona = wlaczona;
	}
	public double getTemperatura() {
		return temperatura;
	}


}
