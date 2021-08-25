import java.awt.Graphics;
import java.applet.Applet;

/**
 * This is an Applet that prints hello in a rectangle.
 * Arda Önal 21903350
 * 16.10.2019
 */
public class Lab02b extends Applet 
{
    
   public void paint( Graphics g)
   {
      g.drawString( "Hello...", 50, 50);
      g.drawRect( 25, 25, 100, 50);
   }
    
}