package sort;


import java.util.Arrays;

/**
 * @Author: ShengdongYan
 * @Date: 2019-04-20
 * @Version 1.0
 */

public class BubbleSort {

/*
    原理：比较两个相邻的元素，将值大的元素交换至最右端,下一次循环就不用再循环最后一位了。时间复杂度O（n^2）; 空间复杂度O（1）;

    思路：内循环依次比较相邻的两个数，将小数放在前面，大数放在后面。外循环（因为是比较i 和 i+1的位子，所以长度只需要设为0 - length-1），即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。

    第一趟比较完成后，最后一个数一定是数组中最大的一个数，所以第二趟比较的时候最后一个数不参与比较；

    第二趟比较完成后，倒数第二个数也一定是数组中第二大的数，所以第三趟比较的时候最后两个数不参与比较；

    依次类推，每一趟比较次数-1；*/


    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};

        for(int i= 0; i < arr.length-1;i++){
         for(int j= 0; j <arr.length-1-i ; j++){
             if (arr[j]>arr[j+1]) {   // 如果想倒序，直接改成小于号即可。 原理是每次最后的那个一定是最大或者最小，然后只需要循环排查之前的
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }
        }
        System.out.println(Arrays.toString(arr));


    }
}
