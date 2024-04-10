public class Fantasia {

    private String name;
    private int healthPoints;
    private int strength;
    private int magic;
    private boolean isFriendly;

    public Fantasia(String name, int healthPoints, int strength, int magic, boolean isFriendly) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.magic = magic;
        this.isFriendly = isFriendly;
    }

    public void greetOther(Fantasia f){
        if(f.isFriendly() && this.isFriendly){
            System.out.println("hello! new friend found");
            System.out.println(f.getName() + " " + this.name + " are new friends <3");
        }
        else{
            System.out.println("A fight stared between: " + this.name + " and " + f.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public boolean isFriendly() {
        return isFriendly;
    }


    public void setFriendly(boolean isFriendly) {
        this.isFriendly = isFriendly;
    }

    
    @Override
    public String toString() {
        return "Fantasia [name=" + name + ", healthPoints=" + healthPoints + ", strength=" + strength + ", magic="
                + magic + ", isFriendly=" + isFriendly + "]";
    }



    public static void main(String[] args) {
        Fantasia f = new Fantasia("Azzurro", 20, 8, 10, true);
        Fantasia f2 = new Fantasia("Meya", 100, 2, 10, false);
        Fantasia f3 = new Fantasia("Anne", 432, 21, 5, true);
    }
    
}
