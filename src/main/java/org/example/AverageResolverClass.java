package org.example;

import static java.lang.Math.round;

public class AverageResolverClass{

    ListClass listClass;

    public AverageResolverClass(ListClass listClass) {
        this.listClass = listClass;

    }


    public double returnListAverage() {
        double sum = 0;
        for (int i = 0; i < listClass.getIntegerList().size(); i++){
            sum += listClass.getIntegerList().get(i);
        }
        double res = sum / listClass.getIntegerList().size();
        return Math.round(res * 100.0) / 100.0;
    }


}
