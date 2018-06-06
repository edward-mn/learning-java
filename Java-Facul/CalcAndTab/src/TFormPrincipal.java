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


public class TFormPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TFormPrincipal frame = new TFormPrincipal();
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
	public TFormPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setLocationRelativeTo( null );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFuncionalidades = new JMenu("Funcionalidades");
		menuBar.add(mnFuncionalidades);
		
		JMenu mnClculo = new JMenu("C\u00E1lculo");
		mnFuncionalidades.add(mnClculo);
		
		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mntmCalculadora.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				TCalculadora Calcular = new TCalculadora();
				Calcular.setVisible(true);
			}
		});
		mnClculo.add(mntmCalculadora);
		
		JMenuItem mntmTabuada = new JMenuItem("Tabuada");
		mnClculo.add(mntmTabuada);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String title = "Pergunta";
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", title, JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
				   //Usuário clicou em Sim. Executar o código correspondente.
					System.exit(EXIT_ON_CLOSE);
			}
		}
		});
		mnFuncionalidades.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
