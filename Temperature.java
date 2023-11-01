import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Temperature
{
    public static ArrayList<Double> dailyTemperatures = new ArrayList<Double>();
    public static HashSet<Double> uniqueTemperatures = new HashSet<Double>();
    public static double cumulativeTemps = 0.0;

    public static void main(String[] args)
    {
        // Generate random numbers
        Random randomNumGenerator = new Random();
        for (int i = 0; i < 2; i ++)
        {
            double n = randomNumGenerator.nextDouble();
            new Temperature(n % 50);
        }

        // Print random temperatures
        for (double temp: Temperature.dailyTemperatures)
        {
            System.out.println(temp);   
        }

        // Average temp
        System.out.println("Average temperature: " + Temperature.calcAverageTemp());
    }

    public Temperature(double newTemp)
    {   /*
        - This is the constructor for the Temperature class
        */
        Temperature.dailyTemperatures.add(newTemp);
        Temperature.cumulativeTemps += newTemp;
    }   

    public static double calcAverageTemp()
    {
        return  Temperature.cumulativeTemps / Temperature.dailyTemperatures.size();
    }

}
