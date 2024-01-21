package Brute;

import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {

    public static Integer canAttendAllMeetings(ArrayList<ArrayList<Integer>> intervals) {
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i + 1; j < intervals.size(); j++) {
                // If overlap found, return 0.
                if (!(intervals.get(i).get(1) <= intervals.get(j).get(0)
                        || intervals.get(j).get(1) <= intervals.get(i).get(0))) {
                    System.out.println(intervals.get(i).get(0));
                    System.out.println(intervals.get(i).get(1));
                    System.out.println(intervals.get(j).get(0));
                    System.out.println(intervals.get(j).get(1));

                    return 0;
                }
            }
        }
        // No overlap found, return 1.
        return 1;
    }

    public static void displayMeetings(ArrayList<ArrayList<Integer>> meetings) {
        for (ArrayList<Integer> interval : meetings) {
            System.out.print("The meetings are: ");
            System.out.println("[" + interval.get(0) + ", " + interval.get(1) + "]");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<ArrayList<Integer>> meetings = new ArrayList<>();
        meetings.add(new ArrayList<>(List.of(1, 3)));
        meetings.add(new ArrayList<>(List.of(4, 6)));
        meetings.add(new ArrayList<>(List.of(5, 7)));
        displayMeetings(meetings);
        int result = canAttendAllMeetings(meetings);
        System.out.println("Can attend all meetings? " + (result == 1 ? "Yes" : "No"));
    }
}
