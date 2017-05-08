package zac.com;

import java.util.List;

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



















//        /** Sorted with Insertion sort */
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
