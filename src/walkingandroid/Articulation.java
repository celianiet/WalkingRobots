/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingandroid;

/**
* @author Italo Marcius / Rafael Muchiutti / Celia De Leon
*/
/**
Public object Articulation with the parameters 
*/
public class Articulation {
 
    private String name;
    private double angle;
    private double rotation;
    private double voltageRequired;
    private double maxAngle;
    /**
    Getters and Setters for each parameter of Articulation
    */

    public Articulation(String name, double angle, double volt, double rotation, double maxAngle) {
        this.name = name;
        this.angle = angle;
        this.voltageRequired = volt;
        this.rotation = rotation;
        this.maxAngle = maxAngle;
    }

    public double getMaxAngle() {
        return maxAngle;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
    
    

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getVoltageRequired() {
        return voltageRequired;
    }
    
    
    
    
}
