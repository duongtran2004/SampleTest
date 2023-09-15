package Problem1;

public interface UsedByElderly {
    public default String procedureForTheElderly(String vaccineName){
        return vaccineName+  " is OK for the Elderly.";  //name of Vaccine object + custom message
    }//TypeB and TypeD are legit
}
