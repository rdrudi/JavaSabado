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

import util.Mat;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JPanel pnCentral;
	private JLabel lbNum1;
	private JLabel lbTitulo;
	private JLabel lbNum2;
	private JLabel lbResultado;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JPanel panel;
	private JButton btSoma;
	private JButton btSub;
	private JButton btMult;
	private JButton btDiv;
	private JButton btMMC;
	private JButton btMDC;
	private JButton btExp;
	private JLabel lbLogo;

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
		setTitle("Calculadora Java");
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setPreferredSize(new Dimension(10, 60));
		pnTitulo.setBackground(new Color(0, 0, 153));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Calculadora");
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		
		lbLogo = new JLabel("");
		lbLogo.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/imagens/logoCalculadora.png")));
		GroupLayout gl_pnTitulo = new GroupLayout(pnTitulo);
		gl_pnTitulo.setHorizontalGroup(
			gl_pnTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbLogo)
					.addGap(185)
					.addComponent(lbTitulo)
					.addContainerGap(230, Short.MAX_VALUE))
		);
		gl_pnTitulo.setVerticalGroup(
			gl_pnTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnTitulo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnTitulo.createParallelGroup(Alignment.LEADING)
						.addComponent(lbLogo)
						.addComponent(lbTitulo))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		pnTitulo.setLayout(gl_pnTitulo);
		
		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		
		lbNum1 = new JLabel("Num 1:");
		lbNum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lbNum2 = new JLabel("Num 2:");
		lbNum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lbResultado = new JLabel("Resultado:");
		lbResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
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
						.addComponent(lbResultado)
						.addComponent(lbNum1)
						.addComponent(lbNum2))
					.addGap(18)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(tfNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		gl_pnCentral.setVerticalGroup(
			gl_pnCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCentral.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnCentral.createSequentialGroup()
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbNum1)
								.addComponent(tfNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbNum2)
								.addComponent(tfNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbResultado)
								.addComponent(tfResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		
		btSoma = new JButton("");
		btSoma.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/imagens/btSoma.png")));
		btSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma();
			}
		});
		btSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btSub = new JButton("");
		btSub.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/imagens/btSub.png")));
		btSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub();
			}
		});
		btSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btMult = new JButton("");
		btMult.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/imagens/btMult.png")));
		btMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mult();
			}
		});
		btMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btDiv = new JButton("");
		btDiv.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/imagens/btDiv.png")));
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				div();
			}
		});
		btDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		btMMC = new JButton("MMC");
		btMMC.setForeground(new Color(0, 0, 255));
		btMMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mmc();
			}
		});
		btMMC.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		btMDC = new JButton("MDC");
		btMDC.setForeground(new Color(0, 0, 255));
		btMDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mdc();
			}
		});
		btMDC.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		btExp = new JButton("X^Y");
		btExp.setForeground(new Color(0, 0, 255));
		btExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp();
			}
		});
		btExp.setFont(new Font("Tahoma", Font.BOLD, 32));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addComponent(btSoma)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btSub)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btMult)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btDiv))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btMMC)
							.addGap(18)
							.addComponent(btMDC)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btExp)))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btSoma)
							.addComponent(btSub)
							.addComponent(btMult))
						.addComponent(btDiv))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(31)
							.addComponent(btMMC))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btExp)
								.addComponent(btMDC))))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		pnCentral.setLayout(gl_pnCentral);
	}

	private void exp() {
		double a = Double.parseDouble(tfNum1.getText());
		int b = Integer.parseInt(tfNum2.getText());
		double valor = Mat.pot(a,b);
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);		
	}
	
	private void mdc() {
		int a = Integer.parseInt(tfNum1.getText());
		int b = Integer.parseInt(tfNum2.getText());
		int valor = Mat.mdc(a,b);
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);		
	}
	
	private void mmc() {
		int a = Integer.parseInt(tfNum1.getText());
		int b = Integer.parseInt(tfNum2.getText());
		int valor = Mat.mmc(a,b);
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);		
	}
	
	private void div() {
		String resp;
		double a = Double.parseDouble(tfNum1.getText());
		double b = Double.parseDouble(tfNum2.getText());
		if (b != 0) {
			double valor = a / b;
			resp = String.valueOf(valor);
		} else {
			resp = "Não divide por 0!";
		}
		tfResultado.setText(resp);		
	}
	
	private void mult() {
		double a = Double.parseDouble(tfNum1.getText());
		double b = Double.parseDouble(tfNum2.getText());
		double valor = a * b;
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);		
	}
	
	private void sub() {
		double a = Double.parseDouble(tfNum1.getText());
		double b = Double.parseDouble(tfNum2.getText());
		double valor = a - b;
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);		
	}
	
	private void soma() {
		double a = Double.parseDouble(tfNum1.getText());
		double b = Double.parseDouble(tfNum2.getText());
		double valor = a + b;
		String resp = String.valueOf(valor);
		tfResultado.setText(resp);
	}
}
