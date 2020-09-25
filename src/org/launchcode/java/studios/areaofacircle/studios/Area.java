package org.launchcode.java.studios.areaofacircle.studios;

import java.util.Scanner;

public class Area {
    public static Double getArea(Double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] arges){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a value for the radius: ");
        while(!in.hasNextDouble()){
            System.out.println("Please enter a positive value: ");
            in.nextLine();
        }
        String input = in.nextLine();
        Double converted = Double.valueOf(input);
        System.out.println(getArea(converted));
    }
}
