package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;



public class Main {


    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int quantEmp = sc.nextInt();

        for (int i = 0; i < quantEmp; i++) {
            System.out.println("\nEmployee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char YouN = sc.next().charAt(0);

            if (YouN == 'n') {
                System.out.print("\nName: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                Employee emp_normal = new Employee(name, hours, valuePerHour);
                emp.add(emp_normal);
            }
            else if (YouN == 'y') {
                System.out.print("\nName: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee emp_tercerizado = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                emp.add(emp_tercerizado);
            }
            else {
                System.out.println("\nValor incorreto, tente novamente");
                i--;
            }
        }

        System.out.println();
        System.out.println("PAYMENT: ");
        for (Employee pag : emp) {
            System.out.println(pag.getName() + " -  $" + String.format("%.2f", pag.payment()));
        }

        




    }

}