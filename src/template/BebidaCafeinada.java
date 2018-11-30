package template;

public abstract class BebidaCafeinada {
	
	public final void preparar() {
		esquentarAgua();
		mistura();
		colocarEmCopo();
		addCondimentos();
	}
	
	public void esquentarAgua() {
		System.out.println("Esquentando �gua.");
	}
	
	public abstract void mistura();
	
	public void colocarEmCopo() {
		System.out.println("Colocando no copo.");
	}
	
	public abstract void addCondimentos();
}
