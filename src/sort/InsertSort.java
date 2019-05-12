package sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * 插入排序: 分成已排序部分，和未排序部分，依次把未排序部分一个个的加入已排序部分的相应的位置（向前遍历已经循环部分），Time=O(n^2); S = O(1);
 * 原理： 从第一位开始，所在位置的元素与之前的元素比较，
 * 然后把第二位的与前边的的相比，每次加入新元素都与前边的位置相比较，然后把新元素插入相应的位置，
 *
 * @Author: ShengdongYan
 * @Date: 2019-04-20
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};

        for(int i= 1; i < arr.length; i++){
          for(int j = i; j>0; j--){
              if(arr[j]<arr[j-1]) {
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
              }
          }
        }
        System.out.println(Arrays.toString(arr));

    }


}
