package zac.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zac on 5/7/17.
 *
 * This class generate random number and put into a List
 */
public class RandomNumberList
{
    /** Random number list for sorting */
    List<Integer> randomList;

    /**
     * Constructor
     *
     * @param numbersToSort
     */
    public RandomNumberList(int numbersToSort)
    {
        generateRandomList(numbersToSort);
    }

    /**
     * Generate random number and put into list
     *
     * @param numbersToSort
     */
    private void generateRandomList(int numbersToSort)
    {
        List<Integer> tmp = new ArrayList<>();

        for (int i=1; i<=numbersToSort; i++)
            tmp.add(i);

        Random rand = new Random();

        List<Integer> input = new ArrayList<>();

        while (tmp.size() > 0)
        {
            int k = rand.nextInt(tmp.size());

            input.add(tmp.remove(k));
        }
//        System.out.println(input);

        randomList = input;
    }
}
