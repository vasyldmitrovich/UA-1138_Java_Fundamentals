package com.softserve.edu04.pt;

enum Continent {//Do the same with this enum move to file Continent.java
    ASIA, AFRICA, EUROPE, AMERICA, AUSTRALIA;

    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}
