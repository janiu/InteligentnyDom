import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JLabel;

public class Temperatura extends Thread {

	JLabel label;
	Klimatyzacja klimatyzacja;
	double temperatura;
	double zmiana;
	Random random;
	DecimalFormat df;

	public Temperatura() {
		temperatura = 18.0;
		zmiana = 0.0;
		random = new Random();
		df = new DecimalFormat("0.00");
	}

	public Temperatura(Klimatyzacja klimatyzacja, JLabel label) {
		this.klimatyzacja = klimatyzacja;
		this.label = label;
		zmiana = 0.0;
		random = new Random();
		df = new DecimalFormat("0.00");
	}

	public void run() {
		while (true) {

			zmiana = 0.1 + (random.nextDouble() * (1.0 - 0.1));
			
			if (klimatyzacja.getTemperatura() >= 25.0) {
				
				while(klimatyzacja.getTemperatura()>18.0)
				{
				klimatyzacja.setWlaczona(true);
				
				klimatyzacja.ustawTemperature(klimatyzacja.getTemperatura()-zmiana);
				
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					
					label.setText("Temp: " + df.format(klimatyzacja.getTemperatura()));
				
				}
			}

			klimatyzacja.setWlaczona(false);
			
			

			try {
				Thread.sleep(1500);

				label.setText("Temp: " + df.format(klimatyzacja.getTemperatura()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			klimatyzacja.ustawTemperature(klimatyzacja.getTemperatura() + zmiana);

		}
	}

}
