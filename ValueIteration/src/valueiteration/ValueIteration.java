/*
Joseph Andaya
COMP 151
HW 3 planning code
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

public class ValueIteration {
    
    public static void main(String[] args) {
        int i, choice;
        double s1UtilPogo, s1UtilBike, s1UtilFinal;
        double s2UtilPogo, s2UtilBike, s2UtilFinal;
        double s3UtilPogo, s3UtilBike, s3UtilFinal;
        
        // initialize states
        state s1 = new state();
        state s2 = new state();
        state s3 = new state();
        state s4 = new state(-4);
        state s5 = new state(2);
        state s6 = new state(5);
        state s7 = new state(-2);

        // get the number of iterations from user
        System.out.println("input number of iterations: ");
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        
        // loops for the number of iterations chosen
        for (i = 0; i < choice; i++){
            // calculate the utility for s3 bike and pogo
            s3UtilPogo = (-0.1 +(0.5*s6.getUtility()) + (0.5*s3.getUtility()));
            s3UtilBike = (-0.1 + (0.5*s7.getUtility()) + (0.5*s6.getUtility()));
            
            // sets the utility based on the choice with greater utility
            if(s3UtilPogo > s3UtilBike)
                s3.setUtility(s3UtilPogo);
            else
                s3.setUtility(s3UtilBike);
            
            // calculate the utility for s2 bike and pogo
            s2UtilPogo = (-0.1 + (0.5*s4.getUtility()) + (0.5*s5.getUtility()));
            s2UtilBike = (-0.1 + (0.25*s3.getUtility()) + (0.75*s4.getUtility()));
            
            // sets the utility based on the choice with greater utility
            if(s2UtilPogo > s2UtilBike)
                s2.setUtility(s2UtilPogo);
            else
                s2.setUtility(s2UtilBike);
            
            // calculate the utility for s1 bike and pogo
            s1UtilPogo = (-0.1 + (0.5*s2.getUtility()) + (0.5*s1.getUtility()));
            s1UtilBike = (-0.1 + (0.5*s2.getUtility()) + (0.5*s3.getUtility()));
            
            // sets the utility based on the choice with greater utility
            if(s1UtilPogo > s1UtilBike)
                s1.setUtility(s1UtilPogo);
            else
                s1.setUtility(s1UtilBike);
            
        }
        
        // display results after all iterations have finished
        System.out.println("Utilities after all iterations:" );
        System.out.println("U(S1) = " + s1.getUtility());
        System.out.println("U(S2) = " + s2.getUtility());
        System.out.println("U(S3) = " + s3.getUtility());
        
    } 
}
