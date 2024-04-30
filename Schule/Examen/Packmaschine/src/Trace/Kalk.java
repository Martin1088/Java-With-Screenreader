package Trace;

public class Kalk {
    public static double sexa2dez(String sexagesimalWert) {
        double result = 0;
        String temp[] = sexagesimalWert.split(" ");
        for (int i = 0; i < temp.length; i++) {
            float kalk = Float.parseFloat(temp[i].substring(0, temp[i].length() - 1));
            if (i == 0) {
                result = kalk;
            } else if (i == 1) {
                result = result + (kalk / 60);
            } else if (i ==2) {
                result = result + ( kalk / 3600);
            }
        }
        return result;
    }

    public double calcPreis(double startLON, double startLAT, double zielLON, double zielLAT, boolean schnell) {
        //Gegebene Daten
        double preisKmStd = 3.00;
        double preisZ1 = 8.00;
        double preisZ2 = 12.00;
        double  preisschnell = 5.00;
        double zone1 = 4;
        double zone2 = 6;
        double centerLAT = 49.009225;
        double centerLON = 8.403908;
        double result = 0;
        double distPreis = 0;


        double zwStartZone = calcDistance(centerLAT ,centerLON, startLAT, startLON);
        double zwZielZone = calcDistance(centerLAT, centerLON, zielLAT, zielLON);
        double distance = calcDistance(startLAT, startLON, zielLAT, zielLON);
        distPreis = distance * preisKmStd;

        if (zwStartZone <= zone1 && zwZielZone <= zone1) {
            result += distPreis;
            if (result < preisZ1) {
                result = preisZ1;
            }
        } else if (zwStartZone <= zone2 && zwZielZone <= zone2) {
            result += distPreis;
            if (result < preisZ2) {
                result = preisZ2;
            }
        }

        if (schnell) {
            result += preisschnell;
        }
        return result;
    }

    public  static double calcDistance(double startLAT, double startLON, double zielLAT, double zielLON) {
        double faktorLAT = 111.13;
        double faktorLON = 71.44;
        double distLAT = (zielLAT - startLAT) * faktorLAT;
        double distLON = (zielLON -startLON) * faktorLON;
        double result = Math.sqrt(distLAT * distLAT + distLON * distLON);
        return result;
    }
}
