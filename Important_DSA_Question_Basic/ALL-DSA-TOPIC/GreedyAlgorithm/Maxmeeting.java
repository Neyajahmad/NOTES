import java.util.*;

public class Maxmeeting {
    private static class Meeting {
        Integer StartTime;
        Integer FinishTime;
        Integer meetingNumber;

        public String toString() {
            return (StartTime + " " + FinishTime);
        }
    }


    private static class MeetingComparator implements Comparator<Meeting> {
        public int compare(Meeting m1, Meeting m2) {
            if(m1.FinishTime>m2.FinishTime){
              return 1;
            }
            else if(m1.FinishTime<m2.FinishTime){
                 return -1;
                 }
            else{
            return 0;
            }
          }
        }

    public static void main(String[] args) {
        List<Integer> Start = List.of(1, 3, 0, 5, 8, 5);
        List<Integer> Finish = List.of(2, 4, 6, 7, 9, 9);
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < Start.size(); i++) {
            Meeting meeting = new Meeting();
            meeting.StartTime = Start.get(i);
            meeting.FinishTime = Finish.get(i);
            meeting.meetingNumber=i+1;
            meetings.add(meeting);
        }
        meetings.sort(new MeetingComparator());


        List<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).meetingNumber);

        Meeting onGoingMeeting =meetings.get(0);
        for(int i=1;i<meetings.size();i++){
            Meeting currMeeting=meetings.get(i);
            if(currMeeting.StartTime>onGoingMeeting.FinishTime){
                result.add(currMeeting.meetingNumber);
                onGoingMeeting=currMeeting;
            }

        }
        System.out.println(meetings);
        System.out.println(result);
    }
}


//Time :-- NlogN
//space :-- N