import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;


public class MainForm extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 300);
		
		setLocationRelativeTo( null );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCadastro.add(mnCliente);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FrmCadCliente Cliente = new FrmCadCliente();
				Cliente.setVisible(true);
			}
		});
		mnCliente.add(mntmCadastro);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mnCliente.add(mntmConsulta);
		
		JSeparator separator = new JSeparator();
		mnCadastro.add(separator);
		
		JMenu mnProduto = new JMenu("Produto");
		mnCadastro.add(mnProduto);
		
		JMenuItem mntmCadastro_1 = new JMenuItem("Cadastro");
		mnProduto.add(mntmCadastro_1);
		
		JMenuItem mntmConsulta_1 = new JMenuItem("Consulta");
		mnProduto.add(mntmConsulta_1);
		
		JSeparator separator_1 = new JSeparator();
		mnCadastro.add(separator_1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String title = "Pergunta";
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", title, JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
				   //Usuário clicou em Sim. Executar o código correspondente.
					System.exit(EXIT_ON_CLOSE);
			}}
		});
		mnCadastro.add(mntmSair);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnCadastro.add(menuBar_1);
	}
}
