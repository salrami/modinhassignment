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
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();

    
}

    public static void main(String[] args) {
         Areas objArea = new Areas();
         
         Perimeters objPerimeter = new Perimeters(); 
       
         
	 objArea.calculateArea();
	  
	 objArea.calculateArea();
	   
	 objArea.calculateArea();
         
         objPerimeter.calculatePerimeter();
	  
	 objPerimeter.calculatePerimeter();
	   
	 objPerimeter.calculatePerimeter();
    }

    

}

class Areas extends JavaApplication36 {
    protected void calculateArea(float x) {
            System.out.println("Area of the square: "+x*x+" sq units");
    }
        
        protected void calculateArea(float x, float y) {
            System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    
        protected void calculateArea(double r) {
            double area = 3.14*r*r;
            System.out.println("Area of the circle: "+area+" sq units");
    }

}

class Perimeters extends JavaApplication36 {
        protected void calculatePerimeter(float x) {
            System.out.println("Area of the square: "+x*x+" sq units");
    }
        
        protected void calculatePerimeter(float x, float y) {
            System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    
        protected void calculatePerimeter(double r) {
            double area = 3.14*r*r;
            System.out.println("Area of the circle: "+area+" sq units");
    }

}