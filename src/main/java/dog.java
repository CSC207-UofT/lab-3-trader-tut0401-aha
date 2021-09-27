public class dog implements Tradable, Domesticatable, Drivable {
    private  final int maxSpeed;


    public dog() {
        this.maxSpeed = 1;
    }

    @Override
    public int getPrice() {
        return 6000;
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }

}
