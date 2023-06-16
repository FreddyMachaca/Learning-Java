package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JPanel taxPanel;
    private JButton buttonCalculate;

    public MainForm(){
        buttonCalculate.addActionListener(new ActionListener() {
            @Override //sobreescritura de metodo
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble(taxPane.getText());

                double result = p + (p / 100*t);
                totalPane.setText(Double.toString(result));
            }
        });//dentro de los parentesis se pone el metodo que se va a ejecutar

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax"); // creando un frame con un titulo
        frame.setContentPane(new MainForm().taxPanel); // agregando el panel al frame
        frame.setSize(600, 500); // tamaño del frame
        frame.setLocationRelativeTo(null); // centrando el frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar el programa al cerrar el frame
        frame.setVisible(true);
    }
}
