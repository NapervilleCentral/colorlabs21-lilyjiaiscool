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
    }
    
    public static void addPic (Picture pic)
    {
        
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
        
    }
}
