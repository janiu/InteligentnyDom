import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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
	Oswietlenie oswietlenie = new Oswietlenie(false,false,false,false);
	Tv tv = new Tv();
	Drzwi drzwi = new Drzwi();
	Radio radio=new Radio();
	Alarm alarm=new Alarm();
	Zabezpieczenie zabezpieczenie=new Zabezpieczenie();
	Klimatyzacja klimatyzacja=new Klimatyzacja();

	
	

	
	
	
	
	public PanelAdministracyjny() {
		oswietlenie.setWlSalon(false);
		
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame=new JFrame();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0, 896, 781);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pokoj = new JPanel();
		pokoj.setBackground(Color.YELLOW);
		pokoj.setBounds(350, 0, 350, 350);
		frame.getContentPane().add(pokoj);
		
		JLabel zarowkaPokoj = new JLabel("");
		zarowkaPokoj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oswietlenie.ustawOswietlenie(pokoj, zarowkaPokoj, Pokoj.POKOJ);
			}
		});
		zarowkaPokoj.setIcon(new ImageIcon("img/zarowka.png"));
		pokoj.add(zarowkaPokoj);
		
		JLabel radioLabel = new JLabel("");
		radioLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(radio.getWlaczony()){
					radio.wylaczFunkcje(pokoj, radioLabel, null);
				}
				else radio.wlaczFunkcje(pokoj, radioLabel, null);
			}
		});
		radioLabel.setIcon(new ImageIcon("img/radioOff.png"));
		pokoj.add(radioLabel);
		
		// *******************   slider do radia
		JSlider sliderRadioCzest = new JSlider();
		
		sliderRadioCzest.setMaximum(110);
		sliderRadioCzest.setPaintTrack(true);
		sliderRadioCzest.setSnapToTicks(true);
		sliderRadioCzest.setMinorTickSpacing(1);
		sliderRadioCzest.setValue(100);
		sliderRadioCzest.setPaintTicks(true);
		sliderRadioCzest.setPaintLabels(true);
		sliderRadioCzest.setMinimum(90);
	
		Hashtable labelTable = new Hashtable();
		labelTable.put( new Integer( 90 ), new JLabel("90") );
		labelTable.put( new Integer( 100 ), new JLabel("100") );
		labelTable.put( new Integer( 110 ), new JLabel("110") );
		sliderRadioCzest.setLabelTable( labelTable );

		pokoj.add(sliderRadioCzest);
		
		sliderRadioCzest.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				radio.setCzestotliwosc(sliderRadioCzest.getValue());
			}
		});
		//*****************************************
		
		JPanel salon = new JPanel();
		salon.setBackground(Color.BLUE);
		salon.setBounds(0, 0, 350, 350);
		frame.getContentPane().add(salon);
		JLabel zarowkaSalon = new JLabel("");
		zarowkaSalon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oswietlenie.ustawOswietlenie(salon, zarowkaSalon, Pokoj.SALON);
			}
		});
		
		zarowkaSalon.setIcon(new ImageIcon("img/zarowka.png"));
		salon.add(zarowkaSalon);
		
		JLabel tvLabel = new JLabel("");
		tvLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		tvLabel.setIcon(new ImageIcon("img/tvOff.png"));
		
		
		tvLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(tv.getWlaczony()){
					tv.wylaczFunkcje(salon, tvLabel, null);
				}
				else tv.wlaczFunkcje(salon, tvLabel, null);
			}
		});
		
		salon.add(tvLabel);
		
		
		
		
		// *******************   slider do tv kanalow
		JSlider sliderTvKan = new JSlider();
				
		sliderTvKan.setMaximum(100);
		sliderTvKan.setPaintTrack(true);
		sliderTvKan.setSnapToTicks(true);
		sliderTvKan.setMinorTickSpacing(1);
		sliderTvKan.setValue(1);
		sliderTvKan.setPaintTicks(true);
		sliderTvKan.setPaintLabels(true);
		sliderTvKan.setMinimum(1);
			
				Hashtable labelTableTv = new Hashtable();
				labelTableTv.put( new Integer( 1 ), new JLabel("1") );
				labelTableTv.put( new Integer( 50 ), new JLabel("50") );
				labelTableTv.put( new Integer( 100 ), new JLabel("100") );
				sliderTvKan.setLabelTable( labelTableTv );

				salon.add(sliderTvKan);
				
				sliderTvKan.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						tv.setKanal(sliderTvKan.getValue());
					}
				});
		//*****************************************
				
		
		JPanel lazienka = new JPanel();
		lazienka.setBackground(Color.GREEN);
		lazienka.setBounds(0, 350, 350, 350);
		frame.getContentPane().add(lazienka);
		
		JLabel zarowkaLazienka = new JLabel("");
		zarowkaLazienka.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oswietlenie.ustawOswietlenie(lazienka, zarowkaLazienka, Pokoj.LAZIENKA);
			}
		});
		zarowkaLazienka.setIcon(new ImageIcon("img/zarowka.png"));		
		lazienka.add(zarowkaLazienka);
		
		JPanel kuchnia = new JPanel();
		kuchnia.setBackground(Color.PINK);
		kuchnia.setBounds(350, 350, 350, 350);
		frame.getContentPane().add(kuchnia);
		
		JLabel zarowkaKuchnia = new JLabel("");
		zarowkaKuchnia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oswietlenie.ustawOswietlenie(kuchnia, zarowkaKuchnia, Pokoj.KUCHNIA);
			}
		});
		zarowkaKuchnia.setIcon(new ImageIcon("img/zarowka.png"));	
		kuchnia.add(zarowkaKuchnia);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(700, 0, 100, 200);
		frame.getContentPane().add(panel);
		
		
		
		//****************************************
		List<JPanel> panele = new ArrayList<>();
		List<JLabel> label = new ArrayList<>();
		List<Uslugi> uslugi = new ArrayList<>(); 
		panele.add(salon);
		panele.add(pokoj);
		panele.add(kuchnia);
		panele.add(lazienka);
		panele.add(panel);
		label.add(tvLabel);						
		label.add(zarowkaSalon);
		label.add(zarowkaPokoj);
		label.add(radioLabel);
		label.add(zarowkaKuchnia);
		label.add(zarowkaLazienka);
		uslugi.add(tv);
		uslugi.add(oswietlenie);
		uslugi.add(radio);
		uslugi.add(drzwi);
		uslugi.add(alarm);
		
		//*****************************************
		
		JButton btnZabezpiecz = new JButton("Zabezpiecz");
		btnZabezpiecz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				zabezpieczenie.wlaczFunkcje(panele, label, uslugi);
				
			}
		});
		btnZabezpiecz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
		//*****************************************
		JLabel drzwiLabel = new JLabel("");
		drzwiLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(drzwi.getOtwarte());
				if(!drzwi.getOtwarte()){
					drzwi.wlaczFunkcje(panel, drzwiLabel, null);
				}
				else drzwi.wylaczFunkcje(panel, drzwiLabel, null);
			}
		});
		drzwiLabel.setIcon(new ImageIcon("img/otwarte.png"));
		label.add(drzwiLabel);
		
		
		JLabel alarmLabel = new JLabel("");
		alarmLabel.setIcon(new ImageIcon("img/alarmOff.png"));
		label.add(alarmLabel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(btnZabezpiecz);
		panel.add(alarmLabel);
		panel.add(drzwiLabel);
	}
}
