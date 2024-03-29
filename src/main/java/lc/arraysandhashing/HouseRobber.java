package lc.arraysandhashing;

public class HouseRobber {
    // O(n) O(1)
    // Memoization
    int getMaxAmount(int[] money) {
        if (money.length == 1) return money[0];
        if (money.length == 2) return Math.max(money[0], money[1]);

        int[] maxAmount = new int[money.length];
        maxAmount[0] = money[0];
        maxAmount[1] = Math.max(money[0], money[1]);

        for (int i =2; i< money.length; i++) {
            maxAmount[i] = Math.max(maxAmount[i-2] + money[i], maxAmount[i-1]);
        }

        return maxAmount[maxAmount.length-1];
    }

    public static void main(String[] args) {
        var hr = new HouseRobber();
        int[] nums = {1,2,3,1};
        System.out.println(hr.getMaxAmount(nums));
    }

}
