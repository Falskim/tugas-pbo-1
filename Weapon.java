/*
		Tugas 1 - Pemrograman Berorientasi Objek
		
	NIM		: 1177050044
	Nama	: Fawwaz Syiham Muyassar
	Kelas	: A

*/

public class Weapon {
    
    private final String name;
    private final int damage;
    private final int maxAmmo;
    private int currentAmmo;

    public Weapon(String name, int damage, int ammo){
        this.name = name;
        this.damage = damage;
        this.maxAmmo = currentAmmo = ammo;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getMaxAmmo(){
        return maxAmmo;
    }
    public int getCurrentAmmo(){
        return currentAmmo;
    }
    public void reload(){
        currentAmmo = maxAmmo;
    }
    public boolean shoot(){
        if(currentAmmo == 0) return false;
        currentAmmo--;
        return true;
    }
    
}
