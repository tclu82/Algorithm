package zac.com;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by zac on 5/7/17.
 *
 * This PriorityQueuePractice class implements minimum heap,
 * the smallest one will be the head of the PriorityQueuePractice instance.
 * 
 */
public class PriorityQueuePractice <T extends Comparable<T>>
{
    /** A field contains items */
    private List<T> myList;

    /**
     * Constructor
     */
    public PriorityQueuePractice()
    {
        myList = new ArrayList<>();
    }

//    public PriorityQueuePractice(int size)
//    {
//        PriorityQueuePractice pqPractice = new PriorityQueuePractice();
//
//        pqPractice.mySize = size;
//    }

    /**
     * Offer new item
     *
     * @param item
     */
    public void offer(T item)
    {
        myList.add(item);

        bubbuleUp();
    }

    /**
     * Bubble up if it is smaller than its parent (heapify)
     */
    private void bubbuleUp()
    {
        // Child index
        int childIndex = myList.size() - 1;
        // Parent index
        int parentIndex = (childIndex - 1) / 2;
        // If child is smaller than parent, keep bubble up
        while (myList.get(childIndex).compareTo(myList.get(parentIndex)) < 0)
        {   // Swap parent and child
            swap(childIndex, parentIndex);

            childIndex = parentIndex;

            parentIndex = (childIndex - 1) / 2;
        }
    }

    /**
     * Poll the top item
     *
     * @return T
     */
    public T poll()
    {
        if (myList.isEmpty())
            return null;

        final T theFirstItem = myList.get(0);

        if (myList.size() == 1)
        {
            myList.remove(0);
        }
        else
        {
            // Set to the buttom right one to the top, then remove the last one
            myList.set(0, myList.remove(myList.size() - 1));

            sinkDown();
        }
        return theFirstItem;
    }

    /**
     * Sink down if greater than its child (heapify)
     */
    private void sinkDown()
    {   // Start from the top after swap
        int parentIndex = 0;
        // Left and right children index
        int leftChildIndex = 2 * parentIndex + 1;

        int rightChildIndex = 2 * parentIndex + 2;
        // Default assign left child as smaller one
        int smallerChildIndex = leftChildIndex;
        // Keep doing if left child exists and parent is greater than smaller child
        while (smallerChildIndex < myList.size() && myList.get(parentIndex).compareTo(myList.get(leftChildIndex)) > 0)
        {   // If right exists, find the smaller one
            if (rightChildIndex < myList.size())
            {
                smallerChildIndex = myList.get(leftChildIndex)
                        .compareTo(myList.get(rightChildIndex)) < 0 ?  leftChildIndex : rightChildIndex;
            }
            swap(parentIndex, smallerChildIndex);
            // Update parent to smaller one
            parentIndex = smallerChildIndex;
            // Update left, right child
            leftChildIndex = 2 * parentIndex + 1;

            rightChildIndex = 2 * parentIndex + 2;
            // Update smaller child
            smallerChildIndex = leftChildIndex;
        }
    }

    /**
     * Call offer
     *
     * @param item
     */
    public void add(T item)
    {
        offer(item);
    }

    /**
     * Call poll()
     *
     * @return T
     */
    public T remove()
    {
        return poll();
    }

    /**
     * Shows how many items in the PriorityQueue
     *
     * @return
     */
    public int size()
    {
        return myList.size();
    }

    /**
     * Shows if the PriorityQueue is empty or not
     *
     * @return
     */
    public boolean isEmpty()
    {
        return this.size() == 0;
    }

    /**
     * toString method for output
     *
     * @return
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");

        for (T item: myList)
        {
            sb.append(item + ", ");
        }
        sb.substring(0, sb.length()-1);

        sb.append("]");

        return sb.toString();
    }

    private void swap(int index1, int index2)
    {
        T temp = myList.get(index1);

        myList.set(index1, myList.get(index2));

        myList.set(index2, temp);
    }

    /**
     *
     * @param theArgs
     */
    public static void main(String... theArgs)
    {
        // Test

        PriorityQueuePractice pqp = new PriorityQueuePractice();

        pqp.offer(6);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.offer(5);

        System.out.println(pqp.myList + ": " + pqp.size());


        pqp.offer(4);

        System.out.println(pqp.myList + ": " + pqp.size());


        pqp.offer(3);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.offer(2);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.offer(1);

        System.out.println(pqp.myList + ": " + pqp.size());


        pqp.add(8);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());


        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.offer(10);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.offer(3);

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());

        pqp.remove();

        System.out.println(pqp.myList + ": " + pqp.size());
    }
}
