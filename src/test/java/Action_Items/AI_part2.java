package Action_Items;

public class AI_part2 {
    public static void main(String[] args) {
        //defining city as array
        String[] city = new String[4];
        city[0] = "Queens";
        city[1] = "Brooklyn";
        city[2] = "Staten Island";
        city[3] = "Manhattan";

        for (int i = 0; i < city.length; i++) {
            if (city[i] == "Manhattan") {
                System.out.println("City is " + city[i]);
            }//end of if for Brooklyn

            if (city[i] == "Brooklyn") {
                System.out.println("City is " + city[i]);
            }//end of it for Manhattan
        }//end of for loop
    }//end of main
}// end of java class
