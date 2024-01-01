package ProjectGame;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 player = new Player1("Nitin", "Sward",100);
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());
		
		player.damageGun1();
		player.damageGun1();
		player.damageByGun2();
		player.heal();
		
				
	}

}
