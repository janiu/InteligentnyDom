import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;

public class PanelAdministracyjny {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelAdministracyjny window = new PanelAdministracyjny();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelAdministracyjny() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame=new JFrame();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0, 500, 500);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
					
						JPanel Salon = new JPanel();
						frame.getContentPane().add(Salon);
						ImagePane salonPane = new ImagePane(new File("img/salon.png"));
						salonPane.setBounds(0, 0, Salon.getWidth(), Salon.getHeight());
						Salon.add(salonPane);
				
						
						
						JPanel Pokoj = new JPanel();
						frame.getContentPane().add(Pokoj);
						ImagePane pokojPane = new ImagePane(new File("img/pokoj.png"), Pokoj.getWidth(), Pokoj.getHeight());
						pokojPane.setBounds(0, 0, Pokoj.getWidth(), Pokoj.getHeight());
						Pokoj.add(pokojPane);
				
				JPanel Lazienka = new JPanel();
				frame.getContentPane().add(Lazienka);
		
				JPanel Kuchnia = new JPanel();
				frame.getContentPane().add(Kuchnia);
				ImagePane kuchniaPane = new ImagePane(new File("img/kuchnia.png"), 100, 100);
				Kuchnia.add(kuchniaPane);
		
		JPanel Menu = new JPanel();
		frame.getContentPane().add(Menu);
	}

}
