package Entidades;

public abstract class Account {
    private String name;
    private double AnualIncome;

    public Account() {
    }

    public Account(String name, double anualIncome) {
        this.name = name;
        AnualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return AnualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        AnualIncome = anualIncome;
    }

    public double tax(){

        return 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", AnualIncome=" + AnualIncome;
    }
}