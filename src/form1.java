import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JLabel label1;
    private JButton calcularButton;
    private JTextField texto2;
    private JTextField texto3;
    private JTextField texto5;
    private JTextField texto8;
    private JButton calcularButton1;
    private JButton calcularButton2;
    private JButton calcularButton3;
    private JButton calcularButton4;
    private JLabel perimetro1;
    private JLabel perimetro2;
    private JLabel area2;
    private JLabel area1;
    private JLabel perimetro3;
    private JLabel area3;
    private JLabel perimetro4;
    private JLabel area4;
    private JLabel perimetro5;
    private JLabel area5;
    private JTextField texto6;
    private JTextField texto7;
    private JTextField texto4;
    private JTextField texto1;
    public JPanel JPanel1;

    public form1() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radio = Double.parseDouble(texto1.getText());
                    double perimetro = 2 * Math.PI * radio;
                    double area = Math.PI * radio * radio;

                    perimetro1.setText(String.format("%.2f", perimetro));
                    area1.setText(String.format(" %.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el radio del círculo.");
                }


            }
        });
        calcularButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(texto2.getText());
                    double perimetro = 4 * lado;
                    double area = lado * lado;

                    perimetro2.setText(String.format(" %.2f", perimetro));
                    area2.setText(String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, " ingrese un numero válido para el  cuadrado.");
                }

            }
        });
        calcularButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double largo = Double.parseDouble(texto3.getText());
                    double ancho = Double.parseDouble(texto4.getText());
                    double perimetro = 2 * (largo + ancho);
                    double area = largo * ancho;

                    perimetro3.setText(String.format(" %.2f", perimetro));
                    area3.setText(String.format(" %.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, " ingrese valores validos para el rectangulo.");
                }

            }
        });
        calcularButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado1 = Double.parseDouble(texto5.getText());
                    double lado2 = Double.parseDouble(texto6.getText());
                    double lado3 = Double.parseDouble(texto7.getText());
                    double perimetro = lado1 + lado2 + lado3;

                    perimetro4.setText(String.format("%.2f", perimetro));
                    double s = perimetro / 2;
                    double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
                    area4.setText(String.format(" %.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, " ingrese valores validos para el triángulo.");
                }

            }
        });
        calcularButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(texto8.getText());
                    double perimetro = 5 * lado;
                    double area = (5.0 / 4) * lado * lado * (1 / Math.tan(Math.PI / 5));


                    perimetro5.setText(String.format(" %.2f", perimetro));
                    area5.setText(String.format(" %.2f", area));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el pentágono.");
                }

            }
        });
    }
}
