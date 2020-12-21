package com.techreturners.exercise001;

import java.text.DecimalFormat;
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
      //  import java.text.DecimalFormat;
        double addvatnum = ((vatRate/100) * originalPrice) + originalPrice;

      DecimalFormat df2 = new DecimalFormat("#.##");

        return Double.valueOf(df2.format(addvatnum));

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
            if (users.get(i).getType().equals("Linux"))
                osCounter++ ;
        }
        System.out.println(osCounter);
        return osCounter;

    }
}
