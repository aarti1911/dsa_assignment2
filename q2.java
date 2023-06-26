import java.util.HashSet;
import java.util.Set;

public class q2 {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        int maxCandies = candyType.length / 2;
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = distributeCandies(candyType);
        System.out.println(result);
    }
}
