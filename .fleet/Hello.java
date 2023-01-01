public class Hello {


    public static int commonFactors(int a, int b) {

        Set<Integer> setOfA = new HashSet<>();
        int count = 0;

        for (int i = 1; i <= a; ++i) {
            // if number is divided by i
            // i is the factor
            if (a % i == 0) {
                setOfA.add(i);

            }
            if (b % i == 0) {
                if (setOfA.contains(i)) {
                    count++;
                }

            }
        }

        return count;

}
}