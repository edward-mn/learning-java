import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;


public class FormCadastroCliente {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtNumCalcado;
	private JTextField txtFormaPagamento;
	private JTextField txtTipoCalcado;
	private JLabel lblCadastroDeDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastroCliente window = new FormCadastroCliente();
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
	public FormCadastroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void MostrarDados() {
		String Salvar;
		
		String Name = txtNome.getText();
		String Address = txtEndereco.getText();
		String Phone = txtTelefone.getText();
		String MyCpf = txtCPF.getText();
		String MyRG = txtRG.getText();
		String TypeFootwear = txtTipoCalcado.getText();
		String NumFootwear = txtNumCalcado.getText();
		String TypetoPay = txtFormaPagamento.getText(); 
		
		
		Salvar = Name + " " + Address + " " + Phone + " " + MyCpf + " " +
		MyRG + " " + TypeFootwear + " " + NumFootwear + " " + TypetoPay;
		
		JOptionPane.showMessageDialog(null, Salvar);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 398, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Chamo o método que mostra os dados
				MostrarDados();
							
			//	String Name = txtNome.getText();
			//	String Address = txtEndereco.getText();
			//	String Phone = txtTelefone.getText();
			//	String MyCpf = txtCPF.getText();
			//	String MyRG = txtRG.getText();
			//	String TypeFootwear = txtTipoCalcado.getText();
			//	String NumFootwear = txtNumCalcado.getText();
			//	String TypetoPay = txtFormaPagamento.getText(); 
									
				//salvar = Name + " " + Address + " " + Phone + " " + MyCpf + " " +
				//MyRG + " " + TypeFootwear + " " + NumFootwear + " " + TypetoPay;
				
				// JOptionPane.showMessageDialog(null, Salvar);
			}
		});
		btnSalvar.setBounds(141, 308, 112, 37);
		frame.getContentPane().add(btnSalvar);
		
		txtNome = new JTextField();
		txtNome.setBounds(58, 84, 86, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(58, 140, 86, 20);
		frame.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(58, 192, 86, 20);
		frame.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(58, 244, 86, 20);
		frame.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setColumns(10);
		txtRG.setBounds(235, 84, 97, 20);
		frame.getContentPane().add(txtRG);
		
		txtNumCalcado = new JTextField();
		txtNumCalcado.setColumns(10);
		txtNumCalcado.setBounds(235, 140, 97, 20);
		frame.getContentPane().add(txtNumCalcado);
		
		txtFormaPagamento = new JTextField();
		txtFormaPagamento.setColumns(10);
		txtFormaPagamento.setBounds(235, 244, 97, 20);
		frame.getContentPane().add(txtFormaPagamento);
		
		txtTipoCalcado = new JTextField();
		txtTipoCalcado.setColumns(10);
		txtTipoCalcado.setBounds(235, 192, 97, 20);
		frame.getContentPane().add(txtTipoCalcado);
		
		JLabel lblNome =new JLabel("Nome");
		lblNome.setBounds(58, 59, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(58, 115, 46, 14);
		frame.getContentPane().add(lblEndereco);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(58, 167, 46, 14);
		frame.getContentPane().add(lblTelefone);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(58, 219, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblTipoDeCalado = new JLabel("Tipo de Cal\u00E7ado");
		lblTipoDeCalado.setBounds(234, 167, 98, 14);
		frame.getContentPane().add(lblTipoDeCalado);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento");
		lblFormaDePagamento.setBounds(235, 219, 112, 14);
		frame.getContentPane().add(lblFormaDePagamento);
		
		JLabel lblNumCalcado = new JLabel("N\u00B0 Cal\u00E7ado");
		lblNumCalcado.setBounds(235, 115, 75, 14);
		frame.getContentPane().add(lblNumCalcado);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(235, 59, 46, 14);
		frame.getContentPane().add(lblRg);
		
		lblCadastroDeDados = new JLabel("Cadastro de Dados para Loja");
		lblCadastroDeDados.setFont(new Font("Arial", Font.PLAIN, 21));
		lblCadastroDeDados.setBounds(58, 11, 316, 37);
		frame.getContentPane().add(lblCadastroDeDados);
	}
}
