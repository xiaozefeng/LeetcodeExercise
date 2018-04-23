package org.dark.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * @author xiaozefeng
 * @date 2018/4/23 下午4:13
 */
@Slf4j
public class TwoSum {
    public int[] towSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                if (target == temp) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not tow sum solution");
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.towSum(new int[]{2, 7, 11, 15}, 9);
        log.info("result:{}", result);
    }
}
