package Day2;

import java.util.Arrays;

public class FindDuplicateNumber_On_O1 {

    /**
     Rules:
     First element ye jabe tarpor j value thakbe oi idx ye sei
     onujayi idx change korbe tarpor change kore j idx ye jabe
     sei idx ye abar j value thakbe change kore setay jabe EX:

         1,5,3,2,2
     idx:1,2,3,4,5
     jokhon 2 idx ye jabe tokhon 5 ye cole jabe 5 theke abar 2 idx jabe
     */
    static int findDuplicate(int[] nums) {
        // first init fast&slow in first number
        int slow = nums[0];
        int fast = nums[0];
        System.out.println("Slow F " + nums[0]);
        System.out.println("Fast F " + nums[0]);


        do {
            // we keep on move slow pointer by 1
            // and fast pointer by 2

            System.out.println("Slow " + nums[slow]);
            System.out.println("Fast by1  " + nums[fast]);
            System.out.println("Fast by2  " + nums[nums[fast]]);

            slow = nums[slow]; // by 1
            fast = nums[nums[fast]]; // by 2

        } while (slow != fast);

        // reAssign fast at 0 idx
        fast = nums[0];

        while (slow != fast) {
            slow = nums[slow]; // by 1
            fast = nums[fast]; // by 1        }

        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 8, 9, 8};

        System.out.println((findDuplicate(arr)));

    }
}
