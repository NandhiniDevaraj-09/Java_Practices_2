public class Vehicles {
    public static void main(String[] args) {
        int vehicles = 12;
        int wheels = 34; 
        int num1 = wheels / 2; 
        int num2 = wheels / 4;         
        int temp1;
        int temp2;

        for (int i = num1; i >= 7; i -= 2) { 
            temp1 = i * 2;
            for (int j = 0; j <= num2; j++) { 
                temp2 = j * 4;
                if ((temp1 + temp2) == wheels && (i+j)==vehicles) { 
                    System.out.println("Two wheelers: " + i + ", Four wheelers: " + j);
                    return; 
                }
            }
        }
    }
}