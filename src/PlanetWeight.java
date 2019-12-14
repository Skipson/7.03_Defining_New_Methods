import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class PlanetWeight {
    public static Scanner in = new Scanner(System.in);
    public static File fileName = new File("gravity.txt");
    public static Scanner inFile;


    public static Double fileReader(){
        double gravityRead = 0.0;
        gravityRead = inFile.nextDouble();
        System.out.println(gravityRead);
        return gravityRead;
    }


    public static void main(String [] args)throws IOException {
        inFile = new Scanner(fileName);
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter" , "Saturn" , "Uranus" , "Neptune"};
        Double[] planetDiameter = {4880.0,12103.6,12756.3,6794.0,124984.0,120536.0,51118.0,49532.0};
        Double[] planetMass = {3.30 * Math.pow(10,23), 4.869 * Math.pow(10,24), 5.972 * Math.pow(10,24), 6.4219 * Math.pow(10,23), 1.900 * Math.pow(10,27), 5.68 * Math.pow(10,26), 8.683 * Math.pow(10,25), 1.0247 * Math.pow(10,26)};
        Double[] gravityValues = new Double[planetDiameter.length];
        for (int i = 0; i < gravityValues.length; i++){
            gravityValues[i] = fileReader();
        }
    }
}
