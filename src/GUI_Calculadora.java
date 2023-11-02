import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Calculadora.Calculadora;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class GUI_Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField Operando01;
	private JTextField Operando02;
	private JTextField resultado;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Calculadora  frame = new GUI_Calculadora ();
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
	public GUI_Calculadora () {
		// instaciar a classe calculadora como obejto
		Calculadora calc = new Calculadora();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe o primeiro n\u00FAmero");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 0, 187, 29);
		contentPane.add(lblNewLabel);
		
		Operando01 = new JTextField();
		Operando01.setBounds(50, 40, 86, 20);
		contentPane.add(Operando01);
		Operando01.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Informe o Segundo n\u00FAmero");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(224, 0, 187, 29);
		contentPane.add(lblNewLabel_1);
		
		Operando02 = new JTextField();
		Operando02.setBounds(285, 40, 86, 20);
		contentPane.add(Operando02);
		Operando02.setColumns(10);
		
		JRadioButton buttonsoma = new JRadioButton("Soma");
		buttonGroup.add(buttonsoma);
		buttonsoma.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonsoma.setBounds(58, 91, 78, 20);
		contentPane.add(buttonsoma);
		
		JRadioButton buttonsubtraçao = new JRadioButton("Subtra\u00E7\u00E3o");
		buttonGroup.add(buttonsubtraçao);
		buttonsubtraçao.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonsubtraçao.setBounds(262, 91, 109, 21);
		contentPane.add(buttonsubtraçao);
		
		JRadioButton buttonmultiplicaçao = new JRadioButton("Multiplica\u00E7\u00E3o");
		buttonGroup.add(buttonmultiplicaçao);
		buttonmultiplicaçao.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonmultiplicaçao.setBounds(59, 124, 109, 23);
		contentPane.add(buttonmultiplicaçao);
		
		JRadioButton buttondivisao = new JRadioButton("Divis\u00E3o");
		buttonGroup.add(buttondivisao);
		buttondivisao.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttondivisao.setBounds(262, 124, 109, 23);
		contentPane.add(buttondivisao);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// converter os resultados de string para double, pois a GUI reconhece todo dado de entrada como string.
				calc.setOperando_01(Double.parseDouble(Operando01.getText()));
				calc.setOperando_02(Double.parseDouble(Operando02.getText()));
				
				// fazendo os testes logicos nos botoes para saber qual foi selecionado
				if (buttonsoma.isSelected()) {
					calc.setOperador_utilizado(1);
				}
				if (buttonsubtraçao.isSelected()) {
					calc.setOperador_utilizado(2);
				}
				if (buttonmultiplicaçao.isSelected()) {
					calc.setOperador_utilizado(3);
				}
				if (buttondivisao.isSelected()) {
					calc.setOperador_utilizado(4);
				}
				
				// usando o metodo de realizar operaçao da classe calculadora
				calc.realizarOperacao();
				if (calc.getInfoerro() != "") {
					resultado.setText(calc.getInfoerro()+"");
					calc.setInfoerro("");
					
				} else {
					// exibindo o resultado 
					resultado.setText(calc.getResult()+"");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setBounds(156, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Arial", Font.PLAIN, 11));
		resultado.setBounds(50, 181, 321, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(164, 164, 78, 17);
		contentPane.add(lblNewLabel_2);
	}
}