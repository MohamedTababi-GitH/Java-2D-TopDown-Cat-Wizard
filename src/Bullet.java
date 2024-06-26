import java.awt.*;
import java.awt.image.BufferedImage;

public class Bullet extends GameObject {
    private BufferedImage bullet_image;
    private Handler handler;

    public Bullet(int x, int y, ID id, Handler handler, int mx, int my, SpriteSheet ss) {
        super(x, y, id, ss);

        this.handler = handler;
        velX = (mx - x) / 10;
        velY = (my - y) / 10;
        bullet_image = ss.grabImage(6,1,64,64);
    }

    public void tick() {
        x += velX;
        y += velY;
        for (int i=0; i<handler.object.size();i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId() == ID.Block){
                if(getBounds().intersects(tempObject.getBounds())){
                    handler.removeObject(this);
                }
    }}}

    public void render(Graphics g) {
        g.drawImage(bullet_image,x,y,null);
//        g.setColor(Color.black);
//        g.fillOval(x, y, 8, 8);
    }

    public Rectangle getBounds() {

        return new Rectangle(x, y, 8, 8);
    }
}
