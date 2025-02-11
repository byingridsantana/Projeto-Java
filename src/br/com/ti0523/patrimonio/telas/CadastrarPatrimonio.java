package br.com.ti0523.patrimonio.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.ti0523.patrimonio.dao.DAOPatrimonio;
import br.com.ti0523.patrimonio.pojo.Patrimonio;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CadastrarPatrimonio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSerie;
	private JTextField txtNome;
	private JTextField txtLocalizacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPatrimonio frame = new CadastrarPatrimonio();
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
	public CadastrarPatrimonio() {
		
		// Instancia da classe Patrimonio que está no pacote pojo
		Patrimonio pat = new Patrimonio();
		
		// Instancia da Classe DAOPatrimonio que realiza o cadastro dos dados do patrimonio no banco de dados.
		DAOPatrimonio daopat = new DAOPatrimonio();
		
		setResizable(false);
		setTitle("Cadastro de Patrimônio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/computador-pessoal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 360);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFigura = new JLabel("New label");
		lblFigura.setIcon(new ImageIcon(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/equip1.jpg")));
		lblFigura.setBounds(321, 0, 185, 321);
		contentPane.add(lblFigura);
		
		lblFigura.setIcon(new ImageIcon
				(new ImageIcon(CadastrarPatrimonio.class.getResource("/br/com/ti0523/patrimonio/imagens/equip1.jpg"))
						.getImage().getScaledInstance(lblFigura.getWidth(), 
								lblFigura.getHeight(), Image.SCALE_SMOOTH)));
		
		JLabel lblNewLabel = new JLabel("NÚMERO DE SÉRIE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setForeground(new Color(69, 69, 69));
		lblNewLabel.setBounds(10, 63, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Patrimônio");
		lblNewLabel_1.setForeground(new Color(69, 69, 69));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 24, 234, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIPO DO PRODUTO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setForeground(new Color(69, 69, 69));
		lblNewLabel_2.setBounds(154, 63, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIÇÃO COMPLETA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setForeground(new Color(69, 69, 69));
		lblNewLabel_3.setBounds(10, 214, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		txtSerie = new JTextField();
		txtSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtSerie.setBackground(new Color(255, 255, 255));
		txtSerie.setBounds(10, 80, 134, 20);
		contentPane.add(txtSerie);
		txtSerie.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("LOCALIZAÇÃO DO PATRIMÔNIO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setForeground(new Color(69, 69, 69));
		lblNewLabel_4.setBounds(154, 111, 172, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DATA DE FABRICAÇÃO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setForeground(new Color(69, 69, 69));
		lblNewLabel_5.setBounds(10, 163, 134, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DATA DE AQUISIÇÃO");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setForeground(new Color(69, 69, 69));
		lblNewLabel_6.setBounds(154, 163, 124, 14);
		contentPane.add(lblNewLabel_6);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(10, 132, 134, 20);
		contentPane.add(txtNome);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setColumns(10);
		txtLocalizacao.setBounds(154, 132, 157, 20);
		contentPane.add(txtLocalizacao);
		
		JLabel lblNomeDoPatrimonio = new JLabel("NOME DO PATRIMÔNIO");
		lblNomeDoPatrimonio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNomeDoPatrimonio.setForeground(new Color(69, 69, 69));
		lblNomeDoPatrimonio.setBounds(10, 111, 144, 14);
		contentPane.add(lblNomeDoPatrimonio);
		
		
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Informática", "Móveis"}));
		cboTipo.setBounds(154, 79, 157, 22);
		contentPane.add(cboTipo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 238, 294, 35);
		contentPane.add(scrollPane);
		
		JTextArea txtDescricao = new JTextArea();
		scrollPane.setViewportView(txtDescricao);
				
		MaskFormatter msf_fabricacao = new MaskFormatter();
		MaskFormatter msf_aquisicao = new MaskFormatter();
		try {
			msf_fabricacao.setMask("##/##/####");
			msf_aquisicao.setMask("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFormattedTextField txtFabricacao = new JFormattedTextField(msf_fabricacao);
		txtFabricacao.setBounds(10, 183, 134, 20);
		contentPane.add(txtFabricacao);
		
		JFormattedTextField txtAquisicao = new JFormattedTextField(msf_aquisicao);
		txtAquisicao.setBounds(154, 183, 157, 20);
		contentPane.add(txtAquisicao);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Ao clicar no botão, deverá aparecer na tela de console todos os dados preenchidos nos campos.
				
				pat.setSerie(txtSerie.getText());
				pat.setNomepatrimonio(txtNome.getText());
				pat.setTipo(cboTipo.getSelectedItem().toString());
				pat.setDescricao(txtDescricao.getText());
				pat.setLocalizacao(txtLocalizacao.getText());
				pat.setDatafabricacao(txtFabricacao.getText());
				pat.setDataaquisicao(txtAquisicao.getText());
				
				String rs = daopat.cadastrar(pat);
				
				JOptionPane.showMessageDialog(null, rs);
				
				txtSerie.setText("");
				txtNome.setText("");				
				txtDescricao.setText("");
				txtLocalizacao.setText("");
				txtFabricacao.setText("");
				txtAquisicao.setText("");
			}
		});
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setBackground(new Color(0, 128, 255));
		btnCadastrar.setBounds(91, 284, 124, 23);
		contentPane.add(btnCadastrar);
	}
}
