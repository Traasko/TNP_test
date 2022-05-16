package toto;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    int compatibilityCheck(int numberToCheck) {
        if (numberToCheck % 3 == 0 || numberToCheck % 5 == 0 || numberToCheck % 7 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    List<String> division(int numberToMakeDivision) {
        List<String> vowels = new ArrayList<>();
        
        //System.out.println("numberToMakeDivision => " + numberToMakeDivision);
        String s=Integer.toString(numberToMakeDivision);
        
        String[] splitedNumber = s.split("(?!^)");
        
        if(numberToMakeDivision % 3 > 0) {
            //System.out.println("Non divisible par 3.");
        } else {
            vowels.add("Toto");
        }
        
        if(numberToMakeDivision % 5 > 0) {
            //System.out.println("Non divisible par 5.");
        } else {
            vowels.add("Tutu");
        }
        
        if(numberToMakeDivision % 7 > 0) {
            //System.out.println("Non divisible par 7.");
        } else {
            vowels.add("Titi");
        }
        
        /*boolean ans = vowels.isEmpty();
        if (ans == true)
            vowels.add(s);*/
        
        return vowels;
    }
    
    List<String> eachNumber(List<String> vowels, int number) {
        String s=Integer.toString(number);
        String[] splitedNumber = s.split("(?!^)");
        
        for (int i = 0; i < splitedNumber.length; i++) {
            
            if(Integer.parseInt(splitedNumber[ i ]) == 3) {
                vowels.add("Toto");
            }
            
            if(Integer.parseInt(splitedNumber[ i ]) == 5) {
                vowels.add("Tutu");
            }
            
            if(Integer.parseInt(splitedNumber[ i ]) == 7) {
                vowels.add("Titi");
            }
            
            if(Integer.parseInt(splitedNumber[ i ]) == 0) {
                vowels.add("*");
            } 
        }
        
        //System.out.println(vowels);
        
        return vowels;
    }
    
    void compute(String number) {
        
        List<String> vowels = new ArrayList<>();
        List<String> eachNumberTab = new ArrayList<>();
        
        int myFlag;
        
        int i=Integer.parseInt(number);
        System.out.println("You entered: " + i);
        
        myFlag = compatibilityCheck(i);
        if (myFlag == 1) {
            /* End */
            System.out.println("End.");
            
            String[] numberSp = number.split("(?!^)");
            
            for (int j = 0; j < numberSp.length; j++) {
                
                if(Integer.parseInt(numberSp[ j ]) == 0) {
                    vowels.add("*");
                } else {
                    vowels.add(numberSp[ j ]);
                }
            }
            System.out.println(number + " => " + vowels);
            
        } else {
            /* Continue */
            vowels = division(i);
            eachNumberTab = eachNumber(vowels, i);
            
            System.out.println(number + " => " + eachNumberTab);
        }
        
    }
    
 
    public static void main(String[] args) {
        new MyClass().compute("101");
    }

}