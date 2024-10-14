package listaFilaPilha;

import java.util.ArrayList;

public class Lista implements InterfaceLista {
	private ArrayList<String> lista;
	@Override
	public void append(String valor) {
		lista.add(valor);
	}

	@Override
	public void add(String valor, int posicao) {
		lista.add(posicao, valor);
	}

	@Override
	public String get(int posicao) {
		if (!empty()) {
			lista.get(posicao);
		}
		return null;
	}

	@Override
	public void set(String valor, int posicao) {
		if (get(posicao) != null) {
			lista.set(posicao, valor);
		}
	}

	@Override
	public void delete(int posicao) {
		if (get(posicao) != null) {
			lista.remove(posicao);
		}
	}

	@Override
	public boolean empty() {
		return false;
	}

	@Override
	public int size() {
		return lista.size();
	}

}
