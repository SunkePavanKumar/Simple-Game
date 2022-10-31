package Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player1 player=new Player1("pavan","sword",100);
//	    System.out.println(player.getName());
//	    System.out.println(player.getWeapon());
		//System.out.println(player.getHealth());

		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
		

//		
//		Player2 betterone=new Player2("Bhargava","AWM",80,false);
//		betterone.damageByGun1();
	}

}
