package com.nowcoder;

import java.util.HashMap;

public class IntegerMoreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (map.containsKey(num)) {
                count = map.get(num);
                map.put(num, ++count);
            } else {
                count = 1;
                map.put(num, count);
            }
            if (count > n / 2) {
                return num;
            }
        }
        return 0;
    }
}
