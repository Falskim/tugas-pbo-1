/*
		Tugas 1 - Pemrograman Berorientasi Objek
		
	NIM		: 1177050044
	Nama	: Fawwaz Syiham Muyassar
	Kelas	: A

*/

public class Player {
	
    private String name;
    private Weapon weapon;
    private int maxHealth;
    private int currentHealth;
    private int maxShield;
    private int currentShield;
    
    public Player(){
    }
    public Player(String name, int health, int shield){
        this.name = name;
        maxHealth = currentHealth = health;
        maxShield = currentShield = shield; 
    }
    
    public void giveWeapon(String name, int damage, int ammo){
        weapon = new Weapon(name, damage, ammo);
    }
    public void printPlayerDetail(){
        System.out.println("Player Name\t\t: " + name);
        System.out.println("Player Health\t\t: " + currentHealth 
                            + "/" + maxHealth);
        System.out.println("Player Shield\t\t: " + currentShield 
                            + "/" + maxShield);
    }
    public void printWeaponDetail(){
        System.out.println(name + " Weapon Name\t: " + weapon.getName());
        System.out.println(name + " Weapon Damage\t: " + weapon.getDamage());
        System.out.println(name + " Weapon Ammo\t: " 
                           + weapon.getCurrentAmmo() + "/" + weapon.getMaxAmmo());
        System.out.println();
    }
    
    //========================================================================//
    /*
        Ketika akan membuat instance dari Player yang baru, maka proses 
        pembuatannya akan melalui class PlayerBuilder terlebih dahulu yang
        kemudian ketika di build akan mereturn dan menghasilkan instance 
        dari class Player tersebut
    */
    class PlayerBuilder{
        private String name = "";
        private int health = 100;
        private int shield = 0;
        
        public PlayerBuilder setName(String name){
            this.name = name;
            return this;
        }
        public PlayerBuilder setMaxHealth(int maxHealth){
            health = maxHealth;
            return this;
        } 
        public PlayerBuilder setMaxShield(int maxShield){
            shield = maxShield;
            return this;
        }
        public Player build(){
            return new Player(name, health, shield);
        }
        
    }
    
}
