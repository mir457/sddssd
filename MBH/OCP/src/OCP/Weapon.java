package OCP;

abstract class Weapon {
	protected int baseDamage;
	public int level;
	
	public Weapon(int b, int l) {
		this.baseDamage=b;
		this.level=l;
	}
	
	public int getBaseDamage() {return baseDamage;}
	public abstract double calculateDamage();
}