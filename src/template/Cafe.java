package template;

public class Cafe extends BebidaCafeinada {

	@Override
	public void mistura() {
		System.out.println("Moendo caf�!");
	}
	
	@Override
	public void addCondimentos() {
		System.out.println("Adicionando a��car e leite.");
	}
}
