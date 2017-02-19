package consolepokemon;

public class Pokemon extends Types {
	
	String name;
	types type;
	public Pokemon(String name) {
		this.name = name;
		
	}
	
	public Pokemon(String name, types type) {
		this.name = name;
		this.type = type;
	}
	
	public void printInfo() {
		System.out.println(name + " " + type);
	}
	
	public static void main(String args[]) {
		Pokemon Pikachu = new Pokemon("Pikachu", types.WATER);
		Pikachu.printInfo();
		
	}
}
