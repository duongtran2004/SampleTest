package Problem1;

//custom exception class to get custom message
class InvalidVaccineTypeException extends Exception{

    public InvalidVaccineTypeException(String str) {
        super("Vaccine is not suitable " + str);
    }
}
