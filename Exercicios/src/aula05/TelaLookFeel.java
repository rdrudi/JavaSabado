package aula05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import util.Configuracao;

import javax.swing.JSlider;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TelaLookFeel extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbTitulo;
	private JTabbedPane tabbedPane;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel lblNewLabel;
	private JTextField txtTextfield;
	private JComboBox<String> comboBox;
	private JButton btnNewButton;
	private JCheckBox chckbxNewCheckBox;
	private JRadioButton rdbtnNewRadioButton;
	private JTextArea txtrEsteUma;
	private JSlider slider;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracao.lookAndFeel("CDE/Motif");
					TelaLookFeel frame = new TelaLookFeel();
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
	public TelaLookFeel() {
		initComponents();
	}
	
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnTitulo.setBackground(SystemColor.activeCaption);
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Look & Feel");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pnTitulo.add(lbTitulo);
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel1 = new JPanel();
		tabbedPane.addTab("Painel 1", null, panel1, null);
		panel1.setLayout(null);
		
		lblNewLabel = new JLabel("Label 1:");
		lblNewLabel.setBounds(32, 38, 46, 14);
		panel1.add(lblNewLabel);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField");
		txtTextfield.setBounds(103, 35, 281, 20);
		panel1.add(txtTextfield);
		txtTextfield.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLookAndFeel();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CDE/Motif", "Metal", "Nimbus", "Windows", "Windows Classic"}));
		comboBox.setBounds(32, 81, 236, 24);
		panel1.add(comboBox);
		
		btnNewButton = new JButton("Bot\u00E3o");
		btnNewButton.setBounds(421, 34, 89, 23);
		panel1.add(btnNewButton);
		
		chckbxNewCheckBox = new JCheckBox("CheckBox");
		chckbxNewCheckBox.setBounds(310, 82, 97, 23);
		panel1.add(chckbxNewCheckBox);
		
		rdbtnNewRadioButton = new JRadioButton("Radio Button");
		rdbtnNewRadioButton.setBounds(421, 82, 109, 23);
		panel1.add(rdbtnNewRadioButton);
		
		txtrEsteUma = new JTextArea();
		txtrEsteUma.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtrEsteUma.setLineWrap(true);
		txtrEsteUma.setText("Este \u00E9 uma \u00E1rea para textos de m\u00FAltiplas linhas.");
		txtrEsteUma.setBounds(32, 128, 236, 108);
		panel1.add(txtrEsteUma);
		
		slider = new JSlider();
		slider.setBounds(310, 139, 200, 26);
		panel1.add(slider);
		
		progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setBounds(310, 199, 200, 14);
		panel1.add(progressBar);
		
		panel2 = new JPanel();
		tabbedPane.addTab("Painel 2", null, panel2, null);
	}
	
	private void setLookAndFeel() {
		String laf = comboBox.getSelectedItem().toString();
		Configuracao.lookAndFeel(laf);
		SwingUtilities.updateComponentTreeUI(this);
		this.repaint();
	}
	
}
