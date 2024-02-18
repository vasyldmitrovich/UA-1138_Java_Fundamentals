package com.softserve.edu08.pt;

public class Pt1 {
    public static void main(String[] args) {
        Department departmentOriginal = new Department(
                "SoftServe Academy",
                new Department.Address(
                        "Lviv",
                        "Naukova",
                        121
                )
        );

        Department departmentClone = departmentOriginal.clone();

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);

        System.out.println("Changing city to Kyiv");
        departmentClone.getAddress().setCity("Kyiv");

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);

    }
}

class Department  implements Cloneable {
    String name;
    Address address;

    @Override
    public String toString() {
        return "Department{" +
                "name = '" + name + '\'' +
                ", address = " + address +
                '}';
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Department clone() {
        try {
            var res = (Department) super.clone();
            res.address = address.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static class Address implements Cloneable {
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city = '" + city + '\'' +
                    ", street = '" + street + '\'' +
                    ", building = " + building +
                    '}';
        }
    }
}
