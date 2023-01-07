import java.util.Scanner;

public class RGBToHexColor {
    private final static Scanner sc = new Scanner(System.in);
    private static enum RGB {R,G,B};

    public static void main(String[] args) {
        int r = getRGB(RGB.R);
        int g = getRGB(RGB.G);
        int b = getRGB(RGB.B);
        String hexColor = getHexColor(r, g, b);
        System.out.println(hexColor);
    }
    
    private static String getHexColor(int r, int g, int b) {
        return (
            "#"+
            toHex(r)+
            toHex(g)+
            toHex(b)
        );
    }
    
    private static String toHex(int num) {
        String hex = Integer.toHexString(num);
        if(hex.length() == 1)
            hex = "0" + hex;
        return hex;
    }
    
    private static int getRGB(RGB rgb) {
        int num, n;
        
        while(true) {
          System.out.printf("Enter %s: ", rgb);
          if(sc.hasNextInt()) {
            n = sc.nextInt();
            if(n >= 0 && n <= 255) {
              num = n;
              break;
            } else 
              System.out.printf("%s must be between 0 and 255.%n", rgb);
          } else {
            System.out.println("Please enter number.");
            sc.next();
          }
        }
        
        return num;
    }
}
