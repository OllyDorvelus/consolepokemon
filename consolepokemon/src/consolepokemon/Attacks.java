package consolepokemon;

public class Attacks extends Types {
	
	String name;
	int damage;
	types type;
	
	public Attacks(String name, int damage, types type) {
		this.name = name;
		this.damage = damage;
		this.type = type;
	}
	
	
}
