package practice;

import java.util.Scanner;

public class BMI {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter weight in kg: ");
    float weight = sc.nextFloat();
    
    System.out.println("Enter height in meters: ");
    float height = sc.nextFloat();
    
    float BMI = weight / (height * height);
    
    if(BMI < 18.5){
        System.out.println("The BMI score is "+BMI+" .The person is Average");
    }else if(BMI >= 18.5 && BMI <= 24.9){
        System.out.println("The BMI score is "+BMI+" .The person is Fit");
    }else if(BMI >= 25 && BMI <=29.9){
        System.out.println("The BMI score is "+BMI+" .The person is Over Weight.");
    }else if(BMI >= 30){
        System.out.println("The BMI score is "+BMI+" .The person is Obese.");

}}}
