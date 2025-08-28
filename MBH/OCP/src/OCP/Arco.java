package OCP;

public class Arco extends Weapon{
	public int level;
	
	public Arco(int l, int b) {
		super(l, b);
		this.level=l;
		System.out.println("ARCO CREADO");
	}
		
	@Override
	public double calculateDamage() {
		return (this.getBaseDamage()+(level*3));
	}
}
