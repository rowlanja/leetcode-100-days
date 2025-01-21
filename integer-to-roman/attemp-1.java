class Solution {
    Map<Integer, String> mapping = Map.of(
        1, "I",
        5, "V",
        10, "X",
        50, "L",
        100, "C",
        500, "D",
        1000, "M");

    public String intToRoman(int num) {
        boolean finished = false;
        while(!finished) {
            int largestMultipleOfTen = findLargestMultipleOfTen(num);
            int numUnits = num/largestMultipleOfTen;
            System.out.println("The largest multiple of 10 you can divide " + num + " by is: " + largestMultipleOfTen + " and num of units is " + numUnits);
            
        }

        return "";
    }

    public static int findLargestMultipleOfTen(int number) {
        int multipleOfTen = 1;
        while (number / 10 > 0) {
            multipleOfTen *= 10;
            number /= 10;
        }
        return multipleOfTen;
    }
}
