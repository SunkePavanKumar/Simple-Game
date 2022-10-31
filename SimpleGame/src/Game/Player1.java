package Game;

public class Player1 {
	/***
	 * the player1 have three instances named name, weapon, health;
	 * 
	 */
	private String name;
	private String weapon;
	private int health;
	/**
	 * @param name of the player1
	 * @param weapon used by the player1
	 * @param health of the player1
	 */
	public Player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		if(health<0 || health>100) {
			this.health=100;
		}else this.health=health;
		
	}
	
	public void damageByGun1() {
		this.health-=30;
		if(this.health<=0) {
			this.health=0;
		}
		System.out.println("Got hit by the Gun1 health is reduced by 30 new health is "+this.health);
		if(this.health==0) {
			System.out.println(getName()+" is dead");
		}
	}
	public void damageByGun2() {
		this.health-=50;
		if(this.health<=0) {
			this.health=0;
		}
		System.out.println("Got hit by the Gun2 health is reduced by 50 new health is "+this.health);
		if(this.health==0) {
			System.out.println(getName()+" is dead");
		}
	}
	public void heal() {
		if(this.health<=0) {
			System.out.println("Player is dead heal not possible");
		}
		else{
			this.health+=100;
			if(health>100) {
				this.health=100;
			}
			System.out.println("Healed Successfully new health is "+this.health);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	

}
