   import javax.swing.*;
    import java.awt.*;
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        JFrame frame=new JFrame("Aplicacion para calcular el perimetro y area de figura geometricas");
        frame.setContentPane(new form1().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setPreferredSize(new Dimension(800,600));
        frame.pack();
        frame.setVisible(true);

    }
}