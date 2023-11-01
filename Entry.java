import java.util.ArrayList;
import java.util.HashMap;

public class Entry
{
    private static HashMap<String, String> wordsHashMap = new HashMap<String, String>();
    public static ArrayList<String> keys = new ArrayList<String>();

    public static void main(String[] args)
    {
        
        new Entry("axiom", "a statement or proposition which is regarded as being established, accepted, or self-evidently true.");
        new Entry("hiatus", "a pause or break in continuity in a sequence or activity.");

        for (String entryKey: Entry.keys)
        {
            System.out.println("Key: " + entryKey);
            System.out.println("Value: " + Entry.wordsHashMap.get(entryKey));
            System.out.println();
            
        }
    }

    public Entry(String key, String val)
    {   /*
        - This is the constructor for the Entry class
        */
        Entry.wordsHashMap.put(key, val);
        Entry.keys.add(key);

    }   

    public void addToHashMap(String key, String val)
    {
        Entry.wordsHashMap.put(key, val);
    }


}
