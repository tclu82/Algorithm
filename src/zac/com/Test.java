package zac.com;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    List<Integer> myList;

    public Test(List<Integer> theList)
    {
        myList = new ArrayList<>(theList);

        myList = mergeSort(myList);
    }

    private List<Integer> mergeSort(List<Integer> list)
    {
        if (list.size() < 2)
            return list;

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        for (int i=0; i<list.size(); i++)
        {
            if (i % 2 == 0)
            {
                list1.add(list.get(i));
            }
            else
            {
                list2.add(list.get(i));
            }
        }
        list1 = mergeSort(list1);

        list2 = mergeSort(list2);

        return merge(list1, list2);
    }

    private List<Integer> merge(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> result = new ArrayList<>();

        int index1=0, index2=0;

        while (index1 < list1.size() || index2 < list2.size())
        {
            if (index2==list2.size() || (index1<list1.size() && list1.get(index1) < list2.get(index2)))
            {
                result.add(list1.get(index1++));
            }
            else
            {
                result.add(list2.get(index2++));
            }
        }
        return result;
    }
}
