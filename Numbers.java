import java.util.ArrayList;
import java.util.Random;

public class Numbers
{
    public ArrayList<Integer> series;


    public static void main(String[] args)
    {   
        ArrayList<Integer> series = new ArrayList<Integer>();
        // Generate random numbers
        Random randomNumGenerator = new Random();
        for (int i = 0; i < 6; i +=2)
        {
            int n = randomNumGenerator.nextInt();
            series.add(n);
        }
        System.out.println("Size of series: " + series.size());
        Numbers numbers1 = new Numbers(series);
        System.out.println("For loop :" + numbers1.forLoop());
        System.out.println("For each loop :" + numbers1.forEachLoop());
        System.out.println("While loop :" + numbers1.whileLoop());

        int res = numbers1.forLoop();
        System.out.println(numbers1.whileLoop() == res && numbers1.forEachLoop() == res);
    }

    public Numbers(ArrayList<Integer> desiredSeries)
    {
        this.series = desiredSeries;
    }   

    public int forLoop()
    {
        int total = 0;
        for (int i = 0; i < this.series.size(); i++)
        {
            total += this.series.get(i);
        }
        return total;


    }

    public int forEachLoop()
    {
        int total = 0;
        for (int val: this.series)
        {
            total += val;
        }
        return total;
    }

    public int whileLoop()
    {
        int total = 0;
        int i = 0;

        while (i < this.series.size())
        {
            total += this.series.get(i);
            i ++;
        }
        return total;
        
    }

}
