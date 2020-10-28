package Day3_090620;

public class Multiple_Conditions {
    public static void main(String[] args) {
        //using multiple conditional statements
        int a = 1;
        int b = 2;
        int c = 4;

        //print if a & b is either equal, greater or less than c
        if(a+b < c) {
            System.out.println("a & b is less than c");
        } else if(a+b > c) {
            System.out.println("a & b is greater than c");
        } else {
            System.out.println("a & b is equal to c");

        }//end of conditional statements

    }//end of main method
}

