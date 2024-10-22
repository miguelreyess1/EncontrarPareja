import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

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
        add(mainPanel);
        mainPanel.setBackground(new Color(255, 255, 255));

        ImageIcon reverso = new ImageIcon(new ImageIcon("src/EscudoAtleticoMadrid.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));

        Tablero.setBackground(new Color(255, 255, 255));

        // INICIO ENCABEZADO
        tituloPanel.setBackground(new Color(206,53,39));

        tituloText.setText("ENCUENTRA LA PAREJA");
        tituloText.setFont(new Font("Arial", Font.BOLD, 20));
        tituloText.setForeground(Color.white);

        // Cargar las imágenes de las parejas
        ImageIcon[] imagenes = {
                new ImageIcon(new ImageIcon("src/Falcao.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("src/Juanfran.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("src/JoseLuisTorrente.jpeg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)),
                new ImageIcon(new ImageIcon("src/FernandoTorres.jpg").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH))
        };

        // Crear una lista con las imágenes duplicadas (4 parejas)
        ArrayList<ImageIcon> imagenesCartas = new ArrayList<>();
        for (ImageIcon imagen : imagenes) {
            imagenesCartas.add(imagen);
            imagenesCartas.add(imagen);  // Añadir dos veces para formar parejas
        }

        // Barajar las imágenes
        Collections.shuffle(imagenesCartas);

        // Asignar las imágenes barajadas a los botones
        button1.setIcon(reverso);
        button2.setIcon(reverso);
        button3.setIcon(reverso);
        button4.setIcon(reverso);
        button5.setIcon(reverso);
        button6.setIcon(reverso);
        button7.setIcon(reverso);
        button8.setIcon(reverso);

        // Asignar las imágenes cuando se haga clic (lógica de juego)
        button1.addActionListener(e -> button1.setIcon(imagenesCartas.getFirst()));
        button2.addActionListener(e -> button2.setIcon(imagenesCartas.get(1)));
        button3.addActionListener(e -> button3.setIcon(imagenesCartas.get(2)));
        button4.addActionListener(e -> button4.setIcon(imagenesCartas.get(3)));
        button5.addActionListener(e -> button5.setIcon(imagenesCartas.get(4)));
        button6.addActionListener(e -> button6.setIcon(imagenesCartas.get(5)));
        button7.addActionListener(e -> button7.setIcon(imagenesCartas.get(6)));
        button8.addActionListener(e -> button8.setIcon(imagenesCartas.get(7)));

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Tablero();
    }
}
