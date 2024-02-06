package com.softserve.edu04.hw;

public class HwTask3 {
    public static void main(String[] args) {
        HTTPError he = HTTPError.HE_400;
        System.out.println(he.getDescription());
    }
}

enum HTTPError {//Move to file HttpError.java
    HE_400(400, "Bad Request"),
    HE_401(401, "Unauthorized"),
    HE_402(402, "Payment Required"),
    HE_403(403, "Forbidden");

    final int code;
    final String description;

    HTTPError(int code, String description) {
        this.code = code;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
