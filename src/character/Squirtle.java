/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nick
 */
public class Squirtle {

    public Squirtle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(Graphics graphics) {
        
        graphics.drawRect(x, y, width, height);
        
        //Body
        graphics.setColor(Color.PINK);     
        graphics.fillOval(x+ (width * 15 / 100), y + (height * 30 / 100), width * 15 / 100 , height * 15 / 100);  
        graphics.fillOval(x, y, width, height);
        //left ear outside
        int[] xValues = new int[3];
        xValues[0] = x + (width * 90 / 100);
        xValues[1] = x + (width * 20 / 100);
        xValues[2] = x + (width * 85 / 100);

        int[] yValues = new int[3];
        yValues[0] = y + (height * 1 / 100);
        yValues[1] = y + (height * 20 / 100);
        yValues[2] = y + (height * 65 / 100);
        
        graphics.fillPolygon(xValues, yValues,3);
        
          //left ear outside
        graphics.setColor(Color.BLACK);
        int[] x2Values = new int[3];
        x2Values[0] = x + (width * 88 / 100);
        x2Values[1] = x + (width * 77 / 100);
        x2Values[2] = x + (width * 85 / 100);

        int[] y2Values = new int[3];
        y2Values[0] = y + (height * 4 / 100);
        y2Values[1] = y + (height * 8 / 100);
        y2Values[2] = y + (height * 14 / 100);
        
        //right ear inside
        
        graphics.fillPolygon(x2Values, y2Values, 3);
         graphics.setColor(Color.BLACK);
        int[] x3Values = new int[3];
        x3Values[0] = x + (width * 10 / 100);
        x3Values[1] = x + (width * 13 / 100);
        x3Values[2] = x + (width * 22 / 100);

        int[] y3Values = new int[3];
        y3Values[0] = y + (height * 5 / 100);
        y3Values[1] = y + (height * 16 / 100);
        y3Values[2] = y + (height * 9 / 100);
        
        graphics.fillPolygon(x3Values, y3Values, 3);
        
        //right ear outside
       
         graphics.setColor(Color.BLACK);
        int[] x4Values = new int[3];
        x4Values[0] = x + (width * 10 / 100);
        x4Values[1] = x + (width * 13 / 100);
        x4Values[2] = x + (width * 22 / 100);

        int[] y4Values = new int[3];
        y4Values[0] = y + (height * 5 / 100);
        y4Values[1] = y + (height * 16 / 100);
        y4Values[2] = y + (height * 9 / 100);
        
        graphics.fillPolygon(x4Values, y4Values, 3);
        
        

        
        //left eye black ring very outside
         graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 25 / 200), y + (height * 55 / 200), width * 20 / 100 , height * 20 / 100);
        //left eye white
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+ (width * 26 / 200), y + (height * 56 / 200), width * 19 / 100 , height * 19 / 100);
        //left eye outside
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 29 / 200), y + (height * 59 / 200), width * 16 / 100 , height * 16 / 100);
        //left eye inside color
        graphics.setColor(Color.green);
        graphics.fillOval(x+ (width * 15 / 100), y + (height * 30 / 100), width * 15 / 100 , height * 15 / 100);
        //left eye inside purpil black ring
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 35 / 200), y + (height * 65 / 200), width * 4 / 100 , height * 4 / 100);
        //left eye inside purpil
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+ (width * 36 / 200), y + (height * 66 / 200), width * 3 / 100 , height * 3 / 100);
        
        
        
          //right eye black ring very outside
         graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 125 / 200), y + (height * 55 / 200), width * 20 / 100 , height * 20 / 100);
        //right eye white
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+ (width * 126 / 200), y + (height * 56 / 200), width * 19 / 100 , height * 19 / 100);
        //right eye outside
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 129 / 200), y + (height * 59 / 200), width * 16 / 100 , height * 16 / 100);
        //right eye inside color
        graphics.setColor(Color.green);
        graphics.fillOval(x+ (width * 65 / 100), y + (height * 30 / 100), width * 15 / 100 , height * 15 / 100);
        //right eye inside purpil black ring
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 135 / 200), y + (height * 65 / 200), width * 4 / 100 , height * 4 / 100);
        //right eye inside purpil
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+ (width * 136 / 200), y + (height * 66 / 200), width * 3 / 100 , height * 3 / 100);
        
        //moulth
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 90 / 200), y + (height * 120 / 200), width * 5 / 100 , height * 5 / 100);
        graphics.setColor(Color.red);
        graphics.fillOval(x+ (width * 91 / 200), y + (height * 121 / 200), width * 4 / 100 , height * 4 / 100);
        graphics.setColor(Color.black);
        graphics.fillRect(x+ (width * 90 / 200), y + (height * 115 / 200), width * 5 / 100 , height * 5 / 100);
        graphics.setColor(Color.pink);
        graphics.fillRect(x+ (width * 90 / 200), y + (height * 114 / 200), width * 5 / 100 , height * 5 / 100);
       
        //hand right
        graphics.setColor(Color.black);
        graphics.drawArc(x+ (width * 20 / 200), y + (height * 145 / 200), width * 16 / 100 , height * 8 / 100 , 210, 200);
        
        //Hand left
        graphics.setColor(Color.black);
        graphics.drawArc(x+ (width * 140 / 200), y + (height * 145 / 200), width * 16 / 100 , height * 8 / 100 , 140, 200);
        
           
        //right eye inside color
        graphics.setColor(Color.green);
        graphics.fillRoundRect(x, y,30, 30, 30, 30);
        //right eye outside
        graphics.setColor(Color.WHITE);
        graphics.drawRoundRect(x, y, 31,31 , 450, 450);
        //right eye inside purpil
        graphics.setColor(Color.WHITE);
        graphics.fillRoundRect(x, y,10, 10, 10, 10);
        
        
        
        graphics.setColor(Color.red);
        graphics.drawRect(x, y, width, height);
    }
   

    private int x;
    private int y;
    private int width;
    private int height;

}
