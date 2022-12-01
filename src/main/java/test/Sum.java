package test;

import java.util.List;

public class Sum {
    public Integer sum(List<Integer> ints) {
        return ints.stream().mapToInt(Integer::intValue).sum();
    }
}
