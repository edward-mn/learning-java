package swingTela;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class Vetor {
    private JPanel form;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnOrdenete;
    private JList listVetor;
    private JLabel lblVetor;
    private JLabel lblVetorSelecionado;
    private JSpinner spnValue;


    public Vetor() {

        int vetor[] = new int[5];
        DefaultListModel lista = new DefaultListModel();
        listVetor.setModel(lista);
        final int[] selecionado = {0};

        setTextList(lista, vetor);

        listVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado[0] = listVetor.getSelectedIndex();
                lblVetorSelecionado.setText("[ " +Integer.toString(listVetor.getSelectedIndex()) + " ]");
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado[0]] = Integer.parseInt(spnValue.getValue().toString());
                setTextList(lista, vetor);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado[0]] = 0;
                setTextList(lista, vetor);
            }
        });

        btnOrdenete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor);
                setTextList(lista, vetor);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vetor");
        frame.setContentPane(new Vetor().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
    }

    public void setTextList(DefaultListModel lista, int[] vetor){
        lista.removeAllElements();
        for(int i = 0; i < vetor.length; i ++){
            lista.addElement(vetor[i]);
        }
    }
}
