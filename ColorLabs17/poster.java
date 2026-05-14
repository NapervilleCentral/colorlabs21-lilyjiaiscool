import java.awt.*;
import java.util.*; 

/**
 * lily jia's poster project 
 */
public class poster
{
    public static void main (String [] args) 
    {
        Picture pic = new Picture("images/bird.png");
        int width = pic.getWidth(); 
        int length = pic.getHeight(); 
        
        Picture poster = new Picture(width * 3, length * 2); 
        
        Picture birdmirrorY = new Picture("images/bird.png"); 
        Picture birdmirrorX = new Picture("images/bird.png"); 
        Picture blueBird = new Picture("images/bird.png"); 
        Picture swirl = new Picture("images/bird.png"); 
        Picture recurse = new Picture("images/bird.png"); 
        
        mirrorY(birdmirrorY); 
        mirrorX(birdmirrorX); 
        blueBird(blueBird); 
        swirl(swirl); 
        recurse(recurse); 
        
        addPic (pic, poster, 0, 0); 
        addPic(birdmirrorY, poster, width, 0);     
        addPic(birdmirrorX, poster, width*2, 0); 
        addPic (blueBird, poster, 0, length); 
        addPic(swirl, poster, width, length);     
        addPic(recurse, poster, width*2, length); 
        
        poster.explore(); 
    }
    
    public static void addPic (Picture pic, Picture target, int x, int y)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null; 
        
        for (int sourceX = 0; sourceX < pic.getWidth(); sourceX++)
        {
            for (int sourceY = 0; sourceY< pic.getHeight(); sourceY++)
            {
                int targetX = x + sourceX;
                int targetY = y + sourceY;
                if (targetX < target.getWidth() && targetY < target.getHeight())
                {
                    sourcePix = pic.getPixel(sourceX,sourceY);
                    targetPix = target.getPixel(targetX,targetY);
                    targetPix.setColor(sourcePix.getColor());
                }
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
    
    /**
     * outline
     * - find center
     * - the angle it rotates is based on how far it is from the center to get the tiedye swirl 
     * - multiply x by cos of angle and y by sin of angle to get new point
     * - copy over
     */
    public static void swirl (Picture pic)
    {
        Picture temp = new Picture(pic); 
        
        int x0 = pic.getWidth() / 2; //to find center
        int y0 = pic.getHeight() / 2; 
        
        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < pic.getHeight() ; y++)
            {
                int dx = x - x0 ;
                int dy = y - y0; 
                double distance = Math.sqrt(dx*dx + dy*dy); 
                double theta = distance * Math.PI * .01;
                
            }
        }
    }
    
    public static void recurse(Picture pic)
    {
        recurseHelper(pic, pic.getWidth(), pic.getHeight());
    }
    
    public static void recurseHelper(Picture pic, int width, int height)
    {
        if (width <= 100) return; 
        
        Picture temp = new Picture(pic); 
        for (int x = 0; x<width /2; x++) {
            for (int y = 0; y < height/2; y++)
            {
                Color recurse = temp.getPixel(2*x, 2*y).getColor();
                pic.getPixel(x , y).setColor(recurse); 
            }
        }
        
        recurseHelper(pic, width / 2, height / 2); 
    }
    
    public static void blueBird (Picture pic)
    {
        Pixel [] pixels; 
        pixels = pic.getPixels(); 
        int blue; 
        
        for (Pixel spot : pixels)
        {
            blue = spot.getBlue(); 
            blue *= 1.75; 
            spot.setBlue(blue); 
        }
    }
}
