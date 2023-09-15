package Problem1;

public class Main {
    public static void main(String[] args) throws InvalidVaccineTypeException {
        //create person objects
        Person p1 = new Person("Duong 1", 16);
        Person p2 = new Person("Duong 2", 25);
        Person p3 = new Person("Duong 3", 50);
        Person p4 = new Person("Duong 4", 70);

        // Create 4 Vaccine objects  of TypeA, TypeB, TypeC, TypeD vaccines
        //aka Polymorphism: allow objects of different classes to be treated as objects of the same superclass or interface
        Vaccine a = new typeAVaccine("TypeA", 3.0);
        Vaccine b = new typeBVaccine("TypeB", 2.0);
        Vaccine c = new typeCVaccine("TypeC", 5.0);
        Vaccine d = new typeDVaccine("TypeD", 4.0);
        //why are there red dots in my brackets?
        //Call the getVaccine method on each person object
        p1.getVaccine(a);;
        p2.getVaccine(b);
        p3.getVaccine(c);
        p4.getVaccine(d);
        //catch and throw exception

    }
}
