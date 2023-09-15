package Problem1;

public class typeBVaccine extends  Vaccine implements UsedByElderly{
//constructor
    public typeBVaccine(String name, double amount) {
        super("TypeB", 2.0);
    }

    @Override
    public String procedureForTheElderly(String vaccineName) {
        return UsedByElderly.super.procedureForTheElderly(vaccineName);
    }

    @Override
    public int daysBetween() {
        return 30;
    }

    @Override
    public boolean isTwoDoses() {
        return true;
    }
}
