package aula04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JPanel pnCentral;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setBackground(new Color(0, 0, 153));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("Calculadora");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		GroupLayout gl_pnTitulo = new GroupLayout(pnTitulo);
		gl_pnTitulo.setHorizontalGroup(
			gl_pnTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnTitulo.createSequentialGroup()
					.addContainerGap(203, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(200))
		);
		gl_pnTitulo.setVerticalGroup(
			gl_pnTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnTitulo.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnTitulo.setLayout(gl_pnTitulo);
		
		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Num 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("Num 2:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNum2.setColumns(10);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfResultado.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_pnCentral = new GroupLayout(pnCentral);
		gl_pnCentral.setHorizontalGroup(
			gl_pnCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCentral.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(tfNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		gl_pnCentral.setVerticalGroup(
			gl_pnCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCentral.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnCentral.createSequentialGroup()
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(tfNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(tfNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(tfResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		
		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnNewButton_2 = new JButton("X");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btnNewButton_4 = new JButton("MMC");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnNewButton_5 = new JButton("MDC");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnNewButton_6 = new JButton("X^Y");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addComponent(btnNewButton_3))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_4)
							.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
							.addComponent(btnNewButton_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_6)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_6)
						.addComponent(btnNewButton_5))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		pnCentral.setLayout(gl_pnCentral);
	}
	
	private void soma() {
		double a = Double.parseDouble(tfNum1.getText());
		double b = Double.parseDouble(tfNum2.getText());
		double valor = a + b;
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);
	}
}
