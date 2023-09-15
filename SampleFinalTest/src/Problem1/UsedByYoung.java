package Problem1;

public interface UsedByYoung {
    default String procedureForTheYoung(String vaccineName){
        return vaccineName + " is OK for the Young"; //name of Vaccine object + custom message

        //type A and Type C is legit
    }
}
