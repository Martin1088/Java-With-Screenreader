package de.gruppe1.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 818);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 265, 443, 171);
		contentPane.add(panel);
		panel.setLayout(null);

		// Motorparameter eingeben

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 28, 443, 226);
		contentPane.add(panel_2);

		JLabel lblMotorparametereingabe = new JLabel("Motorparameter-Eingabe");
		lblMotorparametereingabe.setBounds(159, 11, 170, 14);
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
		inputStrom.setColumns(10);
		inputStrom.setBounds(277, 128, 120, 20);
		panel_2.add(inputStrom);

		inputSpannung = new JTextField();
		inputSpannung.setColumns(10);
		inputSpannung.setBounds(277, 97, 120, 20);
		panel_2.add(inputSpannung);

		inputDrehzahl = new JTextField();
		inputDrehzahl.setColumns(10);
		inputDrehzahl.setBounds(277, 47, 120, 20);
		panel_2.add(inputDrehzahl);

		inputDrehmoment = new JTextField();
		inputDrehmoment.setColumns(10);
		inputDrehmoment.setBounds(277, 72, 120, 20);
		panel_2.add(inputDrehmoment);

		JLabel lblWirkungsgradInProzent_1_1 = new JLabel("Cosinus (cos)");
		lblWirkungsgradInProzent_1_1.setBounds(37, 159, 180, 14);
		panel_2.add(lblWirkungsgradInProzent_1_1);

		inputCos = new JTextField();
		inputCos.setColumns(10);
		inputCos.setBounds(277, 156, 120, 20);
		panel_2.add(inputCos);

		JLabel lblWirkungsgradInProzent_1_1_1 = new JLabel("\u00DCbersetzung des Getriebes (i)");
		lblWirkungsgradInProzent_1_1_1.setBounds(37, 187, 180, 14);
		panel_2.add(lblWirkungsgradInProzent_1_1_1);

		inputGetriebe = new JTextField();
		inputGetriebe.setColumns(10);
		inputGetriebe.setBounds(277, 184, 120, 20);
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
		txtWirkungsgrad.setBounds(275, 117, 120, 20);
		panel.add(txtWirkungsgrad);
		txtWirkungsgrad.setColumns(10);

		txtVerlust = new JTextField();
		txtVerlust.setBounds(275, 86, 120, 20);
		panel.add(txtVerlust);
		txtVerlust.setColumns(10);

		txtAufnahme = new JTextField();
		txtAufnahme.setBounds(275, 36, 120, 20);
		panel.add(txtAufnahme);
		txtAufnahme.setColumns(10);

		txtAbgabe = new JTextField();
		txtAbgabe.setBounds(275, 61, 120, 20);
		panel.add(txtAbgabe);
		txtAbgabe.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 447, 443, 116);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		// ******************* Lastsimulation Welle ****************************
		JLabel lblNewLabel_1 = new JLabel("Nennwert: 5 Nm (1,0 Nm bis 6,0 Nm):");
		lblNewLabel_1.setBounds(50, 54, 225, 14);
		panel_1.add(lblNewLabel_1);

		txtNennwert = new JTextField();
		txtNennwert.setColumns(10);
		txtNennwert.setBounds(274, 51, 120, 20);
		panel_1.add(txtNennwert);

		JCheckBox checkboxKennlinie = new JCheckBox("Drehzahl an Last anpassen lt. Kennlinie");
		checkboxKennlinie.setBounds(50, 75, 344, 23);
		panel_1.add(checkboxKennlinie);

		JLabel lblLastsiumaltionWelle = new JLabel("Lastsiumaltion Welle");
		lblLastsiumaltionWelle.setBounds(173, 11, 148, 14);
		panel_1.add(lblLastsiumaltionWelle);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 587, 443, 116);
		contentPane.add(panel_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Strom in Amp\u00E8re:");
		lblNewLabel_1_1.setBounds(51, 39, 122, 14);
		panel_1_1.add(lblNewLabel_1_1);

		txtStromInAmpere = new JTextField();
		txtStromInAmpere.setColumns(10);
		txtStromInAmpere.setBounds(275, 36, 122, 20);
		panel_1_1.add(txtStromInAmpere);

		// ******************* Ausgabe Strom und Drehzahl****************************
		JLabel lblAusgabeStromUnd = new JLabel("Ausgabe Strom und Drehzahl");
		lblAusgabeStromUnd.setBounds(156, 11, 148, 14);
		panel_1_1.add(lblAusgabeStromUnd);

		JLabel lblNewLabel_1_1_1 = new JLabel("Drehzahl bei Last:");
		lblNewLabel_1_1_1.setBounds(51, 70, 122, 14);
		panel_1_1.add(lblNewLabel_1_1_1);

		txtDrehzahl = new JTextField();
		txtDrehzahl.setColumns(10);
		txtDrehzahl.setBounds(275, 67, 122, 20);
		panel_1_1.add(txtDrehzahl);

		// ******************* Button *******************
		JButton btnBerechne = new JButton("Berechne ben\u00F6tigten Strom");
		btnBerechne.setBounds(132, 737, 206, 31);
		btnBerechne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Berechne alle Felder

				// Motor
				// SewMotor motor = new SewMotor(drehzahl, newtonmeter, spannung, strom, cos,
				// uebersetzungDesGetriebes);
				SewMotor motor = new SewMotor(
						// Alle Werte von Text zu double casten
						Double.parseDouble(inputDrehzahl.getText()), Double.parseDouble(inputDrehmoment.getText()),
						Double.parseDouble(inputSpannung.getText()), Double.parseDouble(inputStrom.getText()),
						Double.parseDouble(inputCos.getText()), Double.parseDouble(inputGetriebe.getText()));

				// Das Motorobjekt zum berechnen der Formeln übergeben

				// Starte die Berechnungen
				Formeln formelClass = new Formeln();
				double leistungsaufnahme = formelClass.berechneLeistungsaufnahme(motor.getSpannung(), motor.getStrom());
				txtAufnahme.setText(String.valueOf(leistungsaufnahme));

				double leistungsabgabe = formelClass.berechneLeistungsabgabe(motor.getDrehmoment(),
						motor.getDrehzahl());
				txtAbgabe.setText(String.valueOf(leistungsabgabe));

				double verlustLeistung = formelClass.berechneVerlustleistung();
				txtVerlust.setText(String.valueOf(verlustLeistung));

				double wirkungsgrad = formelClass.berechneWirkungsgradInProzent();
				txtWirkungsgrad.setText(String.valueOf(wirkungsgrad));

			}

		});
		contentPane.add(btnBerechne);

	}

	private void calculate() {

	}
}
