package com.softserve.edu04.hw;

enum Breed {
    BEAGLE, LABRADOR_RETRIEVER, GOLDEN_RETRIEVER, POODLE, BULLDOG, BOXER, DOBERMAN, CHIHUAHUA, ROTTWEILER;

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase().replace("_", " ");
    }

    public static Breed getBreed(String breed) {
        return switch (breed.toLowerCase()) {
            case "beagle" -> BEAGLE;
            case "labrador" -> LABRADOR_RETRIEVER;
            case "retriever" -> GOLDEN_RETRIEVER;
            case "poodle" -> POODLE;
            case "bulldog" -> BULLDOG;
            case "boxer" -> BOXER;
            case "doberman" -> DOBERMAN;
            case "chihuahua" -> CHIHUAHUA;
            case "rottweiler" -> ROTTWEILER;
            default -> throw new IllegalArgumentException("Unknown breed " + breed);
        };
    }
}
