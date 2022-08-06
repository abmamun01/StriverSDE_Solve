package DSA_sheet;

public class MissingNumbe {
//-----------Approach--------------
    // time comp O(nLogn)
    // sort first
    //then run a loop to check if every exist or not

//-----------Efficient T. O(n) S.O(1)--------------
    // high efficient
    // Carl Gauss
    // n(n+1)/2
    // 1..10 pornjonto number r jonno expected sum 55 but missing nubmer ache 1 ta
    // tai 51 holo akhon sei missing number konta setar jonno 55-51 korle e ber hoye
    // jabe

    public int missingNumber(int[] nums) {

        int n = nums.length; // suppose 10
        int expectedTotalNum = (n * (n + 1)) / 2; // expected 55

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        expectedTotalNum = expectedTotalNum - total;

        return expectedTotalNum;

    }
}
