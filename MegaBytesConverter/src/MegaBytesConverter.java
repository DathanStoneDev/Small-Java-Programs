public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        int mbConversion = 1024;
        if(kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
             int megabytes = kilobytes / mbConversion;
             int remainderBytes = kilobytes % mbConversion;
             System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainderBytes + " KB");
        }

    }
}

