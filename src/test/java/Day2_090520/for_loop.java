package Day2_090520;

public class for_loop {
    public static void main(String[] args) {
        //dynamic array example with string data
        String[] zipCode = new String[5]; //defining and setting boundary for array values
        zipCode[0] = "11218";
        zipCode[1] = "11219";
        zipCode[2] = "10001";
        zipCode[3] = "11201";
        zipCode[4] = "11217";

        //iterate through all of zipcode data and print each one

        /* .length command is useful to use so you don't need to
            hard code your end point on i < whatever the endpoint is
         */
        for (int i = 0; i < zipCode.length;i++) { // ++ is the same as +1 by default
            //code goes here
            System.out.println("My zip code is " + zipCode[i]);

            //i = i+1; //this is to keep specific indexes(s) from array
        }//end for loop
    }//end of main method
}//end of class







