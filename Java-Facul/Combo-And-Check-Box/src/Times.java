import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class Times {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Times window = new Times();
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
	public Times() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Guarani", "Vasco", "Palmeiras", "Santos", "S\u00E3o Paulo", "Ponte Petra", "Rio Branco"}));
		comboBox.setBounds(87, 36, 118, 20);
		frame.getContentPane().add(comboBox);
		
		final JLabel lblSelecioneSeuTime = new JLabel("Selecione seu time:");
		lblSelecioneSeuTime.setBounds(87, 11, 118, 14);
		frame.getContentPane().add(lblSelecioneSeuTime);
		
		final JButton btnVerResultado = new JButton("Ver Resultado");
		final JCheckBox chckbxVaiGanharPaulistao = new JCheckBox("Vai ganhar o Paulist\u00E3o");
		chckbxVaiGanharPaulistao.setBounds(33, 93, 149, 23);
		frame.getContentPane().add(chckbxVaiGanharPaulistao);
		
		final JCheckBox chckbxVaiGanharBrasileirao = new JCheckBox("Vai ganhar o Brasileir\u00E3o");
		chckbxVaiGanharBrasileirao.setBounds(33, 119, 149, 23);
		frame.getContentPane().add(chckbxVaiGanharBrasileirao);
		
		final JCheckBox chckbxVaiGanharLibertadores = new JCheckBox("Vai ganhar a Libertadores");
		chckbxVaiGanharLibertadores.setBounds(33, 145, 149, 23);
		frame.getContentPane().add(chckbxVaiGanharLibertadores);
		
		final JRadioButton rdbtnTemMundial = new JRadioButton("Tem Mundial");
		buttonGroup.add(rdbtnTemMundial);
		rdbtnTemMundial.setBounds(43, 171, 109, 23);
		frame.getContentPane().add(rdbtnTemMundial);
		
		final JRadioButton rdbtnNaoTemMundial = new JRadioButton("N\u00E3o tem Mundial");
		buttonGroup.add(rdbtnNaoTemMundial);
		rdbtnNaoTemMundial.setBounds(157, 171, 109, 23);
		frame.getContentPane().add(rdbtnNaoTemMundial);
		
		btnVerResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String time = comboBox.getSelectedItem().toString();
				
				String titulos = "";
				
				if (chckbxVaiGanharPaulistao.isSelected()) {
					titulos += " Campeão Paulista";
					chckbxVaiGanharPaulistao.setSelected(false);
			}
				
				if (chckbxVaiGanharBrasileirao.isSelected()) {
						titulos += " Campeão Brasileiro";
						chckbxVaiGanharBrasileirao.setSelected(false);
				}
				
				if (chckbxVaiGanharLibertadores.isSelected()) {
					titulos += " Campeão da Libertadores";
					chckbxVaiGanharLibertadores.setSelected(false);
			}
				String mundial = "";
				if (rdbtnTemMundial.isSelected()) {
					mundial += "Meu time tem Mumdial uhuu!";
				}
				
				if (rdbtnNaoTemMundial.isSelected()) {
					mundial += "Meu time não tem Mumdial uhuu!";
				}
				
				JOptionPane.showMessageDialog(null, "O time escolhido foi: " + time );
				JOptionPane.showMessageDialog(null, "Seu time ganhou o seguinte título : " + titulos );
				JOptionPane.showMessageDialog(null, mundial);
			}
		});
		btnVerResultado.setBounds(136, 206, 102, 23);
		frame.getContentPane().add(btnVerResultado);
		
	}
}
