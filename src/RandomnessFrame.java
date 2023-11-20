import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RandomnessFrame extends JFrame {

    RandomnessFrame(){
        setTitle("Java Randomness Demonstrator");
        int width = 500, height = 500;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        int[] ar = new int[width * height];
        for ( int i=0; i < ar.length; i++){
            int value = (int)(Math.random()* 255);
            Color color = new Color(value,value,value);
            ar[i] = color.getRGB();
        }
        image.setRGB(0,0,500,500, ar, 0, width);

        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(image));
        panel.add(label, BorderLayout.CENTER);
        setContentPane(panel);
        JPanel panel2 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Rectangle rect = g.getClipBounds();
                int x = (int)rect.getX(), y = (int)rect.getY(), width = (int)rect.getWidth(), height= (int)rect.getHeight();
                for ( int i=x; i <= width + x; i++){
                    for ( int j = y; j <= height+y; j++){
                        int value = (int)(Math.random()*255);
                        Color color = new Color(value, value, value);
                        g.setColor(color);
                        g.fillRect(i,j,1,1);
                    }
                }
                g.dispose();
            }
        };
        setContentPane(panel2);
        setSize(700,700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomnessFrame();
    }
}
