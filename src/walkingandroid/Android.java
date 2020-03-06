/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingandroid;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Italo Marcius / Rafael Muchiutti / Celia De Leon
 */
public class Android {
    /**
    Data Object Android, with the arrays list per articulation with the parameters:
    - Name of the articulation,
    - Initial position
    - Voltage required to move 15 degrees
    - Max angle movement
    */

    private Articulation head = new Articulation("Head", 90, 3, 0, 180);
    private Articulation neck = new Articulation("Neck", 0, 3, 0, 30);
    private Articulation rightShoulder = new Articulation("Right Shoulder", 20, 2, 0, 180);
    private Articulation leftShoulder = new Articulation("Left Shoulder", 20, 2, 0, 180);
    private Articulation rightElbow = new Articulation("Right Elbow", 180, 3, 0, 140);
    private Articulation leftElbow = new Articulation("Left Elbow", 180, 3, 0, 140);
    private Articulation rightWrist = new Articulation("Right Wrist", 170, 2, 0, 180);
    private Articulation leftWrist = new Articulation("Left Wrist", 170, 2, 0, 180);

    private Articulation leftHip = new Articulation("Left Hip", 170, 4, 0, 90);
    private Articulation rightHip = new Articulation("Right Hip", 170, 4, 0, 90);
    private Articulation waist = new Articulation("waist", 0, 4, 0, 30);
    private Articulation rightKnee = new Articulation("Right Knee", 85, 3, 0, 90);
    private Articulation leftKnee = new Articulation("Left Knee", 85, 3, 0, 90);
    private Articulation rightAnkle = new Articulation("Right Ankle", 85, 3, 0, 30);
    private Articulation leftAnkle = new Articulation("Left Ankle", 85, 3, 0, 30);
    /*
    battery initialization
    */
    private Battery battery = new Battery();
    /*
    counter initialization
    */
    private int counter;
    /*
    Getter and setters
    */
    public Articulation getHead() {
        return head;
    }

    public void setHead(Articulation head) {
        this.head = head;
    }

    public Articulation getWaist() {
        return waist;
    }

    public void setWaist(Articulation waist) {
        this.waist = waist;
    }

    public Articulation getRightShoulder() {
        return rightShoulder;
    }

    public void setRightShoulder(Articulation rightShoulder) {
        this.rightShoulder = rightShoulder;
    }

    public Articulation getLeftShoulder() {
        return leftShoulder;
    }

    public void setLeftShoulder(Articulation leftShoulder) {
        this.leftShoulder = leftShoulder;
    }

    public Articulation getRightElbow() {
        return rightElbow;
    }

    public void setRightElbow(Articulation rightElbow) {
        this.rightElbow = rightElbow;
    }

    public Articulation getLeftElbow() {
        return leftElbow;
    }

    public void setLeftElbow(Articulation leftElbow) {
        this.leftElbow = leftElbow;
    }

    public Articulation getRightKnee() {
        return rightKnee;
    }

    public void setRightKnee(Articulation rightKnee) {
        this.rightKnee = rightKnee;
    }

    public Articulation getLeftKnee() {
        return leftKnee;
    }

    public void setLeftKnee(Articulation leftKnee) {
        this.leftKnee = leftKnee;
    }

    public Articulation getRightAnkle() {
        return rightAnkle;
    }

    public void setRightAnkle(Articulation rightAnkle) {
        this.rightAnkle = rightAnkle;
    }

    public Articulation getLeftAnkle() {
        return leftAnkle;
    }

    public void setLeftAnkle(Articulation leftAnkle) {
        this.leftAnkle = leftAnkle;
    }
    /**
    Stand up method:
    */
    public void stand() {

        System.out.println("\n**** Preparing to stand ****\n");
        /**
        Setting the values to the group of movements for standing up
        */

        Articulation[] group1List = {leftHip, rightHip, rightElbow, leftElbow, leftShoulder, rightShoulder};
        double[] toMoveGroupAngles1 = {-15, -15, -20, -20, -10, -10};

        Articulation[] group2List = {leftShoulder, rightShoulder, leftElbow, rightElbow, leftWrist, rightWrist, leftHip, rightHip, leftKnee, rightKnee, rightAnkle, leftAnkle};
        double[] toMoveGroupAngles2 = {10, 10, 50, 50, 15, 15, 40, 40, 25, 25, -5, -5};

        Articulation[] group3List = {head, leftShoulder, rightShoulder, leftElbow, rightElbow, leftWrist, rightWrist, leftHip, rightHip, leftKnee, rightKnee, leftKnee, rightKnee};
        double[] toMoveGroupAngles3 = {20, 20, 20, 20, 20, -10, -10, 60, 60, 60, 60, 10, 10};
        /**
         * Set the time counter in 0
        */
        counter = 0;
        /**
         * Running runStep with the stand up group of articulations
         */

        runStep(group1List, toMoveGroupAngles1);
        runStep(group2List, toMoveGroupAngles2);
        runStep(group3List, toMoveGroupAngles3);

        System.out.println("\n**** Stand up Completed in " + counter + " sec ****\n");
    }
/**
 * Walk method
 */
    public void walk() {

        System.out.println("\n**** Preparing to walk ****\n");
        /**
        Setting the values to the group of movements for walking
        */

        Articulation[] group4List = {rightShoulder, leftShoulder, rightElbow, leftElbow, waist, leftHip, leftKnee, leftAnkle};
        double[] toMoveGroupAngles4 = {-10, -10, 30, 30, 30, -20, -70, -30};

        Articulation[] group5List = {rightShoulder, leftShoulder, rightElbow, leftElbow, waist, rightHip, leftHip, rightKnee, leftKnee, rightAnkle, leftAnkle};
        double[] toMoveGroupAngles5 = {20, 20, -30, -30, -60, 20, 20, 10, 80, -10, 40};

        Articulation[] group6List = {rightShoulder, leftShoulder, waist, rightHip, leftHip, rightKnee, rightAnkle};
        double[] toMoveGroupAngles6 = {-20, -20, 60, 10, 10, -10, 20};

        Articulation[] group7List = {rightShoulder, leftShoulder, waist, rightHip, rightKnee, leftKnee, rightAnkle, leftAnkle};
        double[] toMoveGroupAngles7 = {20, 20, -60, -40, -80, -10, -10, -10};

        Articulation[] group8List = {rightShoulder, leftShoulder, waist, rightHip, leftKnee, rightAnkle, leftAnkle};
        double[] toMoveGroupAngles8 = {-20, -20, 60, 10, 10, -10, -10};

        Articulation[] group9List = {rightShoulder, leftShoulder, rightElbow, leftElbow, waist, rightHip, leftHip, rightKnee, leftKnee, rightAnkle};
        double[] toMoveGroupAngles9 = {20, 20, -10, -10, -60, 20, 10, 80, 10, 20};

        Articulation[] group10List = {rightShoulder, leftShoulder, rightElbow, leftElbow, waist, rightHip, leftHip, leftKnee, rightAnkle};
        double[] toMoveGroupAngles10 = {10, 10, 10, 10, 60, 10, 10, -10, -10};

        Articulation[] group11List = {rightShoulder, leftShoulder, rightElbow, leftElbow, waist, rightHip, leftHip, rightKnee, leftAnkle};
        double[] toMoveGroupAngles11 = {10, 10, -20, -20, -60, -10, -30, -10, 10};

        counter = 0;
        /**
         * Running runStep with the walk group of articulations
         */
        runStep(group4List, toMoveGroupAngles4);
        runStep(group5List, toMoveGroupAngles5);
        runStep(group6List, toMoveGroupAngles6);
        runStep(group7List, toMoveGroupAngles7);
        runStep(group8List, toMoveGroupAngles8);
        runStep(group9List, toMoveGroupAngles9);
        runStep(group10List, toMoveGroupAngles10);
        runStep(group11List, toMoveGroupAngles11);

        System.out.println("\n**** Walk Completed in " + counter + " sec ****\n");

    }
/**
 * Sit down method
 */
    public void sit() {

        System.out.println("\n**** Preparing to sit ****\n");
        /**
        Setting the values to the group of movements for sitting
        */

        Articulation[] group12List = {head, leftShoulder, rightShoulder, leftElbow, rightElbow, leftWrist, rightWrist, leftHip, rightHip, leftKnee, rightKnee, leftKnee, rightKnee};
        double[] toMoveGroupAngles12 = {-20, -20, -20, -20, -20, 10, 10, -60, -60, -60, -60, -10, -10};

        Articulation[] group13List = {leftShoulder, rightShoulder, leftElbow, rightElbow, leftWrist, rightWrist, leftHip, rightHip, leftKnee, rightKnee, rightAnkle, leftAnkle};
        double[] toMoveGroupAngles13 = {-10, -10, -50, -50, -15, -15, -40, -40, -25, -25, 5, 5};

        Articulation[] group14List = {leftHip, rightHip, rightElbow, leftElbow, leftShoulder, rightShoulder};
        double[] toMoveGroupAngles14 = {15, 15, 20, 20, 10, 10};

        counter = 0;
        /**
         * Running runStep with the sitdown group of articulations
         */
        runStep(group12List, toMoveGroupAngles12);
        runStep(group13List, toMoveGroupAngles13);
        runStep(group14List, toMoveGroupAngles14);

        System.out.println("\n**** Sitdown Completed in " + counter + " sec ****\n");
    }
/**
 * Check the list to determinate the end of the movement
 * @param list
 * @return 
 */
    public boolean endMoviment(double[] list) {
        boolean end = false;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                count++;
            }
        }

        if (count == list.length) {
            end = true;
        }
        return end;
    }
    /**
    *Method runStep is the algorithms to execute
    */
    public void runStep(Articulation[] step1List, double[] finalAngle) {
        /**
        *To calculate the percentage of movement for each angle
        */

        double[] percStep1 = new double[step1List.length];
        double[] movedAnglesStep1 = new double[step1List.length];
        

        do {

            double minBatteryRequired = 1;
            double totalAngle = 0;
            int checkMove = 0;
             /**
            *Go over to the first group of movement and summarize the angles
             */
            for (int i = 0; i < step1List.length; i++) {

                totalAngle = totalAngle + Math.abs(finalAngle[i]);
                if (checkMovement(finalAngle[i], step1List[i].getMaxAngle())) {
                    checkMove++;
                }
            }

            if (checkMove > 0) {
                /**
                *If the movement is over 60% of the total allow per aticulation, I am adding 3v.
                */
                minBatteryRequired = minBatteryRequired + 3;
                System.out.println("\n---- Movement over 60% of maximun allowed, extra 3v required ----\n");
            }
            counter = counter + battery.checkBatteryAvailable(minBatteryRequired);
            /*calcutating amount of degrees that each articulation will be allowed to move per second*/
            for (int i = 0; i < step1List.length; i++) {

                double percA = 0;
                /**
                 * Assigning a proportional % of moving to each articulation
                 */
                percA = Math.abs(finalAngle[i]) / totalAngle;
                /**
                 * amount of battery that will be used by this articulation in this second stage
                 */
                percStep1[i] = (battery.getCharge() - 1) * percA;

                /**
                 * Calculating angle of movement*/
                double degree = 0;
                /**
                *We take the voltage that is used for each articulation at this stage and we are comparing by a rule of 3 with the voltage 
                *required per this articulation to move 15 degrees.
                */
                degree = (percStep1[i] * 15) / step1List[i].getVoltageRequired();
                /**
                 * Validation to check if the angle that we am allow to move is bigger than the angle that we need to move.
                 */

                if (degree > Math.abs(finalAngle[i])) {
                    degree = Math.abs(finalAngle[i]);
                    percStep1[i] = (degree * step1List[i].getVoltageRequired())/15;
                }
                /**
                *Real angle of movement
                */
                movedAnglesStep1[i] = degree;
            }
            /**
            *Valition to check the orientation of the movement, taking movement forward in positive and movements backwards in negative
            */

            for (int i = 0; i < step1List.length; i++) {
                /**
                 * moving articulations*/
                double result = 0;
                if (Math.signum(finalAngle[i]) >= 0) {
                    result = step1List[i].getAngle() + movedAnglesStep1[i];
                    finalAngle[i] = finalAngle[i] - movedAnglesStep1[i];
                } else if (Math.signum(finalAngle[i]) < 0) {
                    result = step1List[i].getAngle() - movedAnglesStep1[i];
                    finalAngle[i] = finalAngle[i] + movedAnglesStep1[i];
                }
                step1List[i].setAngle(result);

                /**
                 * using battery
                 */
                double endBattery = battery.getCharge() - percStep1[i];
                battery.setCharge(endBattery);

            }

            battery.recharge();
            try {
                counter++;
                printMove(step1List, movedAnglesStep1, finalAngle);

                Thread.sleep(1000);

            } catch (Exception ex) {
                System.err.println("\n\nError: " + ex.getMessage());
                ex.printStackTrace();
            }
        } while (!endMoviment(finalAngle));

        System.out.println(toString());
    }

    public boolean checkMovement(double move, double max) {
        /**
         * 
        check if the movement was bigger than 60% of the total movement allow
        Math.abs give me the value absolut of an number
        */
        double result = Math.abs(move) / max;
        if (result > 0.6) {
            return true;
        }
        return false;
    }

    /**
       * Print out the angles variations
     */
    public void printMove(Articulation[] list, double[] angleMoved, double[] finalAngle) {

        System.out.println("\n ---- Time counter: " + counter + " sec ----\n");

        for (int i = 0; i < list.length; i++) {

            if (Math.signum(finalAngle[i]) >= 0) {
                System.out.println(list[i].getName() + ": " + list[i].getAngle() + " (+" + angleMoved[i] + ")");
            } else if (Math.signum(finalAngle[i]) < 0) {
                System.out.println(list[i].getName() + ": " + list[i].getAngle() + " (-" + angleMoved[i] + ")");
            }
        }

    }
    /**
    *To String Angles board 
    */

    @Override
    public String toString() {
        return "\n>>>> Android Articulations <<<<\n\n"
                + "Head: " + head.getAngle() + "\n"
                + "Neck: " + neck.getAngle() + "\n"
                + "Right Shoulder: " + rightShoulder.getAngle() + "\n"
                + "Left Shoulder: " + leftShoulder.getAngle() + "\n"
                + "Right Elbow: " + rightElbow.getAngle() + "\n"
                + "Left Elbow: " + leftElbow.getAngle() + "\n"
                + "Waist: " + waist.getAngle() + "\n"
                + "Left Hip: " + leftHip.getAngle() + "\n"
                + "right Hip: " + rightHip.getAngle() + "\n"
                + "Right Knee: " + rightKnee.getAngle() + "\n"
                + "Left Knee: " + leftKnee.getAngle() + "\n"
                + "Right Ankle: " + rightAnkle.getAngle() + "\n"
                + "Left Ankle: " + leftAnkle.getAngle() + "\n\n";
    }

}
