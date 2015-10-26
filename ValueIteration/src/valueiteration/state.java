/*
Joseph Andaya
COMP 151
HW 3 planning code
*/
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joseph
 */

// state objects have a utility
public class state {
    private double utility;
    
    
    public state(){
        utility = 0;
    }
    
    public state(double u){
        utility = u;
    }
    
    public double getUtility(){
        return utility;
    }
    
    public void setUtility(double u){
        utility  = u;
    }
}
