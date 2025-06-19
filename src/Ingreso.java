import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame { // JFrame es un escenario que me otorga Java para mis componentes

    private JPanel Principal;
    private JLabel nombreLabel;
    private JTextField nombreText;
    private JButton enviarButton;

    // Colocar un titulo a mi formulario
    public Ingreso() {
        setTitle("Michelle <3");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Principal);
        setLocationRelativeTo(null);

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }
        });
    }

}
