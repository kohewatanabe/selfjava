package chap_7.practice;

public class getAverage{
    public static double getaverage(double... values) {
        double sum = 0;

        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        } 

        return sum / values.length;
    }
    
}