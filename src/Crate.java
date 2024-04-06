import java.awt.*;
import java.awt.image.BufferedImage;

public class Crate extends GameObject{
    private BufferedImage crate_image;
    public Crate(int x, int y, ID id, SpriteSheet ss) {
        super(x, y, id, ss);
        crate_image = ss.grabImage(4,1,64,64);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.drawImage(crate_image,x,y,null);
//        g.setColor(Color.cyan);
//        g.fillRect(x,y,32,32);
    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,32,32);
    }
}
