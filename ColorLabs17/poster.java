import java.awt.*;
import java.util.*; 

/**
 * lily jia's poster project 
 */
public class poster
{
    public static void main (String [] args) 
    {
        Picture poster = new Picture("images/bird.jpg");
        
        poster.explore(); 
        
        Picture bird1 = 
    }
    
    public static void addPic (Picture pic, Picture target, int x, int y)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null; 
        
        for (int sourceX = 0, targetX = x; sourceX< target.getWidth(); sourceX++)
        {
            for (int sourceY = 0, targetY = y; sourceY< target.getHeight(); sourceY++)
            {
                //set the target pix color of the source pix
                sourcePix = pic.getPixel(sourceX,sourceY);
                targetPix = target.getPixel(targetX,targetY);
                targetPix.setColor(sourcePix.getColor());
            }//loop
        }
    }
    
    public static void mirrorY (Picture pic)
    {
        int half = pic.getWidth()/2; 
        Pixel left; 
        Pixel right; 
        
        for (int y = 0; y < pic.getHeight(); y++)
        {
            for (int x = 0; x < half; x++)
            {
                left = pic.getPixel(x, y); 
                right = pic.getPixel(pic.getWidth() - 1 - x, y); 
                right.setColor(left.getColor()); 
            }
        }
    }
    
    public static void mirrorX (Picture pic) 
    {
        int half = pic.getHeight()/2; 
        Pixel top; 
        Pixel bottom; 
        
        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < half; y++)
            {
                top = pic.getPixel(x, y); 
                bottom = pic.getPixel(x, pic.getHeight() - 1 - y); 
                bottom.setColor(top.getColor()); 
            }
        }
    }
    
    public static void swirl (Picture pic)
    {
        
    }
    
    public static void blueBird (Picture pic)
    {
        Pixel [] pixels; 
        pixels = pic.getPixels(); 
        int blue; 
        
        for (Pixel spot : pixels)
        {
            blue = spot.getBlue(); 
            blue *= 1.25; 
            spot.setBlue(blue); 
        }
    }
}
