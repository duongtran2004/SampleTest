package Problem1;

public class typeAVaccine extends Vaccine implements UsedByYoung{
    //constructor
    public typeAVaccine(String name, double amount) {
        super("TypeA", 3.0); //we can make up the amount in ml
    }

//override method


    @Override
    public String procedureForTheYoung(String vaccineName) {
        return vaccineName + " is OK for the Young";
    }

    @Override
    public int daysBetween() {
        return 20;
    }

    @Override
    public boolean isTwoDoses() {
        return true;
    }
}
