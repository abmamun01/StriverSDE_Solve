package Day3;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {

            /**
             * first jokhon kono majority elemen paibo count ++ hoibo
             * jokhon e onno element asbe tokhon count-- hobe and hote e thakbe
             * jotokhon porjonto onno element aste thakbe
             * jodi count 0 hoye jay tahole present element e candidate ba majority hisabe
             * gonno hobe and so on....
             */

            if (count == 0) {
                candidate = nums[i];
            }

            if (candidate == nums[i]) count++;
            else count--;
        }

        return candidate;
    }
}
