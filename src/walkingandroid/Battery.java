/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingandroid;

/**
* @author Italo Marcius / Rafael Muchiutti / Celia De Leon
/**
Method to check the battery state.
*/
public class Battery {
    /**
    Variable of the initial battery amount 
    */
    private double charge;
    /**
    Variable of the amount of battery after 1 sec when is recharged 
    */
    private double recharge = 2.6;

    public Battery() {
        this.charge = 8;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public void recharge() {

        this.charge = this.charge + recharge;
        if (this.charge > 8) {
            this.charge = 8;
        }

    }
/**
    Method to check the battery available to move,
    everytime that amount of battery is less than the
    amount required to do the movement the method will call Tread.sleep
    to charge the battery for 1 second adding 2.6 v
    */
    public int checkBatteryAvailable(double required) {
        int counter = 0;
        try {
            while (charge < required) {
                System.out.println("More battery power needed, charging...");
                recharge();
                Thread.sleep(1000);
                counter++;
            }
        } catch (Exception ex) {
            System.err.println("\n\nError: " + ex.getMessage());
            ex.printStackTrace();
            
        }
        return counter;
    }

}
