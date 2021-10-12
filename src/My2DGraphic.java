import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class My2DGraphic extends JFrame {
    public static void main(String[] args) {
        new My2DGraphic();
    }
    public My2DGraphic(){
        super("Meine 2D-Grafik");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
//Ein Rechteck zeichnen
        g2d.drawRect(20, 80, 100, 50);
    }
}
