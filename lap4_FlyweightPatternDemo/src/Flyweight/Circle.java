/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author BANK
 */
public class Circle implements Shape {
    private String   color;
    private int radius;
    private int x;
    private int y;
    
    public Circle(String color){}
    public void setx(int x){}
    public void sety(int y){}
    public void setradius(int radius){}

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
