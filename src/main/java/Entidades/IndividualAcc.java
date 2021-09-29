/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Entidades;

public class IndividualAcc extends Account {

    private double Healthplans;

    public IndividualAcc(String name, double anualIncome, double healthplans) {
        super(name, anualIncome);
        Healthplans = healthplans;
    }

    public double getHealthplans() {
        return Healthplans;
    }

    public void setHealthplans(double healthplans) {
        Healthplans = healthplans;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (getAnualIncome() < 20000) {
            if (getHealthplans() > 0) {
                tax = ((getAnualIncome() * (0.20)) - (getHealthplans() * (0.5)));
            } else {
                tax = (getAnualIncome() * (0.20));
            }
        } else if (getAnualIncome() >= 20000) {
            if (getHealthplans() > 0) {
                tax = ((getAnualIncome() * (0.25)) - (getHealthplans() * (0.5)));
            }
        } else {
            tax = (getAnualIncome() * (0.25));
        }
        return tax;
    }

    @Override
    public String toString() {

        return super.toString() + " Helthplans cost: " +getHealthplans()+ " tax: " + tax() +
                '}';
    }
}

