public class Main {
    public static void main(String[] args) {
        Hero[] heroes = createHeroes();
        Boss aboutBoss = new Boss();
        aboutBoss.setHealth(500);
        aboutBoss.setDamage(100);
        aboutBoss.setTypeOfProtection("Щит");
        System.out.println("Информация о боссе: ");
        System.out.println("Здоровья боса: " + aboutBoss.getHealth());
        System.out.println("Атака боса: " + aboutBoss.getDamage());
        System.out.println("Типы защит боса: " + aboutBoss.getTypeOfProtection());
        System.out.println("------------------");
        System.out.println("Информация о героях: ");
        for (Hero hero : heroes) {
            System.out.println("Здоровья героя: " + hero.getHealth());
            System.out.println("Атака героя: " + hero.getDamage());
            System.out.println("Способность героя: " + hero.getSuperAbility());
            System.out.println("-");
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(100, 20, "Летать");
        heroes[1] = new Hero(120, 25);
        heroes[2] = new Hero(150, 30, "Скорость");
        return heroes;

    }
}

