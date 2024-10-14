package listaFilaPilha;

public interface InterfaceLista {
	void append(String valor);
	void add(String valor, int posicao);
	String get(int posicao);
	void set(String valor, int posicao);
	void delete(int posicao);
	boolean empty();
	int size();
}
