import java.util.Scanner;

public class Game {
    private Player player;
    private Dungeon dungeon;
    private Scanner scanner;

    public Game() {
        player = new Player();
        dungeon = new Dungeon();
        scanner = new Scanner(System.in);
    }

    public void play() {
        while (true) {
            System.out.println("You are at position (" + player.getX() + ", " + player.getY() + ")");
            System.out.println("What do you want to do?");
            System.out.println("1. Move north");
            System.out.println("2. Move south");
            System.out.println("3. Move east");
            System.out.println("4. Move west");
            System.out.println("5. Fight monster");
            System.out.println("6. Collect treasure");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.moveNorth();
                    break;
                case 2:
                    player.moveSouth();
                    break;
                case 3:
                    player.moveEast();
                    break;
                case 4:
                    player.moveWest();
                    break;
                case 5:
                    fightMonster();
                    break;
                case 6:
                    collectTreasure();
                    break;
                case 7:
                    System.out.println("Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void fightMonster() {
        Monster monster = dungeon.getMonsterAtPosition(player.getX(), player.getY());
        if (monster != null) {
            System.out.println("You are fighting a " + monster.getName());
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Run away");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attackMonster(monster);
                    break;
                case 2:
                    player.runAway();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("There is no monster at this position.");
        }
    }

    private void collectTreasure() {
        Item treasure = dungeon.getTreasureAtPosition(player.getX(), player.getY());
        if (treasure != null) {
            System.out.println("You found a " + treasure.getName());
            player.collectTreasure(treasure);
        } else {
            System.out.println("There is no treasure at this position.");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}

//


public class Player {
    private int x;
    private int y;
    private int health;
    private int attack;
    private int defense;

    public Player() {
        x = 0;
        y = 0;
        health = 100;
        attack = 10;
        defense = 5;
    }

    public void moveNorth() {
        y--;
    }

    public void moveSouth() {
        y++;
    }

    public void moveEast() {
        x++;
    }

    public void moveWest() {
        x--;
    }

    public void attackMonster(Monster monster) {
        monster.takeDamage(attack);
    }

    public void runAway() {
        System.out.println("You ran away from the monster.");
    }

    public void collectTreasure(Item treasure) {
        System.out.println("You collected the " + treasure.getName());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

//

public class Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Monster(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("The " + name + " has been defeated!");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}

//

import java.util.Random;

public class Dungeon {
    private int width;
    private int height;
    private Monster[][] monsters;
    private Item[][] treasures;

    public Dungeon() {
        width = 10;
        height = 10;
        monsters = new Monster[width][height];
        treasures = new Item[width][height];

        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (random.nextInt(10) < 3) {
                    monsters[x][y] = new Monster("Goblin", 20, 5, 2);
                }
                if (random.nextInt(10) < 2) {
                    treasures[x][y] = new Item("Gold Coin", 10);
                }
            }
        }
    }

    public Monster getMonsterAtPosition(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return monsters[x][y];
        } else {
            return null;
        }
    }

    public Item getTreasureAtPosition(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return treasures[x][y];
        } else {
            return null;
        }
    }
}

//

public class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

//

public void play() {
    while (true) {
        System.out.println("You are at position (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("What do you want to do?");
        System.out.println("1. Move north");
        System.out.println("2. Move south");
        System.out.println("3. Move east");
        System.out.println("4. Move west");
        System.out.println("5. Fight monster");
        System.out.println("6. Collect treasure");
        System.out.println("7. Quit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player.moveNorth();
                break;
            case 2:
                player.moveSouth();
                break;
            case 3:
                player.moveEast();
                break;
            case 4:
                player.moveWest();
                break;
            case 5:
                fightMonster();
                break;
            case 6:
                collectTreasure();
                break;
            case 7:
                System.out.println("Thanks for playing!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}