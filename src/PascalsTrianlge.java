import java.util.ArrayList;
import java.util.List;

public class PascalsTrianlge {

    //5th row banate hole 3rd row r list use korte hobe
    //4th row banate hole 2rd row r list use korte hobe

    // mane jei row banabo tar theke 1 - minus korte hobe


    public static   List<List<Integer>> generate(int numRows) {

        // checking if list is empty
        if (numRows == 0) return new ArrayList<>();

        // prottekta list akta row create korbe 5 tar row r jonno 5 ta list hobe
        // prottek ta row create korar jonno list
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < numRows; i++) {

            //for creating single row : proti ta loop r vitor
            //1bar kore new list or row create korte hobe
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < i; j++) {


                // jodi first and last element hoy triangle
                // tahole 1   1  hobe
                if (j == 0 || j == i - 1) {
                    newRow.add(1);
                } else {
                    // getting previous row for creating current row
                    //  prev row
                    newRow.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
                }
            }

            // proti ta row j loop ye create hobe
            // tarpor oi list row ta result list r modde add
            //hobe
            System.out.println(newRow);
            result.add(newRow); // 1st row , 2nd ,3rd row
        }
        return result;
    }

    public static void main(String[] args) {


        generate(6);
    }
}

//List 0 hole row 1
//  List Idx    row
//    0           1
//    1           2
//    2           3
//    3           4
