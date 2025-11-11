import java.awt.*; 
import java.util.*; 
import java.util.List;

public class colorLabs 
{
    public static void main (String [] args)
    {
        Picture p = new Picture("images\\swan.jpg");
        Picture p2 = new Picture("images\\swan.jpg");
        Picture p3 = new Picture("images\\swan.jpg");
        Picture p4 = new Picture("images\\swan.jpg");
        Picture p5 = new Picture("images\\swan.jpg");
        Picture p6 = new Picture("images\\swan.jpg");
        
        p.explore(); 
        Pixel [] pixels; 
        
        //#1: adjusting blue
        
        pixels = p.getPixels(); 
        
        int blue; 
        for (Pixel spot : pixels)
        {
            blue = spot.getBlue(); 
            blue *= 1.25; 
            spot.setBlue(blue); 
        }
        
        p.explore(); 
        
       
        //#2: negate
        
        pixels = p2.getPixels(); 
        
        int red, green; 
        for (Pixel spot : pixels)
        {
            blue = spot.getBlue(); 
            blue = 225 - blue; 
            spot.setBlue(blue); 
        }
        for (Pixel spot : pixels)
        {
            red = spot.getRed(); 
            red = 225 - red; 
            spot.setRed(red); 
        }
        for (Pixel spot : pixels)
        {
            green = spot.getGreen(); 
            green = 225 - green; 
            spot.setGreen(green); 
        }
        
        p2.explore(); 
        
       
       
        //#3: grayscale 
        
        pixels = p3.getPixels(); 
        
        int grey;
        for (Pixel spot : pixels)
        {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            spot.setBlue(grey); 
            spot.setGreen(grey);
            spot.setRed(grey); 
        }
        
        p3.explore();
        
       
        //#4: darken
        
        pixels = p4.getPixels(); 
        
        //int red, green, blue; 
        for (Pixel spot : pixels)
        {
            blue = spot.getBlue(); 
            blue *= .5; 
            spot.setBlue(blue); 
        }
        for (Pixel spot : pixels)
        {
            red = spot.getRed(); 
            red *= .5; 
            spot.setRed(red); 
        }
        for (Pixel spot : pixels)
        {
            green = spot.getGreen(); 
            green *= .5; 
            spot.setGreen(green); 
        }
        
        p4.explore(); 
        
       
        //#5: change color 
          
        pixels = p5.getPixels(); 
        // red, green, blue; 
        for (Pixel spot : pixels) 
        {
            red = spot.getRed() + 50; 
            blue = spot.getBlue() - 50; 
            green = spot.getGreen() + 100; 
            spot.setRed(red); 
            spot.setBlue(blue);
            spot.setGreen(green); 
        }
        p5.explore(); 
        
        
        //#6: find the rgb of your eyes/hair/face change all pixels that are close to that color (+ or – 10,15,20)
        
        pixels = p6.getPixels(); 
        
        Pixel spotSwan = p6.getPixel(270, 213); 
        System.out.print(spotSwan.getColor()); 
        //int red, green, blue;
        
        for (Pixel spot: pixels)
        {
            if (Math.abs(spot.getRed() - spotSwan.getRed()) < 75 && Math.abs(spot.getGreen() - spotSwan.getGreen()) < 75
            && Math.abs(spot.getBlue() - spotSwan.getBlue()) < 75 )
            {
                blue = spot.getBlue() + 100; 
                spot.setBlue(blue); 
            }
        }
        p6.explore(); 
    }
}