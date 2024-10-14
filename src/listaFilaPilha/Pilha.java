package listaFilaPilha;

import java.util.ArrayList;

public class Pilha implements InterfacePilha{
	private ArrayList<String> pilha;

	@Override
	public void push(String valor) {
		pilha.add(valor);
	}

	@Override
	public int size() {
		return pilha.size();
	}

	@Override
	public String top() {
		if (!empty()) {
			return pilha.get(0);
		}
		return null;
	}

	@Override
	public void pop() {
		pilha.remove(size()-1);
	}

	@Override
	public boolean empty() {
		if (pilha.size() == 0) {
			return true;
		}
		return false;
	}

}
