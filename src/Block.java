import java.awt.*;
import java.awt.image.BufferedImage;

public class Block extends GameObject{
    private BufferedImage block_image;

    public Block(int x, int y, ID id, SpriteSheet ss) {
        super(x, y, id, ss);
        block_image = ss.grabImage(2, 1,64,64);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.drawImage(block_image,x,y,null);
//g.setColor(Color.black);
//g.fillRect(x,y,32,32);
    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,64,64);
    }
}
