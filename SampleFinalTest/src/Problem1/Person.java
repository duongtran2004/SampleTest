package Problem1;

public class Person {
    //property
    private String name;
    private int age;
    //constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString method

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //other method

    public void getVaccine(Vaccine v) throws InvalidVaccineTypeException {
        if (v.isTwoDoses()) { //check if the vaccine require 2 doses
            System.out.println(name + ", you will get the second dose after " + v.daysBetween() + " days"); //2 doses
        } else {
            System.out.println(name + ", you need only one dose"); // 1 doses
        }

        if (age < 18 && v instanceof UsedByYoung) {
            System.out.println(((UsedByYoung) v).procedureForTheYoung(v.getName())); //pass the vaccine's name
        } else if (age > 65 && v instanceof UsedByElderly) {
            System.out.println(((UsedByElderly) v).procedureForTheElderly(v.getName())); //pass the vaccine's name
        } else if (age < 18 || age > 65) { //vaccine not suitable for person's age
            try {
                throw new InvalidVaccineTypeException("Vaccine is not suitable");
            } catch (InvalidVaccineTypeException e) {
                throw new RuntimeException(e);
            }
        }
}
}
