import java.util.Random;

public class Star {
    public int starSize;
    public int x;
    public int y;
    public int z;
    public int zSpeed;
    public int dx;
    public int dy;
    public int px;
    public int py;
    public int dz;

    Star() {
        starSize = new Random().nextInt(3) + 1;
        x = new Random().nextInt(Panel.SCREEN_WIDTH) - Panel.SCREEN_WIDTH / 2;
        y = new Random().nextInt(Panel.SCREEN_HEIGHT) - Panel.SCREEN_HEIGHT / 2;
        z = new Random().nextInt(Panel.SCREEN_HEIGHT );
        dz = z;
        zSpeed = new Random().nextInt(2) + 1;
    }

    public void move() {
        px = dx;
        py = dy;
        z -= zSpeed;
        if (z <= 0) {
            z = dz;
        }
        dx = (int) ((x / (double) z) * Panel.SCREEN_WIDTH / 2);
        dy = (int) ((y / (double) z) * Panel.SCREEN_HEIGHT / 2);
    }
}
