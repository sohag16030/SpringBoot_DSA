package Leetcode;

public class Main {
    public static void main(String[] args) {
        int gas[] = {5,1,2,3,4};
        int cost[] = {4,4,1,5,1};

        int current = 0, start = -1;

        for (int i = 0; i < gas.length; i++) {
            current += gas[i] - cost[i];
            if (current < 0) {
                current = 0;
                start = i + 1;
            }
        }
    }
}
