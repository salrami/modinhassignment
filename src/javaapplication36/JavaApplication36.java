/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;
//superclass
public class JavaApplication36 {
    public double length;
    public double width;
    public double radius;
    
    //encapsulating 
    protected void getLength(double newValue) {
	this.length = newValue;
	}
    
    protected void getWidth(double newValue) {
	this.width = newValue;
	}

    protected void getRadius(double newValue) {
	this.radius = newValue;
	}
    
    protected double calcArea() {
	return 0;
	}
    
    protected double calcPeri() {
	return 0;
	}
    
    public void output() {
		System.out.println("The area is " + calcArea());
		System.out.println("The perimeter is " + calcPeri());
    }
    public JavaApplication36() {
        length = 0;
        width = 0;
        radius = 0;

}

    public static void main(String[] args) {
        //instantiation of objects
        JavaApplication36 obj = new JavaApplication36();
        Rectangle robj = new Rectangle(); 
        Circle cobj = new Circle();
        //checking if user inputs a number 
        while (true) {
            try {
            Scanner input = new Scanner(System.in);

        
            System.out.print("Enter length: ");
            double length_value = input.nextDouble();
            robj.getLength(length_value);
        
            System.out.print("Enter width: ");
            double width_value = input.nextDouble();
            robj.getWidth(width_value);
        
            System.out.print("Enter radius: ");
            double radius_value = input.nextDouble();
            cobj.getRadius(radius_value);
        
            System.out.println("The output of your rectangle is: ");
            robj.output();
            System.out.println("The output of your circle is: ");
            cobj.output();
            break;
           
        } catch (Exception e) {
            System.out.println("Enter a number");
            
        }
            
       }
        
    }

}
//subclasses for shapes
class Rectangle extends JavaApplication36 {
    public double calcArea() {
        double area = Math.round(length*width);
        return area;
        
    }
        
    public double calcPeri() {
        double perimeter = Math.round(2*length + 2*width);
        return perimeter;
        
    }

}

class Circle extends JavaApplication36 {
    public double calcArea() {
        double area = Math.round(Math.PI*(radius*radius));
        return area;
        
    }
        
    public double calcPeri() {
        double perimeter = Math.round(2*Math.PI*radius);
        return perimeter;
        
    }

}