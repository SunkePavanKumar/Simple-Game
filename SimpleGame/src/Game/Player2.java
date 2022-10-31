package Game;

public class Player2 extends Player1 {
	
	private boolean armour;
	private int health;

	public Player2(String name, String weapon, int health,boolean armour) {
		super(name, weapon, health);
		this.armour=armour;
		this.health=health;
	}

	@Override
	public void damageByGun1() {
		// TODO Auto-generated method stub
		if(armour) {
			this.health-=20;
		
		if(this.health<=0) this.health=0;
		System.out.println("Armour is on. Got hit by the gun1.Health is reduced by 20 and the new health is  "+this.health);
	
		}
		if(!armour) {
			this.health-=30;
			
			if(this.health<=0) this.health=0;
			System.out.println("Armour is off. Got hit by the gun1.Health is reduced by 30 and the new health is  "+this.health);
		
		}
		if(this.health==0) {
			System.out.println(getName()+"is dead");
		}
	}

	@Override
	public void damageByGun2() {
		// TODO Auto-generated method stub
		if(armour) {
			this.health-=40;
		
		if(this.health<=0) this.health=0;
		System.out.println("Armour is off. Got hit by the gun2.Health is reduced by 40 and the new health is  "+this.health);
	
		}
		if(!armour) {
			this.health-=50;
			
			if(this.health<=0) this.health=0;
			System.out.println("Armour is on. Got hit by the gun2.Health is reduced by 50 and the new health is  "+this.health);
		
		}
		if(this.health==0) {
			System.out.println(getName()+"is dead");
		}
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		super.heal();
	}
	
	
	}
