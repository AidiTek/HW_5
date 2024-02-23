public class Boss {
    private int health;
    private int damage;
    private String typeOfProtection;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeOfProtection() {
        return typeOfProtection;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setTypeOfProtection(String newValue) {
        this.typeOfProtection = newValue;
    }

}
