package org.example;

public class Main {
    public static void main(String[] args) {
        ListClass list1 = new ListClass();
        ListClass list2 = new ListClass();
        AverageResolverClass averageResolverClass1 = new AverageResolverClass(list1);
        AverageResolverClass averageResolverClass2 = new AverageResolverClass(list2);
        CompareAverageClass cac = new CompareAverageClass();

        list1.addNumber(1);
        list1.addNumber(4);
        list1.addNumber(9);

        list2.addNumber(2);
        list2.addNumber(12);
        list2.addNumber(8);

        System.out.println(list1);
        System.out.println(list2);

        double num1 = averageResolverClass1.returnListAverage();
        double num2 = averageResolverClass2.returnListAverage();

        System.out.println(averageResolverClass1.returnListAverage());
        System.out.println(averageResolverClass2.returnListAverage());
        cac.returnLargest(num1, num2);
    }
}