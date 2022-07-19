public class ReverseInteger {

    int reversingInt(int number) {

        int temp = number;
        int reminder, sum = 0;

        while (temp != 0) {

            reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;

        }


        if (sum > Integer.MAX_VALUE) {
            return 0;
        } else
            return sum;
    }
}
