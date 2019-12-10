import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class PlanetGravity {
    public static double gravityCalc(double diameter, double mass)    {
        diameter = diameter * 1000;
        double radius = diameter / 2;
        double univConst = 6.67 * Math.pow(10, -11);
        double gravity = (univConst * mass) / Math.pow(radius, 2);
        return gravity;
    }
    public static void main(String [] args) throws IOException {
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter" , "Saturn" , "Uranus" , "Neptune"};
        Double[] planetDiameter = {4880.0,12103.6,12756.3,6794.0,124984.0,120536.0,51118.0,49532.0};
        Double[] planetMass = {3.30 * Math.pow(10,23), 4.869 * Math.pow(10,24), 5.972 * Math.pow(10,24), 6.4219 * Math.pow(10,23), 1.900 * Math.pow(10,27), 5.68 * Math.pow(10,26), 8.683 * Math.pow(10,25), 1.0247 * Math.pow(10,26)};
        System.out.println(gravityCalc(4880,3.30 * Math.pow(10,23)));
        double planetGravity = 0;
        PrintWriter outFile = new PrintWriter("output.txt");
        System.out.printf("%20s\n","Planetary Data");
        System.out.printf("%s","Planet");
        System.out.printf("%17s", "Diameter (km)");
        System.out.printf("%13s", "Mass (kg)");
        System.out.printf("%20s\n", "Gravity (m/s^2)");
        System.out.println("------------------------------------------------------------");
        for(int i = 0; i < planetNames.length ; i++)    {
            System.out.printf("%-14s %-14.0f %5.2e %11.2f\n", planetNames[i], planetDiameter[i], planetMass[i], (gravityCalc(planetDiameter[i], planetMass[i])));
            planetGravity = gravityCalc(planetDiameter[i], planetMass[i]);
            outFile.println(planetGravity);
        }
        outFile.close();

    }
}
