package lc.sorting;

public class MajorityElement {
    // O(n) O(1)
    public int majorityElement(int[] nums) {
   /*     int res = 0, count = 0;
        for(int n: nums) {
            if(count == 0)
                res = n;
            count += (n == res? 1: -1);
        }
        return res;*/
        int res=0, count=0;
        for(int num : nums) {
            if (count == 0)
                res = num;
            count += (res == num?1:-1);
        }
        return res;

    }

    public static void main(String[] args) {
        var me = new MajorityElement();
        int[] nums= {4,4,3,2,3};
        System.out.println(me.majorityElement(nums));
    }
}
