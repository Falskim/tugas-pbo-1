/*
		Tugas 1 - Pemrograman Berorientasi Objek
		
	NIM		: 1177050044
	Nama	: Fawwaz Syiham Muyassar
	Kelas	: A

*/

public class Game {
    
    private Player playerOne;
    private Player playerTwo;
    private Player playerThree;
    
    public static void main(String[] args) {
        // Pembuatan instance player
        Game borderlands = new Game();
        borderlands.run();
    }
    public void run(){
        createPlayer();
        setStartingWeapon();
        showGameDetail();
    }
    public void createPlayer(){
        //Instance create dibutuhkan untuk mengatasi error 
        //"An enclosing instance that contains - is required"
        Player create = new Player();
        playerOne = create.new PlayerBuilder()
                                .setName("Zero")
                                .setMaxHealth(100)
                                .setMaxShield(250)
                                .build();
        playerTwo = create.new PlayerBuilder()
                                .setName("Mechro")
                                .setMaxHealth(200)
                                .setMaxShield(150)
                                .build();
        playerThree = create.new PlayerBuilder()
                                .setName("Gunzerker")
                                .setMaxHealth(300)
                                .setMaxShield(50)
                                .build();
    }
    public void setStartingWeapon(){
        //@params Weapon name, damage, and max ammo capacity
        playerOne.giveWeapon("Sniper Rifle", 50, 5);
        playerTwo.giveWeapon("Assault Carbine", 25, 30);
        playerThree.giveWeapon("Machine Gun", 10, 100);
    }
    public void showGameDetail(){
        //Player One
        System.out.println("=== Player One ===");
        playerOne.printPlayerDetail();
        playerOne.printWeaponDetail();
        
        //Player Two
        System.out.println("=== Player Two ===");
        playerTwo.printPlayerDetail();
        playerTwo.printWeaponDetail();
        
        //Player Three
        System.out.println("=== Player Three ===");
        playerThree.printPlayerDetail();
        playerThree.printWeaponDetail();
    }
}