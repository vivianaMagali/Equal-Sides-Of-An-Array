package kata.EqualSidesOfAnArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSidesOfAnArray {
    public static Integer findEvenIndex(int[] arr) {

        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int index = 0; index < numbers.size(); index++) {
            List<Integer> leftSide = numbers.subList(0, index);
            List<Integer> rightSide = numbers.subList(index + 1, numbers.size());

            Integer leftSideSum = leftSide.stream().reduce(0, Integer::sum);
            Integer rightSideSum = rightSide.stream().reduce(0, Integer::sum);

            if (leftSideSum.equals(rightSideSum)) return index;
        }

        return -1;
    }
}
