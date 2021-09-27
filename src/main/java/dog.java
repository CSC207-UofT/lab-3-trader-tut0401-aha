public class Dog implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;


    public Dog() {
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
        this.maxSpeed += this.maxSpeed;
    }

    @Override
    public void downgradeSpeed() {
        if (this.maxSpeed > 1){
            this.maxSpeed -= 1;
        }
        
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
