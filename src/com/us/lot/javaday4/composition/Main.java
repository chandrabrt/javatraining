package com.us.lot.javaday4.composition;

/*
  @author : welcome-to-hell
  @since : 2021-01-15
*/
public class Main {

    public static void main(String[] args) {
        Students students1 = new Students();

        //information set --- setter or constructor
        composeStudentInformation(students1);

        //student information display
        getStudentsInformation(students1);

    }

    public static void composeStudentInformation(Students students1) {
        /*
         *  Address address = new Address();
            address.setProvince("Province1");
            address.setDistrict("Morang");
            address.setTole("Biratnagar");
            address.setWardNumber(12);
         */
        Address address = new Address("province1", "Morang", 12, "Brt");
        students1.setFirstName("FirstName");
        students1.setMiddleName("MiddleName");
        students1.setLastName("LastName");
        students1.setAddress(address);
    }

    public static void getStudentsInformation(Students students1) {
        System.out.println(students1.getFirstName());
        System.out.println(students1.getMiddleName());
        System.out.println(students1.getLastName());
        System.out.println("Address: ");
        System.out.println(students1.getAddress().getProvince());
        System.out.println(students1.getAddress().getDistrict());
        System.out.println(students1.getAddress().getWardNumber());
        System.out.println(students1.getAddress().getTole());
    }
}
