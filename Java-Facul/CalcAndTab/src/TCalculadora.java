 import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import org.omg.CORBA.PUBLIC_MEMBER;


public class TCalculadora extends JFrame {

	protected static final float Nominador = 0;
	protected static final float Denominador = 0;
	private JPanel contentPane;
	private JTextField txtNominador;
	private JTextField txtDenominador;
	private JTextField txtResultado;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCalculadora frame = new TCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		float soma, subtracao, divisao, multiplicacao;
		public float calcular(float Nominador, float Denominador) {
			return soma = Nominador + Denominador;
			return subtracao = Nominador - Denominador;
			return divisao = Nominador / Denominador;
			return multiplicacao = Nominador * Denominador;
			}
	
	/**
	 * Create the frame.
	 */
	public TCalculadora() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 319, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		final JLabel lblNominador = new JLabel("Nominador");
		lblNominador.setBounds(33, 24, 86, 14);
		contentPane.add(lblNominador);
		
		txtNominador = new JTextField();
		txtNominador.setBounds(33, 49, 86, 20);
		contentPane.add(txtNominador);
		txtNominador.setColumns(10);
		
		txtDenominador = new JTextField();
		txtDenominador.setColumns(10);
		txtDenominador.setBounds(33, 104, 86, 20);
		contentPane.add(txtDenominador);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(33, 149, 86, 20);
		contentPane.add(txtResultado);
		
		final JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(33, 128, 86, 14);
		contentPane.add(lblResultado);
		
		final JLabel lblDenominador = new JLabel("Denominador");
		lblDenominador.setBounds(33, 82, 86, 14);
		contentPane.add(lblDenominador);
		
		final JRadioButton rdbtnAdicao = new JRadioButton("Adi\u00E7\u00E3o ( + )");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setBounds(144, 36, 109, 23);
		contentPane.add(rdbtnAdicao);
		
		final JRadioButton rdbtnSubtracao = new JRadioButton("Subtra\u00E7\u00E3o ( - )");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setBounds(144, 70, 109, 23);
		contentPane.add(rdbtnSubtracao);
		
		final JRadioButton rdbtnMultiplicacao = new JRadioButton("Multiplica\u00E7\u00E3o ( * )");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setBounds(144, 112, 109, 23);
		contentPane.add(rdbtnMultiplicacao);
		
		final JRadioButton rdbtnDivisao = new JRadioButton("Divis\u00E3o ( / ) ");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setBounds(144, 146, 109, 23);
		contentPane.add(rdbtnDivisao);
		
		final JLabel lblOperao = new JLabel("Opera\u00E7\u00E3o");
		lblOperao.setBounds(179, 11, 74, 14);
		contentPane.add(lblOperao);

		JButton btnCalcular = new JButton("C\u00E1lcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcular(Nominador, Denominador);	
			}
		});
		btnCalcular.setBounds(107, 180, 89, 23);
		contentPane.add(btnCalcular);
	}
}
