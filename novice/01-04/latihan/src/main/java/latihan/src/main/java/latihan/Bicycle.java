package LATIHAN;

public class Bicycle {
        
    int gear;
    int speed;
    int candance;
    int newValue, increment, decrement;
    private int id;

    private static int numberOfBicycle = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        setSpeed(startSpeed);

        id = ++numberOfBicycle;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        speed = newValue;
    }

    public int getid() {
        return id;
    }

    public static int getnumberOfBicycle() {
        return numberOfBicycle;

    }

    public int getCadence() {
        return candance;
    }

    public void setCandence(int newValue) {
        candance = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        setSpeed(getSpeed() - decrement);
    }

    public void speedUp(int increment){
        speed += increment;
    
    }
    

        
}