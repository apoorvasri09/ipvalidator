package com.techinterview.ipvalidation;

public class Application {
    public static void main(String[] args) throws Exception {
        IpValidator ipValidator = new IpValidator();
        System.out.println(ipValidator.validateIpAddress("100.11.10.1", "100.10.10.0/16"));
    }
}
