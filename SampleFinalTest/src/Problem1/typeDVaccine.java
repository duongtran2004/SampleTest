package Problem1;

public class typeDVaccine extends Vaccine implements UsedByElderly{
   //constructor

    @Override
    public String procedureForTheElderly(String vaccineName) {
        return UsedByElderly.super.procedureForTheElderly(vaccineName);
    }

    public typeDVaccine(String name, double amount) {
        super("TypeD", 4.0);
    }

    @Override
    public boolean isTwoDoses() {
        return false;
    }
}
