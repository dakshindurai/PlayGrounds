package com;
/*
Given a number in form of a string s. The task is to find whether the number is valid indian mobile number or not.
Rules for valid :-indian mobile number

The number should contain 10 or 11 or 12 digits.
If it contains 10 digits, then first  digit should be 7 or 8 or 9.
If it contains 11 digits, then first  digit should be 0 and second rule follwed.
If it contains 12 digits, then first two digits should be 91 and second rule followed
 */
public class ValidatePhoneNumber {
    static String Phonenumber = "9880377234";
    public  static void main(String[] args){
        String[] PhoneNumberStringArray = Phonenumber.split("");
        int [] phoneNumberIntArray = new int[PhoneNumberStringArray.length];
        for (int i =0; i<PhoneNumberStringArray.length; i++){
            phoneNumberIntArray[i] = Integer.parseInt(PhoneNumberStringArray[i]);
        }
        if (phoneNumberIntArray.length==10){
            for (int i =0; i<phoneNumberIntArray.length;i++){
                if(phoneNumberIntArray[0]==7 || phoneNumberIntArray[0]==8 || phoneNumberIntArray[0]==9){
                    System.out.println("Valid Indian Mobile Number");
                    break;
                }
            }

        }else if (phoneNumberIntArray.length==11){
            for (int i =0; i<phoneNumberIntArray.length;i++) {
                if (phoneNumberIntArray[0] == 0) {
                    System.out.println("Valid Indian Mobile Number");
                    break;
                }
            }

        }else if (phoneNumberIntArray.length==12){
                for (int i =0; i<phoneNumberIntArray.length;i++) {
                    if (phoneNumberIntArray[0] == 9 && phoneNumberIntArray[1] ==1) {
                        System.out.println("Valid Indian Mobile Number");
                        break;
                    }
                }

        }else {
            System.out.println("The inout is not valid phone number");
        }
    }
}