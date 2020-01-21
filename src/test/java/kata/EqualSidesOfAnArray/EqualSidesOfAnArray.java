package kata.EqualSidesOfAnArray;

import java.util.ArrayList;
import java.util.List;

public class EqualSidesOfAnArray {
    public static Integer findEvenIndex(ArrayList<Integer> numbers) {

        for (int index = 0; index <= numbers.size(); index++) {
            List<Integer> leftSide = numbers.subList(0, index);
            List<Integer> rightSide = numbers.subList(index + 1, numbers.size());

            Integer leftSideSum = leftSide.stream().reduce(0, Integer::sum);
            Integer rightSideSum = rightSide.stream().reduce(0, Integer::sum);

            if (leftSideSum.equals(rightSideSum)) return index;
        }

        return -1;
    }
}
