package zac.com;

import java.util.*;

/**
 * Main class
 */
public class Main
{
    List<Integer> randomList;

    int listSize;

    public Main()
    {
        listSize = 10;
        /** A list contains random number from 1 to input number*/
        RandomNumberList randomNumberList = new RandomNumberList(listSize);

        randomList = randomNumberList.randomList;
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        /** Random input number */
        List<Integer> inputRandomNumberList = m.randomList;

        System.out.println(inputRandomNumberList);

        Test test = new Test(inputRandomNumberList);

        System.out.println(test.myList);

//        QuickSort quickSort = new QuickSort(inputRandomNumberList);
//
//        System.out.println(quickSort.myList);

//        MergeSort mergeSort = new MergeSort(inputRandomNumberList);
//
//        System.out.println(mergeSort.myList);

//        PrimeNumber p = new PrimeNumber();

//        int[] arr = {93, 56, 34, 25, 78, 87, 12, 64, 41};

//        RadixSort rs = new RadixSort(arr);








//        InsertionSort is = new InsertionSort(inputRandomNumberList);
//
//        System.out.println(is.sortedList);
    }

    /**
     * Swap 2 values in one list
     *
     * @param list
     * @param index1
     * @param index2
     */
    public void swap(List<Integer> list, int index1, int index2)
    {
        int temp = list.get(index1);

        list.set(index1, list.get(index2));

        list.set(index2, temp);
    }
}
