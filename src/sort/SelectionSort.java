package sort;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * StraightSelectionSort直接选择排序
 * 原理： 第一趟从第零位开始找到整个数组里最小的数所在的位置，然后交换到第一位
 *       第二趟从第二位开始找到数组里最小数的位置，然后换到第二位，循环 le-1次即可，因为最后一位不用跟自己比
 *
 * @Author: ShengdongYan
 * @Date: 2019-04-20
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};
        int k = 0; // 用于存放最小位置；
        for(int i= 0; i < arr.length-1; i++){
            k =i;
          for(int j = i; i < arr.length-1; i++){
              if (arr[k]>arr[j])
                  k=j;
          }
          arr[i] = arr[k];
        }
        System.out.println(Arrays.toString(arr));
    }


}
