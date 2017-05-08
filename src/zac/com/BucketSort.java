package zac.com;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zac on 5/7/17.
 */
public class BucketSort
{
    private static int indexFor(int a, int step)
    {
        return a / step;
    }

    public static void bucketSort(int[] arr)
    {
        int max = arr[0], min = arr[0];

        for (int a : arr)
        {
            if (max < a)
                max = a;

            if (min > a)
                min = a;
        }
        //该值也可根据实际情况选择
        int bucketNum = max / 10 - min / 10 + 1;

        List buckList = new LinkedList<List<Integer>>();
        //create bucket
        for (int i = 1; i <= bucketNum; i++)
        {
            buckList.add(new LinkedList<Integer>());
        }
        //push into the bucket
        for (int i = 0; i < arr.length; i++)
        {
            int index = indexFor(arr[i], 10);

            ((LinkedList<Integer>) buckList.get(index)).add(arr[i]);
        }
        LinkedList<Integer> bucket = null;

        int index = 0;

        for (int i = 0; i < bucketNum; i++)
        {
            bucket = (LinkedList<Integer>) buckList.get(i);

//            insertSort(bucket);

            for (int k : bucket)
            {
                arr[index++] = k;
            }
        }
    }

    public static void main(String... theArgs)
    {

    }
}
