import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.Printable;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;


public class DadosIntuitivo {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtRG;
	private JTextField txtEndereco;
	private JTextField txtCPF;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosIntuitivo window = new DadosIntuitivo();
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
	public DadosIntuitivo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(90, 28, 86, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(90, 69, 86, 20);
		frame.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setBounds(90, 105, 86, 20);
		frame.getContentPane().add(txtRG);
		txtRG.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(252, 28, 86, 20);
		frame.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(252, 69, 86, 20);
		frame.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		final JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"Acre -\tAC\t ", "Alagoas -\tAL\t ", "Amap\u00E1\t- AP\t ", "Amazonas - AM\t ", "Bahia- BA\t ", "Cear\u00E1- CE\t ", "Distrito Federal - DF\t ", "Esp\u00EDrito Santo - ES\t ", "Goi\u00E1s - GO\t ", "Maranh\u00E3o - MA\t ", "Mato Grosso - MT\t ", "Mato Grosso do Sul - MS\t ", "Minas Gerais - MG\t ", "Par\u00E1 - PA\t ", "Para\u00EDba - PB\t ", "Paran\u00E1 - PR\t ", "Pernambuco - PE\t ", "Piau\u00ED - PI\t ", "Rio de Janeiro - RJ\t ", "Rio Grande do Norte - RN\t ", "Rio Grande do Sul - RS \t ", "Rond\u00F4nia - RO\t ", "Roraima - RR\t ", "Santa Catarina - SC\t ", "S\u00E3o Paulo - SP\t ", "Sergipe - SE\t ", "Tocantins - TO"}));
		comboBoxEstado.setBounds(305, 105, 139, 20);
		frame.getContentPane().add(comboBoxEstado);
		
		final JRadioButton rdbtnCasado = new JRadioButton("Casado (a)");
		buttonGroup.add(rdbtnCasado);
		rdbtnCasado.setBounds(27, 181, 109, 23);
		frame.getContentPane().add(rdbtnCasado);
		
		final JRadioButton rdbtnSolteiro = new JRadioButton("Solteiro (a)");
		buttonGroup.add(rdbtnSolteiro);
		rdbtnSolteiro.setBounds(27, 207, 109, 23);
		frame.getContentPane().add(rdbtnSolteiro);
		
		final JCheckBox chckbxProgramacao = new JCheckBox("Programa\u00E7\u00E3o");
		chckbxProgramacao.setBounds(229, 170, 97, 23);
		frame.getContentPane().add(chckbxProgramacao);
		
		final JCheckBox chckbxBancoDeDados = new JCheckBox("Banco de Dados");
		chckbxBancoDeDados.setBounds(229, 196, 110, 23);
		frame.getContentPane().add(chckbxBancoDeDados);
		
		final JCheckBox chckbxRedes = new JCheckBox("Redes");
		chckbxRedes.setBounds(229, 222, 97, 23);
		frame.getContentPane().add(chckbxRedes);
		
		final JCheckBox chckbxDesenvolvimentoWEB = new JCheckBox("Desnvovimento WEB");
		chckbxDesenvolvimentoWEB.setBounds(229, 248, 126, 20);
		frame.getContentPane().add(chckbxDesenvolvimentoWEB);
		
		final JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(40, 31, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(34, 72, 46, 14);
		frame.getContentPane().add(lblTelefone);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(34, 108, 46, 14);
		frame.getContentPane().add(lblRG);
		
		JLabel lblEstadoCivil = new JLabel("Selecione seu Estado Civil");
		lblEstadoCivil.setBounds(10, 159, 126, 14);
		frame.getContentPane().add(lblEstadoCivil);
		
		JLabel lblConhecimento = new JLabel("Conhecimentos");
		lblConhecimento.setBounds(186, 151, 110, 14);
		frame.getContentPane().add(lblConhecimento);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(186, 31, 46, 14);
		frame.getContentPane().add(lblEndereco);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(196, 72, 46, 14);
		frame.getContentPane().add(lblCPF);
		
		JLabel lblEstado = new JLabel("Selecione um Estado");
		lblEstado.setBounds(186, 108, 109, 14);
		frame.getContentPane().add(lblEstado);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Salvar;
				
				String Estado = comboBoxEstado.getSelectedItem().toString();
				String Name = txtNome.getText();
				String Address = txtEndereco.getText();
				String Phone = txtTelefone.getText();
				String MyCpf = txtCPF.getText();
				String MyRG = txtRG.getText();
		
				
				String UmEstadoCivil = "";
				if (rdbtnCasado.isSelected()) {
					UmEstadoCivil += "Estado civil: CASADO";
				}
				if (rdbtnSolteiro.isSelected()) {
					UmEstadoCivil += "Estado civil: SOLTEIRO";
				}
				
				String Conhecimento = "";
				if (chckbxProgramacao.isSelected()) {
					Conhecimento += chckbxProgramacao.getLabel();
					chckbxProgramacao.setSelected(false);
				}
				
				if (chckbxBancoDeDados.isSelected()) {
					Conhecimento += chckbxBancoDeDados.getLabel();
					chckbxBancoDeDados.setSelected(false);
				}
				
				if (chckbxRedes.isSelected()) {
					Conhecimento += chckbxRedes.getLabel();
					chckbxRedes.setSelected(false);
				}
				
				if (chckbxDesenvolvimentoWEB.isSelected()) {
					Conhecimento += chckbxDesenvolvimentoWEB.getLabel();
					chckbxDesenvolvimentoWEB.setSelected(false);
				}
				
				Salvar =  lblNome.getText() + " " + Name + " " + Address + " " + Phone + " " + MyCpf + " " +
								MyRG + " " + Estado + " " + UmEstadoCivil + "" + Conhecimento;
				
				try {
					FileWriter arq = new FileWriter("C://exemplo/DescricaoComForm.txt");
					PrintWriter gravar = new PrintWriter(arq);
					gravar.printf(Salvar);
					arq.close();
				} catch (Exception e) {
					System.out.println("Erro ao Salvar o arquivo");
				}
				
				System.out.println("Arquivo salvo com sucesso ! ");
				JOptionPane.showMessageDialog(null, Salvar);
			}
		});
		btnSalvar.setBounds(113, 303, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
	}
}
