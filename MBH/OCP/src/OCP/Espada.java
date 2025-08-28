package OCP;

public class Espada extends Weapon{
	public int level;
	
	public Espada(int l, int b) {
		super(l, b);
		System.out.println("ESPADA CREADA");
	}
	
	@Override
	public double calculateDamage() {
		return (this.getBaseDamage()+(level*5));
	}
}
