package com.automation.tests.day6;

import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {

    }

    public boolean only14(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {


                if (nums[i] == 1 && nums[j] == 4)

                    return false;
            }
        }
            return true;
        }
    }





