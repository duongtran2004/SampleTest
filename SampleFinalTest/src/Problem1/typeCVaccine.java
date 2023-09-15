package Problem1;

public class typeCVaccine extends Vaccine implements UsedByYoung {
 //constructor

//override method

    @Override
    public String procedureForTheYoung(String vaccineName) {
        return UsedByYoung.super.procedureForTheYoung(vaccineName);
    }

    public typeCVaccine(String name, double amount) {
        super("TypeC", 5.0);
    }

    @Override
    public boolean isTwoDoses() {
        return false;
    }
}
