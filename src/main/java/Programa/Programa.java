package Programa;

import Entidades.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Account> list = new ArrayList<>();

        System.out.println("Type a number of taxpayers?");
        int npagadores = sc.nextInt();

        for (int i = 0; i < npagadores; i++) {
            System.out.println("The Account is individual = i or Company = c");
            char ca = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("anualIncome");
            double anualIncome = sc.nextDouble();

            if (ca == 'i') {
                System.out.print("Healthplans cost: ");
                double healthplans = sc.nextDouble();
                list.add(new IndividualAcc(name, anualIncome, healthplans));

            } else if (ca == 'c') {
                System.out.print("employees: ");
                double employees = sc.nextDouble();
                list.add(new CompanyAcc(name, anualIncome, employees));
            } else {
                System.out.println("invalido");
            }
        }
        for (Account account : list) {

            System.out.println(account);
        }
    }
}

