import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument.BranchElement;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.BreakIterator;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class Principal {

	private JFrame frmSimuladorDeMdia;
	private JTextField txtNotaP1;
	private JTextField txtNotaP2;
	private JTextField txtNotaTrabalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmSimuladorDeMdia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimuladorDeMdia = new JFrame();
		frmSimuladorDeMdia.setType(Type.UTILITY);
		frmSimuladorDeMdia.setTitle("Simulador de M\u00E9dia\r\n");
		frmSimuladorDeMdia.setBounds(100, 100, 268, 388);
		frmSimuladorDeMdia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimuladorDeMdia.getContentPane().setLayout(null);
		
		JLabel lblNotaProva1 = new JLabel("Nota Prova 1:");
		lblNotaProva1.setBounds(19, 59, 100, 14);
		frmSimuladorDeMdia.getContentPane().add(lblNotaProva1);
		
		JLabel lblNotaProva2 = new JLabel("Nota prova 2 :");
		lblNotaProva2.setBounds(19, 98, 100, 14);
		frmSimuladorDeMdia.getContentPane().add(lblNotaProva2);
		
		JLabel lblCalculadorDeMedias = new JLabel("Sistema que calcula m\u00E9dias");
		lblCalculadorDeMedias.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalculadorDeMedias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadorDeMedias.setForeground(Color.BLUE);
		lblCalculadorDeMedias.setBounds(24, 0, 215, 47);
		frmSimuladorDeMdia.getContentPane().add(lblCalculadorDeMedias);
		
		txtNotaP1 = new JTextField();
		txtNotaP1.setBounds(120, 56, 86, 20);
		frmSimuladorDeMdia.getContentPane().add(txtNotaP1);
		txtNotaP1.setColumns(10);
		
		txtNotaP2 = new JTextField();
		txtNotaP2.setBounds(120, 95, 86, 20);
		frmSimuladorDeMdia.getContentPane().add(txtNotaP2);
		txtNotaP2.setColumns(10);
		
		JLabel lblTrabalho1 = new JLabel("Trabalho 1:");
		lblTrabalho1.setBounds(19, 135, 100, 14);
		frmSimuladorDeMdia.getContentPane().add(lblTrabalho1);
		
		txtNotaTrabalho = new JTextField();
		txtNotaTrabalho.setBounds(120, 132, 86, 20);
		frmSimuladorDeMdia.getContentPane().add(txtNotaTrabalho);
		txtNotaTrabalho.setColumns(10);
		
		JEditorPane MemoResultado = new JEditorPane();
		MemoResultado.setEditable(false);
		MemoResultado.setBounds(21, 239, 215, 86);
		frmSimuladorDeMdia.getContentPane().add(MemoResultado);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(24, 214, 68, 14);
		frmSimuladorDeMdia.getContentPane().add(lblResultado);
		
		JLabel lblResultadoFinalAproOURepro = new JLabel("");
		lblResultadoFinalAproOURepro.setBounds(102, 214, 124, 14);
		frmSimuladorDeMdia.getContentPane().add(lblResultadoFinalAproOURepro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ResultadoP1,ResultadoP2,ResultadoT1,InformacaoFinal,ResultadoMedia = "";
				boolean Situacao;
				final String DigiteNotaValida = "Por favor Digite uma nota válida para ";
				final String Dentre0a10 = " ou seja entre 0 e 10";
						
				 ResultadoP1 = txtNotaP1.getText();
				 if (ResultadoP1 == null|| ResultadoP1.trim().isEmpty() || (Integer.parseInt(ResultadoP1) < 0) || (Integer.parseInt(ResultadoP1) > 10)) {
					JOptionPane.showMessageDialog(new JFrame(), DigiteNotaValida + "a Primeira Prova" + Dentre0a10,"Erro",JOptionPane.ERROR_MESSAGE);
					txtNotaP1.setText("");
					txtNotaP1.requestFocus();
				 	return;
				 }
				ResultadoP2 = txtNotaP2.getText();
				if (ResultadoP2 == null|| ResultadoP2.trim().isEmpty() || (Integer.parseInt(ResultadoP2) < 0) || (Integer.parseInt(ResultadoP2) > 10)) {
					txtNotaP2.setText("");
					JOptionPane.showMessageDialog(new JFrame(), DigiteNotaValida + "a Segunda Prova" + Dentre0a10,"Erro",JOptionPane.ERROR_MESSAGE);
					txtNotaP2.requestFocus();
					return;
				}
				ResultadoT1 = txtNotaTrabalho.getText();
				if (ResultadoT1 == null|| ResultadoT1.trim().isEmpty() || (Integer.parseInt(ResultadoT1) < 0) || (Integer.parseInt(ResultadoT1) > 10)) {
					JOptionPane.showMessageDialog(new JFrame(), DigiteNotaValida + "o Trabalho" + Dentre0a10,"Erro",JOptionPane.ERROR_MESSAGE);
					txtNotaTrabalho.setText("");
					txtNotaTrabalho.requestFocus();
					return;
				} else {
					CalculaNotas MyNotaFinal = new CalculaNotas();
					MyNotaFinal.setNotaP1(Float.parseFloat(ResultadoP1));
					MyNotaFinal.setNotaP2(Float.parseFloat(ResultadoP2));
					MyNotaFinal.setNotaT1(Float.parseFloat(ResultadoT1));
					MyNotaFinal.setMedia(Float.parseFloat(ResultadoP1),Float.parseFloat(ResultadoP2),Float.parseFloat(ResultadoT1));
					if ((MyNotaFinal.getMedia() >= 6) & (Situacao = true)) {
						lblResultadoFinalAproOURepro.setText("Aprovado");
						lblResultadoFinalAproOURepro.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblResultadoFinalAproOURepro.setForeground(Color.GREEN);
						InformacaoFinal = "Parabéns :) você passou na matéria DIRETO";
					} else {
						lblResultadoFinalAproOURepro.setText("Reprovado");
						lblResultadoFinalAproOURepro.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblResultadoFinalAproOURepro.setForeground(Color.RED);
						InformacaoFinal = "Reprovado :( estude mais para a AR!";
					}
					if (ResultadoMedia != null) {
						ResultadoMedia = String.format("%,.2f", MyNotaFinal.getMedia());
						MemoResultado.setText("");
						MyNotaFinal.setMostrarInformacoes(lblNotaProva1.getText() + " " + ResultadoP1 + "\n" +
						lblNotaProva2.getText() + " " + ResultadoP2 + "\n" + 
						lblTrabalho1.getText()	+ " " + ResultadoT1 + "\n" +
						"Média final foi: " + " " + ResultadoMedia + "\n" + 
						InformacaoFinal);
					MemoResultado.setText(MyNotaFinal.getMostrarInformacoes()); 
				} else {
					MemoResultado.setText("");
					MemoResultado.setText("Por Favor efetue um calculo antes !");}
					}
				}
			});		
		btnCalcular.setBounds(46, 172, 158, 23);
		frmSimuladorDeMdia.getContentPane().add(btnCalcular);
		
		JMenuBar menuBar = new JMenuBar();
		frmSimuladorDeMdia.setJMenuBar(menuBar);
		
		JMenu mnFuncionalidades = new JMenu("Funcionalidades");
		menuBar.add(mnFuncionalidades);
		
		JMenuItem mntmSalvartxt = new JMenuItem("Salvar (.txt)");
		mntmSalvartxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String InformacoesParaSalvar = "";
				final String PathArquivoSalvo = "D://SimuladorMedia.txt";
				InformacoesParaSalvar += MemoResultado.getText();
				try {
					FileWriter Arquivo = new FileWriter(PathArquivoSalvo);
					PrintWriter Grava = new PrintWriter(Arquivo);
					Grava.printf(InformacoesParaSalvar);
				} catch (Exception e2) {
					System.out.println();
					JOptionPane.showMessageDialog(new JFrame(), "Erro ao salvar o Arquivo em " + PathArquivoSalvo, "Erro", JOptionPane.ERROR_MESSAGE);
				}
				System.out.println("Arquivo salvo com sucesso em " + PathArquivoSalvo);
				JOptionPane.showMessageDialog(new JFrame(), "Arquivo salvo com sucesso em " + PathArquivoSalvo, "Sucesso", JOptionPane.NO_OPTION);
			}
		});
		mnFuncionalidades.add(mntmSalvartxt);
		
		JMenuItem mntmNovaSimulao = new JMenuItem("Nova Simula\u00E7\u00E3o");
		mntmNovaSimulao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String InformacoesMemoResultado = "";
			InformacoesMemoResultado += MemoResultado.getText();
			if (InformacoesMemoResultado != "") { 
				mntmNovaSimulao.setVisible(true);
				txtNotaP1.setText("");
				txtNotaP2.setText("");
				txtNotaTrabalho.setText("");
			} else {
				mntmNovaSimulao.setVisible(false);	}
			}
		});
		mntmNovaSimulao.setSelectedIcon(new ImageIcon(Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnFuncionalidades.add(mntmNovaSimulao);
		
		JMenuItem mntmAutor = new JMenuItem("Autor");
		mntmAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAutor Autor = new frmAutor();
				Autor.setVisible(true);
			}
		});
		mnFuncionalidades.add(mntmAutor);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String title = "Pergunta";
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", title, JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
				   //Usuário clicou em Sim. Executar o código correspondente.
					System.exit(JFrame.EXIT_ON_CLOSE);
				}
			}
		});
		mnFuncionalidades.add(mntmSair);
	}
}
