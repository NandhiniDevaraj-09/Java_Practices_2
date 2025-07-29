public class NoOfVehicles {
    public static void main(String[] args) {
        int v = 12;
        int w = 34;
        int num = v / 2;
        
        for (int i = 0; i < num; i++) {
            int ires1 = i * 2;
            int ires2 = i * 4;
            
            for (int j = num; j < v; j++) { 
                int jres1 = j * 4;
                int jres2 = j * 2;

                if ((ires1 + jres1) == w) {
                    System.out.println("Two wheelers: " + i + " Four Wheelers: " + j);
                } else if ((ires2 + jres2) == w) {
                    System.out.println("Two wheelers: " + j + " Four Wheelers: " + i);
                }
            }
        }
    }
}





