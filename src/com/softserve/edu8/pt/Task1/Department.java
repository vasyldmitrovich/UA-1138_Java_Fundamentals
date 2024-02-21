package com.softserve.edu8.pt.Task1;

public class Department implements Cloneable{
    private String name;
    private Address address = new Address();

    public Department() {
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        address.city = city;
        address.street = street;
        address.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Department clone() {
        try {
            Department copyOfDepartment = (Department) super.clone();
            copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
            return copyOfDepartment;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }



    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address() {
        }

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
        @Override
        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }
}
