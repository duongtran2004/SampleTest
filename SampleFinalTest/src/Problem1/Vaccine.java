package Problem1;

public class Vaccine {
    //property
    private String name;
    private double amount; //since it is not specified, we can make up

//toString

    @Override
    public String toString() {
        return "Vaccine{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }


    //constructor

    public Vaccine(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    //other methods

    public boolean isTwoDoses() {
        return false; //override it in child class. Default is false.
    }

    public int daysBetween() {
        return 0;//override it in child class.
    }


}
