/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

public class JavaApplication36 {
        void calculateArea(float x) {
            System.out.println("Area of the square: "+x*x+" sq units");
    }
        
        void calculateArea(float x, float y) {
            System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    
        void calculateArea(double r) {
            double area = 3.14*r*r;
            System.out.println("Area of the circle: "+area+" sq units");
    }

    
    public static void main(String[] args) {
         JavaApplication36 obj = new JavaApplication36();
       
	 obj.calculateArea(6.1f);
	  
	 obj.calculateArea(10,22);
	   
	 obj.calculateArea(6.1);
    }

    

}
