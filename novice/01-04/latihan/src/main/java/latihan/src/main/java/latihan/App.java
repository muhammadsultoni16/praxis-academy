/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihan;

import LATIHAN.Bicycle;

public class App {
    
    

    public static void main(String[] args) {
       Bicycle myBike = new Bicycle(1, 2, 3);
       System.out.println(myBike.getCadence());
       System.out.println(myBike.getSpeed());
       System.out.println(myBike.getGear());
    }
}
