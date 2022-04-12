import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    double pi = 3.14;
    int area = (int) (pi*(r*r));
    System.out.println(area);
    }
}