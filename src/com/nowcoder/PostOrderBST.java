package com.nowcoder;

public class PostOrderBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;
        int start = 0;
        int end = sequence.length - 1;
        return verify(sequence, start, end);
    }

    public boolean verify(int[] list, int start, int end) {
        if (start >= end) return true;
        int root = list[end];
        int j = end;
        while (j > start && list[j - 1] > root) {
            --j;
        }
        for (int i = j - 1; i >= start; i--) {
            if (list[i] > root) return false;
        }
        return verify(list, start, j - 1) && verify(list, j, end - 1);
    }
}
