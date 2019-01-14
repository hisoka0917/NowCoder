package com.nowcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class KthMinimum {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k > input.length) {
            return res;
        }
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
