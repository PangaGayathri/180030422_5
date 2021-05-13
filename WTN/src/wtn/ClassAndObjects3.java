package wtn;
import java.util.*;
public class ClassAndObjects3 {

	public static void main(String[] args) {
        BMICalc();
        BMICalcBonus1();
        BMICalcBonus1FeetInches();
    }

    public static void BMICalc() {
        Scanner keyboard = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();
        BMI = weight / (height * height);
        System.out.println();
        System.out.println("Your BMI is " + BMI);
        
        keyboard.close();
    }

    public static void BMICalcBonus1() {
        Scanner keyboard = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in inches: ");
        height = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
        
        keyboard.close();
    }
    public static void BMICalcBonus1FeetInches() {
    	
        Scanner keyboard = new Scanner(System.in);
        double height, heightFeet, heightInches, weight, BMI;
        System.out.print("Your height (feet only): ");
        heightFeet = keyboard.nextDouble();
        System.out.print("Your height (inches): ");
        heightInches = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        height = heightFeet * 12 + heightInches;
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
        
        keyboard.close();
    }
    

}
