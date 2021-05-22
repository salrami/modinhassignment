/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;

public class JavaApplication36 {
    public double x;
    public double y;
    public JavaApplication36() {

    
}

    public static void main(String[] args) {
         Rectangle rec = new Rectangle();
         
         Circle objPerimeter = new Circle(); 
         
         rec.calcAreaRect();
         
         
       
         
    }

    

}

class Rectangle extends JavaApplication36 {
    public double calcAreaRect() {
        double areaRec = x*x;
        return areaRec;
        
    }

}

class Circle extends JavaApplication36 {
        protected void calculateArea(float x) {
            System.out.println("Area of the circle: "+x*x+" sq units");
    }
        
        protected void calculatePerimeter(float x, float y) {
            System.out.println("Area of the circle: "+x*y+" sq units");
    }
   
}