package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {

    ArrayList<Integer> integerList;

    public ListClass() {
        this.integerList = new ArrayList<>();
    }

    public void addNumber(Integer num){
        integerList.add(num);
    }
    public ArrayList<Integer> getIntegerList(){
        return integerList;
    }

    @Override
    public String toString() {
        return "ListClass{" +
                "integerList=" + integerList +
                '}';
    }
}
