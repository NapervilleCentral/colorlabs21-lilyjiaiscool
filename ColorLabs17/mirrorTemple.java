
/**
 * Write a description of class mirrorTemple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mirrorTemple
{
    public static void main (String [] args) 
    {
        Picture temple = new Picture("images\\temple.jpg");
        Picture temple2 = new Picture( "images\\temple.jpg");
        
        Pixel [] pixels; 
        pixels = temple.getPixels(); 
        
        temple.explore(); 
        mirrorTemple(temple, temple2); 
        temple2.explore(); 
        }
    
    public static void mirrorTemple (Picture sourcePic, Picture targetPic)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null; 
        
        for (int sourceX = 0, targetX = sourcePic.getWidth() - 1; sourceX< targetX; sourceX++, targetX --)
        {
            for (int sourceY = 0, targetY = 0; sourceY< 150; sourceY++, targetY ++)
            {
                //set the target pix color of the source pix
                sourcePix = sourcePic.getPixel(sourceX,sourceY);
                targetPix = targetPic.getPixel(targetX,targetY);
                targetPix.setColor(sourcePix.getColor());
            }//loop
        }
    }
}
