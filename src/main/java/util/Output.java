package util;

public class Output {

    static public void printOutput(double bmi) {
        if(18.5 < bmi || bmi < 25) {
            System.out.printf("Your BMI is %.1f\nYou are within the ideal weight range.", bmi);
        }
        else {
            System.out.printf("Your BMI is %.1f\nYou are overweight. You should see your doctor.", bmi);
        }
    }
}
