/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Entidades;

import java.util.Date;

public class CompanyAcc extends Account {

    private double Employees;

    public CompanyAcc(String name, double anualIncome, double employees) {
        super(name, anualIncome);
        Employees = employees;
    }

    public double getEmployees() {
        return Employees;
    }

    public void setEmployees(double employees) {
        Employees = employees;
    }
    @Override
    public double tax() {
        double tax = 0;
        if(getEmployees() > 10){
            tax = (getAnualIncome()*0.14);
        }
        else {
            tax = (getAnualIncome()*0.16);
        }
        return tax;
    }
}
