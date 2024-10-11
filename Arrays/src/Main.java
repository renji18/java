public class Main {
    public static void main(String[] args) {
        int [] nums = {12,15,16,100,200,20,50};

        for (int x : nums)
            System.out.println(x);

        String[] names = {"Maria", "Rose", "Sina"};

        for( String n: names)
            System.out.println(n);

        System.out.println(maxArr(nums));

    }

    private static int maxArr(int[] arr){
        int ans = Integer.MIN_VALUE;

        for (int x : arr)
            if(x > ans) ans = x;

        return ans;
    }
}