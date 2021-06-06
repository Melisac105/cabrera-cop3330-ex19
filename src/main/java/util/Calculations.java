package util;

public class Calculations {

    static public double calcBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }
}
