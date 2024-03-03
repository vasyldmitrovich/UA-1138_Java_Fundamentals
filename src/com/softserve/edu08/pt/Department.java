package com.softserve.edu08.pt;

class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String toString() {
            return "Address: " + city + ", " + street + ", Building " + building;
        }

        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

    public Department clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = this.address.clone();
        return cloned;
    }

    public String toString() {
        return "Department: " + name + "\n" + address;
    }
}

class Main {
    public static void main(String[] args) {
        Department department1 = new Department("IT Department", "Kyiv", "Nezalezhnosti", 123);

        Department department2;
        try {
            department2 = department1.clone();
            //department2.address.city = "Odesa";
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return;
        }
        System.out.println("First Department:");
        System.out.println(department1);
        System.out.println("\nSecond Department (Cloned info):");
        System.out.println(department2);
    }
}


