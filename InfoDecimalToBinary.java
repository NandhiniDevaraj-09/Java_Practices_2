public class InfoDecimalToBinary {
    public static void main(String[] args) {
        int dec = 6;
        int binary = "";

        while (dec > 0) {
            binary = (dec % 2) + binary;
            dec = dec / 2;
        }

        System.out.println("Binary: " + binary);
    }
}
