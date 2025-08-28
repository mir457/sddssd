package OCP;

public class Juego {

	public static void main(String[] args) {
		Espada espada = new Espada(1, 5);
		Arco arco = new Arco(5, 8);
		DamageCalculator calculator = new DamageCalculator();
		
		double espadaDaño = calculator.calculateDamage(espada);
		double espadaArco = arco.calculateDamage(arco);
	}

}
