package com.company;

class Person{
    private String name;
    private String address;
    private int age;

    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int Age() {
        return age;
    }
    public void Age(int Age) {
        this.age = Age;
    }

}
public class Main {

    public static void main(String[] args) {
        Person Matias=new Person("Matias", 20, "Oradea");
        System.out.println(Matias.getName());
        Matias.setName("Ervin");
        System.out.println(Matias.getName());
    }
}
