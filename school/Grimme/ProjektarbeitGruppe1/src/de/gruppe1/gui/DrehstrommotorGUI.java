package de.gruppe1.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import de.gruppe1.calculation.Formeln;
import de.gruppe1.objects.SewMotor;

/**
 *
 * @author koma1114
 *
 */
public class DrehstrommotorGUI extends JFrame {

	private static final long serialVersionUID = -6761992379885266899L;

	private JPanel contentPane;
	private JTextField txtAbgabe;
	private JTextField txtAufnahme;
	private JTextField txtVerlust;
	private JTextField txtWirkungsgrad;
	private JTextField txtNennwert;
	private JTextField txtStromInAmpere;
	private JTextField txtDrehzahl;
	private JTextField inputStrom;
	private JTextField inputSpannung;
	private JTextField inputDrehzahl;
	private JTextField inputDrehmoment;
	private JTextField inputCos;
	private JTextField inputGetriebe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrehstrommotorGUI frame = new DrehstrommotorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public DrehstrommotorGUI() {
		this.show();
		this.setTitle("Drehstrommotor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(392, 28, 395, 226);
		contentPane.add(panel);
		panel.setLayout(null);

		// **************** Motorparameter eingeben ****************
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 28, 372, 226);
		contentPane.add(panel_2);

		JLabel lblMotorparametereingabe = new JLabel("Motorparameter-Eingabe");
		lblMotorparametereingabe.setBounds(109, 11, 170, 14);
		panel_2.add(lblMotorparametereingabe);

		JLabel lblSpannung = new JLabel("Drehzahl (n):");
		lblSpannung.setBounds(37, 50, 205, 14);
		panel_2.add(lblSpannung);

		JLabel lblLeistungsabgabeInKw_1 = new JLabel("Drehmoment (M):");
		lblLeistungsabgabeInKw_1.setBounds(37, 75, 180, 14);
		panel_2.add(lblLeistungsabgabeInKw_1);

		JLabel lblVerlustleistungInKw_1 = new JLabel("Spannung (U):");
		lblVerlustleistungInKw_1.setBounds(37, 100, 180, 14);
		panel_2.add(lblVerlustleistungInKw_1);

		JLabel lblWirkungsgradInProzent_1 = new JLabel("Strom (I):");
		lblWirkungsgradInProzent_1.setBounds(37, 131, 180, 14);
		panel_2.add(lblWirkungsgradInProzent_1);

		inputStrom = new JTextField();
		inputStrom.setText("");
		inputStrom.setColumns(10);
		inputStrom.setBounds(249, 128, 92, 20);
		panel_2.add(inputStrom);

		inputSpannung = new JTextField();
		inputSpannung.setText("");
		inputSpannung.setColumns(10);
		inputSpannung.setBounds(249, 97, 92, 20);
		panel_2.add(inputSpannung);

		inputDrehzahl = new JTextField();
		inputDrehzahl.setText("");
		inputDrehzahl.setColumns(10);
		inputDrehzahl.setBounds(249, 47, 92, 20);
		panel_2.add(inputDrehzahl);

		inputDrehmoment = new JTextField();
		inputDrehmoment.setText("");
		inputDrehmoment.setColumns(10);
		inputDrehmoment.setBounds(249, 72, 92, 20);
		panel_2.add(inputDrehmoment);

		JLabel lblWirkungsgradInProzent_1_1 = new JLabel("Cosinus (cos)");
		lblWirkungsgradInProzent_1_1.setBounds(37, 159, 180, 14);
		panel_2.add(lblWirkungsgradInProzent_1_1);

		inputCos = new JTextField();
		inputCos.setText("");
		inputCos.setColumns(10);
		inputCos.setBounds(249, 156, 92, 20);
		panel_2.add(inputCos);

		JLabel lblWirkungsgradInProzent_1_1_1 = new JLabel("\u00DCbersetzung des Getriebes (i)");
		lblWirkungsgradInProzent_1_1_1.setBounds(37, 187, 180, 14);
		panel_2.add(lblWirkungsgradInProzent_1_1_1);

		inputGetriebe = new JTextField();
		inputGetriebe.setText("");
		inputGetriebe.setColumns(10);
		inputGetriebe.setBounds(249, 184, 92, 20);
		panel_2.add(inputGetriebe);

		// **************** Nennwerte laut Leistungsschild *********************
		JLabel lblNennwerteLautLeistungsschild = new JLabel("Nennwerte laut Leistungsschild");
		lblNennwerteLautLeistungsschild.setBounds(154, 11, 185, 14);
		panel.add(lblNennwerteLautLeistungsschild);

		JLabel lblNewLabel = new JLabel("Leistungsaufnahme in kW:");
		lblNewLabel.setBounds(35, 39, 205, 14);
		panel.add(lblNewLabel);

		JLabel lblLeistungsabgabeInKw = new JLabel("Leistungsabgabe in kW:");
		lblLeistungsabgabeInKw.setBounds(35, 64, 180, 14);
		panel.add(lblLeistungsabgabeInKw);

		JLabel lblVerlustleistungInKw = new JLabel("Verlustleistung in kW:");
		lblVerlustleistungInKw.setBounds(35, 89, 180, 14);
		panel.add(lblVerlustleistungInKw);

		JLabel lblWirkungsgradInProzent = new JLabel("Wirkungsgrad in Prozent:");
		lblWirkungsgradInProzent.setBounds(35, 120, 180, 14);
		panel.add(lblWirkungsgradInProzent);

		txtWirkungsgrad = new JTextField();
		txtWirkungsgrad.setBounds(277, 117, 92, 20);
		panel.add(txtWirkungsgrad);
		txtWirkungsgrad.setColumns(10);

		txtVerlust = new JTextField();
		txtVerlust.setBounds(277, 86, 92, 20);
		panel.add(txtVerlust);
		txtVerlust.setColumns(10);

		txtAufnahme = new JTextField();
		txtAufnahme.setBounds(277, 36, 92, 20);
		panel.add(txtAufnahme);
		txtAufnahme.setColumns(10);

		txtAbgabe = new JTextField();
		txtAbgabe.setBounds(277, 61, 92, 20);
		panel.add(txtAbgabe);
		txtAbgabe.setColumns(10);

		// ******************* Lastsimulation Welle ****************************
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 265, 372, 116);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nennwert: 5 Nm (1,0 Nm bis 6,0 Nm):");
		lblNewLabel_1.setBounds(35, 40, 233, 14);
		panel_1.add(lblNewLabel_1);

		txtNennwert = new JTextField();
		txtNennwert.setColumns(10);
		txtNennwert.setBounds(253, 37, 91, 20);
		panel_1.add(txtNennwert);

		JCheckBox checkboxKennlinie = new JCheckBox("Drehzahl an Last anpassen lt. Kennlinie");
		checkboxKennlinie.setBounds(62, 72, 282, 23);
		panel_1.add(checkboxKennlinie);

		JLabel lblLastsiumaltionWelle = new JLabel("Lastsiumaltion Welle");
		lblLastsiumaltionWelle.setBounds(96, 12, 148, 14);
		panel_1.add(lblLastsiumaltionWelle);

		// ******************* Ausgabe Strom und Drehzahl****************************
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(392, 265, 395, 116);
		contentPane.add(panel_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Strom in Amp\u00E8re:");
		lblNewLabel_1_1.setBounds(51, 39, 122, 14);
		panel_1_1.add(lblNewLabel_1_1);

		txtStromInAmpere = new JTextField();
		txtStromInAmpere.setColumns(10);
		txtStromInAmpere.setBounds(277, 36, 92, 20);
		panel_1_1.add(txtStromInAmpere);

		JLabel lblAusgabeStromUnd = new JLabel("Ausgabe Strom und Drehzahl");
		lblAusgabeStromUnd.setBounds(120, 11, 189, 14);
		panel_1_1.add(lblAusgabeStromUnd);

		JLabel lblNewLabel_1_1_1 = new JLabel("Drehzahl bei Last:");
		lblNewLabel_1_1_1.setBounds(51, 70, 122, 14);
		panel_1_1.add(lblNewLabel_1_1_1);

		txtDrehzahl = new JTextField();
		txtDrehzahl.setColumns(10);
		txtDrehzahl.setBounds(277, 67, 92, 20);
		panel_1_1.add(txtDrehzahl);

		// ******************* Graph ****************************
//		JPanel graphPanel = new JPanel() {
//			@Override
//			protected void paintComponent(Graphics g) {
//				super.paintComponent(g);
//				// Zeichne die Grafik hier
//				g.setColor(Color.RED);
//				g.drawLine(0, 0, getWidth(), getHeight());
//				g.drawLine(0, getHeight(), getWidth(), 0);
//			}
//		};
//		graphPanel.setBounds(392, 408, 395, 211);
//		contentPane.add(graphPanel);

		// ******************* Button *******************
		JButton btnBerechne = new JButton("Berechne ben\u00F6tigten Strom");
		btnBerechne.setBounds(43, 408, 299, 86);
		btnBerechne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Ermittle Felder
				// Validierungsregel Nr. 3
				// Alle Kommas durch Punkte ersetzen bei der Eingabe
				String drehzahlStr = inputDrehzahl.getText().replace(",", ".");
				String drehmomentStr = inputDrehmoment.getText().replace(",", ".");
				String spannungStr = inputSpannung.getText().replace(",", ".");
				String stromStr = inputStrom.getText().replace(",", ".");
				String cosStr = inputCos.getText().replace(",", ".");
				String getriebeStr = inputGetriebe.getText().replace(",", ".");

				// ******** Validierungsregel Nr. 1 ********
				// Großer If-Block um Pflichtfelder abzufragen
				if (drehzahlStr.length() > 0 && drehmomentStr.length() > 0 && spannungStr.length() > 0
						&& stromStr.length() > 0 && cosStr.length() > 0 && getriebeStr.length() > 0) {

					// Initialisiere Werte nur, wenn Pflichtfelder gefüllt sind
					Double drehzahl = Double.parseDouble(drehzahlStr);
					Double drehmoment = Double.parseDouble(drehmomentStr);
					Double spannung = Double.parseDouble(spannungStr);
					Double strom = Double.parseDouble(stromStr);
					Double cos = Double.parseDouble(cosStr);
					Double getriebe = Double.parseDouble(getriebeStr);

					// Instanziieren des Motors
					SewMotor motor = new SewMotor(drehzahl, drehmoment, spannung, strom, cos, getriebe);

					// Das Motorobjekt zum berechnen der Formeln übergeben
					Formeln formelClass = new Formeln();
					double leistungsaufnahme = formelClass.berechneLeistungsaufnahme(motor.getSpannung(),
							motor.getStrom());
					String leistungsaufnahmeString = String.valueOf(leistungsaufnahme);
					// nur 4 nachkommastellen
					txtAufnahme.setText(leistungsaufnahmeString.substring(0, 6));

					// Berechnung der Leistungsabgabe
					double leistungsabgabe = formelClass.berechneLeistungsabgabe(motor.getDrehmoment(),
							motor.getDrehzahl(), motor.getUebersetzungDesGetriebes());
					// Double wert zu String casten
					String leistungsabgabeString = String.valueOf(leistungsabgabe);
					// Substring um Nachkommastellen abzuschneiden
					txtAbgabe.setText(leistungsabgabeString.substring(0, 6));

					double verlustLeistung = formelClass.berechneVerlustleistung();
					// Double wert zu String casten
					String verlustLeistungString = String.valueOf(verlustLeistung);
					// Substring um Nachkommastellen abzuschneiden
//					if (verlustLeistung >= 1.0) {
					txtVerlust.setText(verlustLeistungString.substring(0, 6));
//					} else {
//						JOptionPane.showMessageDialog(contentPane, "Verlustleistung darf nicht kleiner, als 1.0 sein!",
//								"Negative Verlustleistung", JOptionPane.ERROR_MESSAGE);
//					}

					double wirkungsgrad = formelClass.berechneWirkungsgradInProzent();
					// Double wert zu String casten
					String wirkungsgradString = String.valueOf(wirkungsgrad);
					// Substring um Nachkommastellen abzuschneiden
//					if (wirkungsgrad <= 1.0) {
					txtWirkungsgrad.setText(wirkungsgradString.substring(0, 6));
//					} else {
//						JOptionPane.showMessageDialog(contentPane, "Wirkungsgrad darf nicht kleiner, als 1.0 sein!",
//								"Negativer Wirkungsgrad", JOptionPane.ERROR_MESSAGE);
//					}

					// Strom und Drehzahl im letzten Panel neu berechnen
					// Nur wenn das Feld gefüllt ist
					if (txtNennwert.getText().length() > 0) {
						double nennwert = Double.parseDouble(txtNennwert.getText());
						if (nennwert >= 1 && nennwert <= 6) {
							txtStromInAmpere.setText(formelClass.berechneDrehzahlNeu(nennwert, spannung, cos).substring(0, 6));
							txtDrehzahl.setText(formelClass.berechneStromNeu(nennwert, spannung, cos).substring(0, 6));
						}

					}

				} else {
					// Wenn Pflichtfelder nicht erfüllt, Zeige den Fehler-Dialog
					JOptionPane.showMessageDialog(contentPane, "Es wurden nicht alle Pflichtfelder gefüllt!",
							"Ungültige Eingabe", JOptionPane.ERROR_MESSAGE);
				}

			}

		});
		contentPane.add(btnBerechne);

		this.repaint();
	}

}
