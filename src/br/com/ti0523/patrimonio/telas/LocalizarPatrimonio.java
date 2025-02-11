package br.com.ti0523.patrimonio.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LocalizarPatrimonio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalizarPatrimonio frame = new LocalizarPatrimonio();
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
	public LocalizarPatrimonio() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LocalizarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/computador-pessoal.png")));
		setTitle("Localização de Patrimonio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Localização de Patrimonio");
		lblNewLabel_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 26, 218, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFigura = new JLabel("New label");
		lblFigura.setIcon(new ImageIcon(LocalizarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/local.JPG")));
		lblFigura.setBounds(253, 0, 181, 261);
		contentPane.add(lblFigura);
		
		lblFigura.setIcon(new ImageIcon
				(new ImageIcon(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/local.jpg"))
						.getImage().getScaledInstance(lblFigura.getWidth(), 
								lblFigura.getHeight(), Image.SCALE_SMOOTH)));
		
		JLabel lblEmpresa = new JLabel("EMPRESA");
		lblEmpresa.setForeground(new Color(69, 69, 69));
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEmpresa.setBounds(10, 66, 104, 14);
		contentPane.add(lblEmpresa);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 83, 218, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOGRADOURO");
		lblNewLabel_2_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(10, 114, 100, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 131, 141, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 179, 66, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("PREDIO");
		lblNewLabel_2_1_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(10, 162, 66, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(161, 131, 66, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nº");
		lblNewLabel_2_1_2.setForeground(new Color(69, 69, 69));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1_2.setBounds(161, 114, 100, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(86, 179, 66, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("ANDAR");
		lblNewLabel_2_1_1_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1.setBounds(86, 162, 55, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(161, 179, 66, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("SALA");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_1.setBounds(161, 162, 55, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JButton btnLocalizar = new JButton("LOCALIZAR");
		btnLocalizar.setForeground(Color.WHITE);
		btnLocalizar.setBackground(new Color(0, 128, 255));
		btnLocalizar.setBounds(59, 216, 124, 23);
		contentPane.add(btnLocalizar);
	}

}
