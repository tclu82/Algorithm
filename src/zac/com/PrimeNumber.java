package zac.com;

/**
 * Created by zac on 5/10/17.
 */
public class PrimeNumber
{
    public PrimeNumber()
    {
        System.out.println(algorithm(89));
    }

    private boolean algorithm(int num)
    {
        int squareRoot = (int) Math.sqrt(num) + 1;

        for (int i=2; i<=squareRoot; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);

                return false;
            }
        }
        return true;
    }
}
