package TopicWisePreparation.A.ArrayAndHashing;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5}, students = {2, 7, 4};
        minMovesToSeat(seats, students);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] sortedSeats = Arrays.stream(seats).sorted().toArray();
        int[] sortedStudents = Arrays.stream(students).sorted().toArray();
        int count = 0;
        for (int i = 0; i < sortedSeats.length; i++) {
            count += Math.abs(sortedSeats[i] - sortedStudents[i]);
        }
        return count;
    }
}