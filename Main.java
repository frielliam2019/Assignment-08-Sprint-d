public class Main {



    public static void main(String[] args) {

    calcCapacity(8,3,40);
    calcCapacity(9,3,40);
    calcCapacity(10,3,40);
    calcCapacity(11,3,40 );
    calcCapacity(8,4,40);
    calcCapacity(8,5,40);
    calcCapacity(8,6,40);
    System.out.println();
    calcCapacity(8,3,35);
    calcCapacity(9,3,35);
    calcCapacity(10,3,35);
    calcCapacity(11,3,35);
    calcCapacity(8,4,35);
    calcCapacity(8,5,35);
    calcCapacity(8,6,35);
    System.out.println();
    calcCapacity(8,3,30);
    calcCapacity(9,3,30);
    calcCapacity(10,3,30);
    calcCapacity(11,3,30);
    calcCapacity(8,4,30);
    calcCapacity(8,5,30);
    calcCapacity(8,6,30);

    }
    public static void calcCapacity(int engineers, int weeks, int hours){
    double capacity =  (100)*(1590/((double)engineers* (double)weeks * (double)hours));
    System.out.print("With "+engineers+" devs working a "+weeks+" week sprint, for " + hours + " hrs/wk, we would be at ");
    System.out.printf("%.0f",capacity);
    System.out.println("% of capacity.");
    }

}
