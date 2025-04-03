package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {

    public double calcalc(ArrayList<Double> siffror){
        double sum = 0;

        for (double value : siffror){
            sum += value;
        }
        return sum/siffror.size();
    }


}
