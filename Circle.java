/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author arnol
 */

public class Circle {
     private double radius;
     private String color;
    Circle(){
        
    }
    
    public Circle(double radius) {
        this.radius = 1.0;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
