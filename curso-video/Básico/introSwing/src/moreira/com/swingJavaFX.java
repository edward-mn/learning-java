package moreira.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingJavaFX {
    private JButton btnClique;
    private JLabel lblMsg;
    private JPanel form;


    public swingJavaFX() {
        btnClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMsg.setText("Aqui outro texto");
            }
        });
    }

    public static void getMainForm(){
        JFrame frame = new JFrame("swingJavaFX");
        frame.setContentPane(new swingJavaFX().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        getMainForm();
    }
}
