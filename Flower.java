import ecs100.*;
import java.awt.Color;
/**
 * Flower support class
 * Create a flower of a size and colour
 * Can grow
 * It can tell the driver class where it is on the screen
 *
 * @author LH
 * @version 28/3/22
 */


public class Flower
{
    // instance variables
    private double flowerX = -100;  // x pos of the flower
    private double flowerY = -100;  // y pos of the flower
    
    private int flowerSize;         // flower size
    private int flowerHeight;       // flower height
    
    private double left;            // left of flower
    private double top;             // top of flower        
    private double bottom;          // bottom of flower
    
    private Color color;            // Color of flower
    
    /**
     * Constructer
     */
    public Flower(double x, double y, int size, int stem, Color col) 
    {
        // initialise instance variables 
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;   
        
        // set top, left, and bottom
        this.setTop();
        this.setLeft();
        this.setBottom();
    }
    
    /**
     * Set left
     */
    public void setLeft() {
        this.left = this.flowerX - this.flowerSize/2.0;
    }
    
    /**
     * Set top
     */
    public void setTop() {
     this.top = this.flowerY - this.flowerSize/2.0;   
    }
    
    /**
     * Set bottom
     */
    public void setBottom() {
     this.bottom = this.flowerY - this.flowerHeight;   
    }
    
    /**
     * Draw the flower on screen
     */
    public void draw() {
     // draw stem
     UI.setColor(Color.green);      // set colour of stem
     UI.setLineWidth(2);            // set width of stem
     UI.drawLine(flowerX, flowerY, flowerX, bottom);    // draw in stem
     
     // draw flower
     UI.setColor(this.color);       // set colour of flower
     UI.fillOval(left, top, flowerSize, flowerSize);    // draw flower
     UI.sleep(500);     // wait
    }
}
