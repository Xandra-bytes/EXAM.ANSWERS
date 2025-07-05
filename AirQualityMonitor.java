/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package evening.airqualitymonitor;



  import java.util.Arrays;
import java.util.Random;
public class AirQualityMonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();
        int hazardousDays = 0;
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = random.nextInt(300) + 1;
            if (aqiReadings[i] > 200) {
                hazardousDays++;
            }
        }

        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }
        System.out.println("Median AQI: " + median);
        System.out.println("Number of hazardous days (AQI > 200): " + hazardousDays);
    }
}