package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JButton btnSomar;
    private JTextField txtValue1;
    private JTextField txtValue2;
    private JPanel form;
    private JLabel lblResult;

    public calculadora() {
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtValue1.getText());
                int n2 = Integer.parseInt(txtValue2.getText());
                int soma = n1 + n2;
                lblResult.setText(Integer.toString(soma));
            }
        });
    }

    public static void main(String[] args) {
        // TODO: place custom component creation code here
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new calculadora().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
