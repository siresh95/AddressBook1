package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class AddressBook1 {
    static Scanner sc = new Scanner(System.in);
    static List<Contact> list = new LinkedList<Contact>();
    private static AddressBook1 addressbook1;
    private static AddressBook1 addressbook2;

    // uc1 add details to Address Book
    public static void AddContactDetails() {
        System.out.println("Enter First Name:");
        String First_name = sc.nextLine();
        System.out.println("Enter Last Name:");
        String Last_name = sc.nextLine();
        System.out.println("Enter your Address:");
        String Address = sc.nextLine();
        System.out.println("City Name:");
        String City_name = sc.nextLine();
        System.out.println("Enter Your Pincode:");
        String Pincode = sc.nextLine();
        System.out.println("Enter Your State_Name:");
        String State_Name = sc.nextLine();
        System.out.println("Enter Your Phone Number:");
        String Phone_Number = sc.nextLine();
        System.out.println("Enter Your Email id:");
        String Email_id = sc.nextLine();
        Contact obj = new Contact(First_name, Last_name, Address, City_name, State_Name, Pincode, Phone_Number, Email_id);
        list.add(obj);

    }




    public static void main(String[] args) {
        addressbook2 = new AddressBook1();
        System.out.println("Welcome to Address Book");
        AddContactDetails();



    }

    private static class Contact {
        public Contact(String first_name, String last_name, String address, String city_name, String state_name, String pincode, String phone_number, String email_id) {
        }
    }
}


