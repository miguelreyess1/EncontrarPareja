import javax.swing.*;
import java.awt.*;

public class Tablero extends JFrame
{
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel tituloPanel;  // Panel para el título o marcador
    private JPanel Tablero;     // Panel donde estarán las cartas
    private JLabel tituloText;

    public Tablero()
    {
        setTitle("Juego de memoria - Atlético de Madrid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
//        setUndecorated(true);
        add(mainPanel);
        mainPanel.setBackground(new Color(255, 255, 255));

        ImageIcon reverso = new ImageIcon(new ImageIcon("src/EscudoAtleticoMadrid.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));

        Tablero.setBackground(new Color(255, 255, 255));

        // INICIO ENCABEZADO
        tituloPanel.setBackground(new Color(206,53,39));

        tituloText.setText("ENCUENTRA LA PAREJA");
        tituloText.setFont(new Font("Arial", Font.BOLD, 20));
        tituloText.setForeground(Color.white);

        // INICIO BOTONES
        button1.setIcon(reverso);
        button2.setIcon(reverso);
        button3.setIcon(reverso);
        button4.setIcon(reverso);
        button5.setIcon(reverso);
        button6.setIcon(reverso);
        button7.setIcon(reverso);
        button8.setIcon(reverso);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Tablero();
    }
}
