import java.math.*;

import static java.lang.Math.round;

public class Main {
    public static double Taxi(double so_km, boolean isVip) {
        double cost = 0;
        if (!isVip) {
            if (so_km < 0 || so_km > 2000) cost = -1;
            else if (so_km < 25) cost = (so_km * 15);
            else if (so_km < 45) cost =  ((so_km - 25) * 14 + 25 * 15);
            else cost =  ((so_km - 45) * 13 + 15 * 25 + 20 * 14);
        } else {
            if (so_km < 0 || so_km > 2000) cost = -1;
            else if (so_km < 25) cost =  (so_km * 15);
            else if (so_km < 45) cost =  ((so_km - 25) * 13 + 25 * 15);
            else cost = ((so_km - 45) * 12 + 15 * 25 + 20 * 13);
        }
    return round(cost * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println((Taxi(-2, true) == -1) ? "Passed" : "Failed");
        System.out.println((Taxi(20, true) == 300) ? "Passed" : "Failed");
        System.out.println((Taxi(40, true) == 570) ? "Passed" : "Failed");
        System.out.println((Taxi(50, true) == 695) ? "Passed" : "Failed");
        System.out.println((Taxi(-2, false) == -1) ? "Passed" : "Failed");
        System.out.println((Taxi(20, false) == 300) ? "Passed" : "Failed");
        System.out.println((Taxi(40, false) == 585) ? "Passed" : "Failed");
        System.out.println((Taxi(50, false) == 720) ? "Passed" : "Failed");
    }
}
