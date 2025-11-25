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
         //relative path
         Picture apic = new Picture("images\\amy.jpg");
         //change with selfie picture
         Picture me = new Picture("images/amy.jpg");
         Picture me1 = new Picture("images/amy.jpg");
         Picture me2 = new Picture("images/amy.jpg");
         
         apic.explore(); 
         Pixel [] pixels; 
         
         //#1: grayscale testing
         pixels = me.getPixels(); 
         int grey; 
         
         /*
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
         me.write("images/sf1.jpg");
         
         */
         //#2: balance trial 
         /*
         for (Pixel spot : pixels) 
         {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            if (grey <= 70) {
                spot.setBlue(86); 
                spot.setGreen(42);
                spot.setRed(30);
            } else if (grey <= 130) {
                spot.setBlue(0);
                spot.setGreen(0);
                spot.setRed(139);
            } else if (grey <= 180) {
                spot.setBlue(206); 
                spot.setGreen(173); 
                spot.setRed(107); 
            } else {
                spot.setBlue(226); 
                spot.setGreen(255);
                spot.setRed(244); 
            }
         }
         me.explore(); 
         me.write("images/sf2.jpg");
         */
         
         
         //#3: an intense approach
         /*
         int min = 5, max = 255; //very similar to original
         for (Pixel spot : pixels)
         {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            if (grey <= 70) {
                spot.setBlue(86); 
                spot.setGreen(42);
                spot.setRed(30);
            } else if (grey <= 130) {
                spot.setBlue(0);
                spot.setGreen(0);
                spot.setRed(139);
            } else if (grey <= 180) {
                spot.setBlue(206); 
                spot.setGreen(173); 
                spot.setRed(107); 
            } else {
                spot.setBlue(226); 
                spot.setGreen(255);
                spot.setRed(244); 
            }
         }
         me.explore(); */
         
         //#4: custom!
         
         //#iteration 1:
         /*
         for (Pixel spot : pixels)
         {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            if (grey <= 50) {
                spot.setBlue(52); 
                spot.setGreen(25);
                spot.setRed(1);
            } else if (grey <= 130) {
                spot.setBlue(40);
                spot.setGreen(16);
                spot.setRed(118);
            } else if (grey <= 180) {
                spot.setBlue(106); 
                spot.setGreen(167); 
                spot.setRed(208); 
            } else if (grey <= 200) {
                spot.setBlue(157); 
                spot.setGreen(213); 
                spot.setRed(178);  
            } else {
                spot.setBlue(226); 
                spot.setGreen(255);
                spot.setRed(244); 
            }
         }
         me.explore(); 
         me.write("images/sf3.jpg");
         
         */
         
         //#iteration 2: 
         
         /*
         for (Pixel spot : pixels)
         {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            if (grey <= 60) {
                spot.setBlue(28); 
                spot.setGreen(32);
                spot.setRed(44);
            } else if (grey <= 120) {
                spot.setBlue(74);
                spot.setGreen(34);
                spot.setRed(82);
            } else if (grey <= 170) {
                spot.setBlue(145); 
                spot.setGreen(138); 
                spot.setRed(0); 
            } else {
                spot.setBlue(202); 
                spot.setGreen(221);
                spot.setRed(227); 
            }
         }
         me.explore(); 
         me.write("images/sf4.jpg");
         
         */
         
         //#FINAL
         
         
         for (Pixel spot : pixels)
         {
            grey = (spot.getBlue() + spot.getRed() + spot.getGreen())/3;
            if (grey <= 40) {
                spot.setBlue(28); 
                spot.setGreen(32);
                spot.setRed(44);
            } else if (grey <= 100) {
                spot.setBlue(74);
                spot.setGreen(34);
                spot.setRed(82);
            } else if (grey <= 140) {
                spot.setBlue(145); 
                spot.setGreen(138); 
                spot.setRed(0); 
            } else if (grey <= 190) {
                spot.setBlue(28); 
                spot.setGreen(150); 
                spot.setRed(232);  
            } else {
                spot.setBlue(202); 
                spot.setGreen(221);
                spot.setRed(227); 
            }
         }
         me.explore(); 
         me.write("images/sf5.jpg");
         
    }  
}
