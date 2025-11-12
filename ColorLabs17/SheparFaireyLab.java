
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         
         //relative path
         Picture apic = new Picture("images\\amy.jpg");
         //change with selfie picture
         Picture me = new Picture("images/amy.jpg");
         Picture me1 = new Picture("images/amy.jpg");
         Picture me2 = new Picture("images/amy.jpg");
         
         apic.explore(); 
         Pixel [] pixels; 
         
         //#1: grayscale
         pixels = me.getPixels(); 
         
         int grey; 
         for (Pixel spot : pixels) 
         {
             grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
             if (grey <= 70) {
                spot.setBlue(35); 
                spot.setGreen(35);
                spot.setRed(35);
            } else if (grey <= 100) {
                spot.setBlue(100);
                spot.setGreen(100);
                spot.setRed(100);
            } else if (grey <= 150) {
                spot.setBlue(150); 
                spot.setGreen(150); 
                spot.setRed(150); 
            } else if (grey <= 200) {
                spot.setBlue(200); 
                spot.setGreen(200); 
                spot.setRed(200);     
            } else {
                spot.setBlue(230); 
                spot.setGreen(230);
                spot.setRed(230); 
            }
         }
         
         me.explore(); 
         
         /**
          * method 2 change
          * find min and max, then do same thing as above 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
