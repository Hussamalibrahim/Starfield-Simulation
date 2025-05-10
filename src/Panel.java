import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    public static final int SCREEN_WIDTH = 700;
    public static final int SCREEN_HEIGHT = 700;
    Star[] star;

    Panel() {
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        setBackground(Color.BLACK);
        this.setOpaque(true);
        this.setFocusable(true);
        star = new Star[200];
        for (int i = 0; i < star.length; i++) {
            star[i] = new Star();
        }
        Timer timer = new Timer(1000/60, this);
        timer.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Apple", Font.BOLD, 2));
        g.translate(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
        for (Star value : star) {
//            g.fillOval(value.dx, value.dy, value.starSize, value.starSize);
            g.drawLine(value.dx, value.dy, value.px, value.py);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (Star s : star)
            s.move();
        repaint();
    }
}
