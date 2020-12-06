package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
       // return "";
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return (((vatRate/originalPrice) * 100))+ originalPrice;
      //  return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return new StringBuilder(sentence).reverse().toString();
      //  return "";
    }


    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int osCounter = 0;

        for (int i = 0; i<users.size(); i++) {
            if (User.getOperatingSystem().equals("Linux"))
                osCounter++ ;
        }
        System.out.println(osCounter);
        return osCounter;

       // return 0;
    }
}
