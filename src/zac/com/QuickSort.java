package zac.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zac on 5/9/17.
 */
public class QuickSort
{
    List<Integer> myList;

    public QuickSort(List<Integer> list)
    {
        myList = new ArrayList<>(list);

        quickSort(myList, 0, myList.size() - 1);
    }

    public void quickSort(List<Integer> list, int start, int end)
    {
        if (start >= end)
            return;

        int pivot_index = quickSelect(list, start, end);

        quickSort(list, start, pivot_index - 1);

        quickSort(list, pivot_index + 1, end);
    }

    private int quickSelect(List<Integer> list, int start, int end)
    {
        int pivot = list.get(start);

        while (start < end)
        {
            while (list.get(start) < pivot)
                start++;

            while (pivot < list.get(end))
                end--;

            swap(list, start, end);
        }
        return start;
    }

    private void swap(List<Integer> list, int index1, int index2)
    {
        int temp = list.get(index1);

        list.set(index1, list.get(index2));

        list.set(index2, temp);
    }
}
