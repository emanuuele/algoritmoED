package listaFilaPilha;

import java.util.ArrayList;

public class Fila implements InterfaceFila{
	private ArrayList<String> fila;

	@Override
	public void enqueue() {
		fila.add("a");
		fila.add("b");
		fila.add("c");
		fila.add("d");
		fila.add("e");
		fila.add("f");
		fila.add("g");
		fila.add("h");
		fila.add("i");
		fila.add("j");
		fila.add("k");
		fila.add("l");
		fila.add("m");
		fila.add("n");
		fila.add("o");
		fila.add("p");
		fila.add("q");
		fila.add("r");
		fila.add("s");
		fila.add("t");
		fila.add("u");
		fila.add("v");
		fila.add("w");
		fila.add("x");
		fila.add("y");
		fila.add("z");
	}

	@Override
	public int size() {
		return fila.size();
	}

	@Override
	public String head() {
		if (!empty()) {
			return fila.get(0);
		}
		return null;
	}

	@Override
	public void dequeue() {
		fila.remove(0);		
	}

	@Override
	public boolean empty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}
	
	
}
