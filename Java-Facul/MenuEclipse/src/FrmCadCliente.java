import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;


public class FrmCadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtIdade;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCadCliente frame = new FrmCadCliente();
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
	public FrmCadCliente() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo( null );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(33, 47, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(33, 94, 86, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(33, 138, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		final JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(33, 28, 46, 14);
		contentPane.add(lblNome);
		
		final JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(33, 78, 46, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(33, 124, 46, 14);
		contentPane.add(lblIdade);
		
		final JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(33, 174, 46, 14);
		contentPane.add(lblTime);
		
		
		final JComboBox comboBoxTime = new JComboBox();
		comboBoxTime.setModel(new DefaultComboBoxModel(new String[] {"Brasil", "Paraguai", "Argentina", "Bol\u00EDvia", "Paraguai", "Russia", "Asia", "Jap\u00E3o", "Estados Unidos", "Marrocos"}));
		comboBoxTime.setBounds(33, 196, 86, 20);
		contentPane.add(comboBoxTime);
		
		final JRadioButton rdbtnCasadoSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnCasadoSim);
		rdbtnCasadoSim.setBounds(242, 116, 109, 23);
		contentPane.add(rdbtnCasadoSim);
		
		final JRadioButton rdbtnCasadoNao = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbtnCasadoNao);
		rdbtnCasadoNao.setBounds(242, 137, 109, 23);
		contentPane.add(rdbtnCasadoNao);
		
		JLabel lblCasado = new JLabel("Casado");
		lblCasado.setBounds(224, 97, 46, 14);
		contentPane.add(lblCasado);
		
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Salvar = "";
				
				String Time = comboBoxTime.getSelectedItem().toString();
				String Name = txtNome.getText();
				String Address = txtEndereco.getText();
				
				String EstadoCivil = "";
				if (rdbtnCasadoSim.isSelected()) {
					EstadoCivil += "Estado civil: CASADO";
				}
				if (rdbtnCasadoNao.isSelected()) {
					EstadoCivil += "Estado civil: SOLTEIRO";
				}
				
				
			Salvar += lblNome.getText() + ": " + Name + "\n" + lblTime.getText() + ": " +
			Time + "\n" + lblEndereo.getText() + ": " + Address +  "\n" + EstadoCivil;
			
			JOptionPane.showMessageDialog(null, Salvar);
			}
		});
		btnSalvar.setBounds(180, 238, 89, 23);
		contentPane.add(btnSalvar);
	}
}
