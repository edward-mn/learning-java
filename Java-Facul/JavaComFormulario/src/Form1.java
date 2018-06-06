import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Form1 {

	private JFrame frame;
	private JTextField textMensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 window = new Form1();
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
	public Form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textMensagem = new JTextField();
		textMensagem.setBounds(97, 116, 86, 20);
		frame.getContentPane().add(textMensagem);
		textMensagem.setColumns(10);
		
		JButton btnVer = new JButton("Mostrar");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String show = textMensagem.getText();
				
				JOptionPane.showMessageDialog(null, show);
			}
		});
		btnVer.setBounds(97, 147, 89, 23);
		frame.getContentPane().add(btnVer);
	}
}
