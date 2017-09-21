package zac.com;

/**
 * Created by zac on 5/11/17.
 */
public class RadixSort
{
    int[] radixSortedArray;

    public RadixSort(int[] unsortedArray)
    {
        this.radixSortedArray = unsortedArray;

        int maxElement = findMax(unsortedArray);
        /** Go through digit by digit */
        for (int exp = 1; maxElement/exp > 0; exp *= 10)
        {
            countSort(unsortedArray, exp);
        }
        print();
    }

    private void countSort(int[] unsortedArray, int exp)
    {
        int arrayLength = unsortedArray.length;

        int[] output = new int[arrayLength];

        int[] count = new int[10];

        int i=0;

        // Store count of occurrences in count[]
        for (i=0; i<arrayLength; i++)
            count[ (unsortedArray[i] / exp) % 10 ]++;

        for (i=1; i<10; i++)
            count[i] += count[i-1];

        for (i = arrayLength - 1; i >= 0; i--)
        {
            output[count[ (unsortedArray[i]/exp)%10 ] - 1] = unsortedArray[i];

            count[ (unsortedArray[i]/exp)%10 ]--;
        }
        for (i = 0; i < arrayLength; i++)
            unsortedArray[i] = output[i];
    }

    /**
     * Return the maximum number
     *
     * @param unsortedArray
     * @return
     */
    private int findMax(int[] unsortedArray)
    {
        int maxData = unsortedArray[0];

        for (int number: unsortedArray)
        {
            maxData = Math.max(maxData, number);
        }
        return maxData;
    }

    private void print()
    {
        for (int i=0; i<radixSortedArray.length; i++)
        {
            System.out.print(radixSortedArray[i] + " ");
        }
    }
}
