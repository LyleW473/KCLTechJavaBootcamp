import java.util.HashMap;

public class Tracker
{
    public HashMap<String, Boolean> assignmentsHashMap = new HashMap<String, Boolean>();
    public static final String[] DAYS_IN_WEEK = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


    public static void main(String[] args)
    {
        Tracker homework1 = new Tracker();
    }
    public Tracker()
    {
        for (int i = 0; i < Tracker.DAYS_IN_WEEK.length; i++)
        {
            assignmentsHashMap.put(DAYS_IN_WEEK[i], false);
        }

        for (String d: Tracker.DAYS_IN_WEEK)
        {
            System.out.println(d + " " + assignmentsHashMap.get(d));
        }

        this.setHomeworkComplete("Monday");
        this.setHomeworkComplete("Thursday");
        this.checkHomeworkStatus();
    }

    public void setHomeworkComplete(String day)
    {
        this.assignmentsHashMap.put(day, true);
    }

    public void checkHomeworkStatus()
    {   

        for (String day: assignmentsHashMap.keySet())
        {
            if (this.assignmentsHashMap.get(day) == false){
                System.out.println("The homework for " + day + " is complete!");
            } else {
                System.out.println("The homework for " + day + " is incomplete!");
            }
        }
    }  


}