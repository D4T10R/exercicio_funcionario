package principal;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantEmp = sc.nextInt();

        for (int i = 0; i < quantEmp; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char YouN = sc.next().charAt(0);
        }


    }

}