package RapidRound.Leetcode.ArrayHashing;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {4, 1, 5, 9}, students = {1, 3, 2, 6};
        int ans = minMovesToSeat(seats, students);
        System.out.println(ans);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] sortedSeats = Arrays.stream(seats).sorted().toArray();
        int[] sortedStudents = Arrays.stream(students).sorted().toArray();
        int moved = 0;
        int i = 0;
        for (int seat : sortedSeats) {
            moved += Math.abs(seat - sortedStudents[i++]);
        }
        return moved;
    }
}
