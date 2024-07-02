package Day_02_Review;

import java.util.ArrayList;

public class Assignment2_NumOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0});// first stop
        busStops.add(new int[] {3,5});
        busStops.add(new int[] {2,5}); // last stop
        System.out.println(countPassengers(busStops));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Runs in O(n) because there is single loop with size n
        int numOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople = numOfPeople + stops.get(0)[i] + stops.get(i)[i];

        }
        return numOfPeople;

    }}
