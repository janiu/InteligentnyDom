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
		temperatura=18.0;
		zmiana=0.0;
		random=new Random();
		df=new DecimalFormat("0.00");
	}
	
	public Temperatura(Klimatyzacja klimatyzacja, JLabel label) {
		this.klimatyzacja=klimatyzacja;
		this.label=label;
		zmiana=0.0;
		random=new Random();
		df=new DecimalFormat("0.00");
	}
	
	public void run(){
		while(true){
			
		if(klimatyzacja.getTemperatura()>=25.0)
		{
			System.out.println("Wlaczam klime");
			klimatyzacja.ustawTemperature(18.0);
		}
	
		zmiana=0.1+(random.nextDouble()*(1.0-0.1));
		
		try {
			Thread.sleep(1000);
			
			label.setText("Temp: "+df.format(klimatyzacja.getTemperatura()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		klimatyzacja.ustawTemperature(klimatyzacja.getTemperatura()+zmiana);
		
		}
	}

}
