package zac.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zac on 5/7/17.
 *
 * Insertion sort class
 */
public class InsertionSort
{
    /** For sorted list */
    List<Integer> sortedList;

    /**
     * Constructor
     *
     * @param inputList
     */
    public InsertionSort(List<Integer> inputList)
    {
        insertionSort(inputList);
    }

    /**
     * Insertion sort
     *
     * Worse case: O(n^2), where n is unsortedList's size
     *
     * @param unsortedList
     */
    private void insertionSort(List<Integer> unsortedList)
    {   /** Make a copy from original list */
        sortedList = new ArrayList<>(unsortedList);
        /** Insert each element to where it belongs to */
        for (int i=0; i<sortedList.size(); i++)
        {
            int temp = sortedList.get(i);

            int j = i;

            while (j>0 && temp < sortedList.get(j-1))
            {
                sortedList.set(j, sortedList.get(j-1));

                j--;
            }
            sortedList.set(j, temp);
        }
    }
}
