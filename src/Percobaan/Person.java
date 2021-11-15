package Modul6.Percobaan;

public class Person {

    protected String name;
    protected String address;

    public Person() {
        System.out.println("INSIDE PERSON : CONSTRUCTOR ");
        name = "";
        address = "";
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
