package Trace;

public class Manufacturer {
    public static String detectManufacturer(String datapath) {
        String retVal = "unknown";
        String[] fileend = datapath.split(".");
        if (fileend[1].equals("ext1")) {
            retVal = "manu1";
        } else if (fileend[1].equals("ext2")) {
            retVal = "manu2";
        }
        return retVal;
    }
}
