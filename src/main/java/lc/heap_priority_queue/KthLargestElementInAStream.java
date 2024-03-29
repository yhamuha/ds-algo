package lc.heap_priority_queue;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    // SC: O(n)
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;
    // in case of constructor it schould avoid "void"
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n : nums) {
            add(n);
        }
    }

    // TC: O(n log n)
    public int add(int val) {
        heap.offer(val);
        if(heap.size() > k)
            heap.poll();
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4,5,8,2};
        KthLargestElementInAStream kleis = new KthLargestElementInAStream();
        kleis.KthLargest(3, new int[] {4,5,8,2});
        System.out.println(kleis.add(3));
        System.out.println(kleis.add(5));
        System.out.println(kleis.add(10));
        System.out.println(kleis.add(9));
        System.out.println(kleis.add(4));
        System.out.println("Final heap values: " + kleis.heap);
    }
}
