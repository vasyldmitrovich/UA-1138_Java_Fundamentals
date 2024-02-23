package com.softserve.edu08.pt;

public class Department implements Cloneable {
    String name;//Make private
    Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Department clone() {
        try {
            var res = (Department) super.clone();
            res.address = address.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    static class Address implements Cloneable {
        String city;//Make private
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        protected Address clone() {
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
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }
}
