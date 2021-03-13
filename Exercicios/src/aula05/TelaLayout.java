package aula05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.SpringLayout;

public class TelaLayout extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbTitulo;
	private JTabbedPane tabbedPane;
	private JPanel pnBorder;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JPanel pnFlow;
	private JLabel lblNewLabel;
	private JTextField txtTextfield;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_1;
	private JTextField txtTextfield_1;
	private JButton btnNewButton_7;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton_8;
	private JPanel pnBox;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JPanel pnGroup;
	private JLabel lblNewLabel_4;
	private JTextField txtTextfield_2;
	private JLabel lblNewLabel_5;
	private JTextField txtTextfield_3;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JPanel pnGrid;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;
	private JPanel pnAbsolute;
	private JLabel lblNewLabel_6;
	private JTextField txtTextfield_4;
	private JLabel lblNewLabel_7;
	private JTextField txtTextfield_5;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JPanel pnSpring;
	private JLabel lblNewLabel_8;
	private JTextField textField;
	private JLabel lblNewLabel_9;
	private JTextField textField_1;
	private JButton btnNewButton_23;
	private JButton btnNewButton_24;
	private JButton btnNewButton_25;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLayout frame = new TelaLayout();
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
	public TelaLayout() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setBackground(new Color(218, 165, 32));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Gerenciadores de Layout");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pnTitulo.add(lbTitulo);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(211, 211, 211));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pnBorder = new JPanel();
		tabbedPane.addTab("Border", null, pnBorder, null);
		pnBorder.setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("North");
		pnBorder.add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("West");
		pnBorder.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("South");
		pnBorder.add(btnNewButton_2, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("East");
		pnBorder.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("Center");
		pnBorder.add(btnNewButton_4, BorderLayout.CENTER);
		
		pnFlow = new JPanel();
		tabbedPane.addTab("Flow", null, pnFlow, null);
		FlowLayout fl_pnFlow = new FlowLayout(FlowLayout.LEFT, 20, 30);
		pnFlow.setLayout(fl_pnFlow);
		
		lblNewLabel = new JLabel("Label 1");
		pnFlow.add(lblNewLabel);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField1");
		pnFlow.add(txtTextfield);
		txtTextfield.setColumns(10);
		
		btnNewButton_5 = new JButton("Bot\u00E3o 1");
		pnFlow.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Bot\u00E3o 2");
		pnFlow.add(btnNewButton_6);
		
		lblNewLabel_1 = new JLabel("Label 2");
		pnFlow.add(lblNewLabel_1);
		
		txtTextfield_1 = new JTextField();
		txtTextfield_1.setText("TextField2");
		pnFlow.add(txtTextfield_1);
		txtTextfield_1.setColumns(10);
		
		btnNewButton_7 = new JButton("Bot\u00E3o 3");
		pnFlow.add(btnNewButton_7);
		
		chckbxNewCheckBox = new JCheckBox("CheckBox1");
		pnFlow.add(chckbxNewCheckBox);
		
		btnNewButton_8 = new JButton("Bot\u00E3o 4");
		pnFlow.add(btnNewButton_8);
		
		pnBox = new JPanel();
		tabbedPane.addTab("Box", null, pnBox, null);
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		
		btnNewButton_9 = new JButton("Bot\u00E3o 1");
		pnBox.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Bot\u00E3o 2");
		pnBox.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Bot\u00E3o 3");
		pnBox.add(btnNewButton_11);
		
		lblNewLabel_2 = new JLabel("Label 1");
		pnBox.add(lblNewLabel_2);
		
		chckbxNewCheckBox_1 = new JCheckBox("CheckBox 1");
		pnBox.add(chckbxNewCheckBox_1);
		
		lblNewLabel_3 = new JLabel("Label 2");
		pnBox.add(lblNewLabel_3);
		
		btnNewButton_12 = new JButton("Bot\u00E3o 4");
		pnBox.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("Bot\u00E3o 5");
		pnBox.add(btnNewButton_13);
		
		pnGroup = new JPanel();
		tabbedPane.addTab("Group", null, pnGroup, null);
		
		lblNewLabel_4 = new JLabel("Label 1:");
		
		txtTextfield_2 = new JTextField();
		txtTextfield_2.setText("TextField 1");
		txtTextfield_2.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Label 2:");
		
		txtTextfield_3 = new JTextField();
		txtTextfield_3.setText("TextField 2");
		txtTextfield_3.setColumns(10);
		
		btnNewButton_14 = new JButton("Bot\u00E3o 1");
		
		btnNewButton_15 = new JButton("Bot\u00E3o 2");
		GroupLayout gl_pnGroup = new GroupLayout(pnGroup);
		gl_pnGroup.setHorizontalGroup(
			gl_pnGroup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnGroup.createSequentialGroup()
					.addGap(85)
					.addGroup(gl_pnGroup.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnGroup.createSequentialGroup()
							.addComponent(btnNewButton_14)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_15))
						.addGroup(gl_pnGroup.createSequentialGroup()
							.addGroup(gl_pnGroup.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5))
							.addGap(38)
							.addGroup(gl_pnGroup.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtTextfield_3)
								.addComponent(txtTextfield_2, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		gl_pnGroup.setVerticalGroup(
			gl_pnGroup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnGroup.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_pnGroup.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTextfield_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(37)
					.addGroup(gl_pnGroup.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTextfield_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_pnGroup.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_14)
						.addComponent(btnNewButton_15))
					.addGap(28))
		);
		pnGroup.setLayout(gl_pnGroup);
		
		pnGrid = new JPanel();
		tabbedPane.addTab("Grid", null, pnGrid, null);
		pnGrid.setLayout(new GridLayout(3, 2, 20, 10));
		
		btnNewButton_16 = new JButton("Bot\u00E3o 1");
		pnGrid.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("Bot\u00E3o 2");
		pnGrid.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("Bot\u00E3o 3");
		pnGrid.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("Bot\u00E3o 4");
		pnGrid.add(btnNewButton_19);
		
		btnNewButton_20 = new JButton("Bot\u00E3o 5");
		pnGrid.add(btnNewButton_20);
		
		pnAbsolute = new JPanel();
		tabbedPane.addTab("Absolute", null, pnAbsolute, null);
		pnAbsolute.setLayout(null);
		
		lblNewLabel_6 = new JLabel("Label 1:");
		lblNewLabel_6.setBounds(84, 51, 46, 14);
		pnAbsolute.add(lblNewLabel_6);
		
		txtTextfield_4 = new JTextField();
		txtTextfield_4.setText("TextField1");
		txtTextfield_4.setBounds(159, 48, 173, 20);
		pnAbsolute.add(txtTextfield_4);
		txtTextfield_4.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Label 2:");
		lblNewLabel_7.setBounds(84, 91, 46, 14);
		pnAbsolute.add(lblNewLabel_7);
		
		txtTextfield_5 = new JTextField();
		txtTextfield_5.setText("TextField2");
		txtTextfield_5.setBounds(159, 88, 173, 20);
		pnAbsolute.add(txtTextfield_5);
		txtTextfield_5.setColumns(10);
		
		btnNewButton_21 = new JButton("Bot\u00E3o 1");
		btnNewButton_21.setBounds(84, 148, 89, 23);
		pnAbsolute.add(btnNewButton_21);
		
		btnNewButton_22 = new JButton("Bot\u00E3o 2");
		btnNewButton_22.setBounds(243, 148, 89, 23);
		pnAbsolute.add(btnNewButton_22);
		
		pnSpring = new JPanel();
		tabbedPane.addTab("Spring", null, pnSpring, null);
		SpringLayout sl_pnSpring = new SpringLayout();
		pnSpring.setLayout(sl_pnSpring);
		
		lblNewLabel_8 = new JLabel("Label 1:");
		sl_pnSpring.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 47, SpringLayout.NORTH, pnSpring);
		pnSpring.add(lblNewLabel_8);
		
		textField = new JTextField();
		sl_pnSpring.putConstraint(SpringLayout.EAST, lblNewLabel_8, -17, SpringLayout.WEST, textField);
		sl_pnSpring.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNewLabel_8);
		textField.setText("TextField1");
		textField.setColumns(10);
		pnSpring.add(textField);
		
		lblNewLabel_9 = new JLabel("Label 2:");
		sl_pnSpring.putConstraint(SpringLayout.NORTH, lblNewLabel_9, 88, SpringLayout.NORTH, pnSpring);
		pnSpring.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		sl_pnSpring.putConstraint(SpringLayout.WEST, textField_1, 167, SpringLayout.WEST, pnSpring);
		sl_pnSpring.putConstraint(SpringLayout.EAST, lblNewLabel_9, -17, SpringLayout.WEST, textField_1);
		sl_pnSpring.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, textField_1);
		sl_pnSpring.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		sl_pnSpring.putConstraint(SpringLayout.NORTH, textField_1, -3, SpringLayout.NORTH, lblNewLabel_9);
		sl_pnSpring.putConstraint(SpringLayout.EAST, textField_1, -121, SpringLayout.EAST, pnSpring);
		textField_1.setText("TextField2");
		textField_1.setColumns(10);
		pnSpring.add(textField_1);
		
		btnNewButton_23 = new JButton("Bot\u00E3o 1");
		sl_pnSpring.putConstraint(SpringLayout.NORTH, btnNewButton_23, 44, SpringLayout.SOUTH, textField_1);
		sl_pnSpring.putConstraint(SpringLayout.WEST, btnNewButton_23, 112, SpringLayout.WEST, pnSpring);
		pnSpring.add(btnNewButton_23);
		
		btnNewButton_24 = new JButton("Bot\u00E3o 2");
		sl_pnSpring.putConstraint(SpringLayout.EAST, btnNewButton_23, -99, SpringLayout.WEST, btnNewButton_24);
		sl_pnSpring.putConstraint(SpringLayout.NORTH, btnNewButton_24, 44, SpringLayout.SOUTH, textField_1);
		sl_pnSpring.putConstraint(SpringLayout.WEST, btnNewButton_24, 280, SpringLayout.WEST, pnSpring);
		sl_pnSpring.putConstraint(SpringLayout.EAST, btnNewButton_24, -121, SpringLayout.EAST, pnSpring);
		pnSpring.add(btnNewButton_24);
		
		btnNewButton_25 = new JButton("Bot\u00E3o 3");
		sl_pnSpring.putConstraint(SpringLayout.SOUTH, btnNewButton_25, -77, SpringLayout.SOUTH, pnSpring);
		sl_pnSpring.putConstraint(SpringLayout.EAST, btnNewButton_25, -22, SpringLayout.EAST, pnSpring);
		pnSpring.add(btnNewButton_25);
	}
}
