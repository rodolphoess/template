package template;

public abstract class BebidaCafeinada {

	public final void preparar() {
		esquentarAgua();
		mistura();
		colocarEmCopo();

		if (temCondimentos())
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

	/*
	 * M�todo gancho. Tem a fun��o de poder modificar um comportamento nas classes
	 * que implementam a classe abstrata. Nesse caso, as classes Cafe e Cha podem
	 * reimplementar esse m�todo de modo que n�o tenham condimentos, que foi o caso
	 * da classe Cha.
	 */
	public boolean temCondimentos() {
		return true;
	}
}
