package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class N_meetingInOneRoom {
    void maxMeetings(int start[], int end[], int n) {
        //data structure
        ArrayList<Meeting> meet = new ArrayList<Meeting>();

        for (int i = 0; i < start.length; i++) {
            meet.add(new Meeting(start[i], end[i], i + 1));
        }

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).position);
        int limit = meet.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).position);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.printf(answer.get(i) + " ");
        }

    }

}

class Meeting {

    int start;
    int end;
    int position;

    Meeting(int start, int end, int position) {
        this.start = start;
        this.end = end;
        this.position = position;

    }

}

// Comparator
class meetingComparator implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {

        if (o1.end < o2.end)
            return -1;

        else if (o1.end > o2.end) {
            return 1;
        } else if (o1.position < o2.position)
            return -1;

        return -1;
    }

}