package lection.one;

public class BytesConverter {

    public static final int K = 1024;

    public static void main(String[] args) {
        long bytes1 = 100;
        long bytes2 = 1034;
        long bytes3 = 3181608;
        long bytes4 = 1074791425;
        long bytes5 = 254318501496L;
        convertBytes(bytes1);
        convertBytes(bytes2);
        convertBytes(bytes3);
        convertBytes(bytes4);
        convertBytes(bytes5);
    }

    public static void convertBytes(long bytes) {
        long gb = bytes / K / K / K;
        bytes -= gb * K * K * K;
        long mb = bytes / K / K;
        bytes -= mb * K * K;
        long kb = bytes / K;
        bytes -= kb * K;
        System.out.println(gb + " Gb, " + mb + " Mb, " + kb + " Kb, " + bytes + " B ");
    }
}
