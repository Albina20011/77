package kz.aitu.oop.examples;

public class Shape {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        double[] numbers = new double[n];

        System.out.print("Enter the points: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
    }

}
