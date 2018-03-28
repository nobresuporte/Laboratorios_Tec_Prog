import java.util.*;

class Main {

	/*
	ANDERSON NOBRE DA SILVA - 352132
	EDEALCIA REGINA ALVES LUCIANO -

	 */

	public static void main(String args[]){

		Editor e = new Editor(10); //Editor com capacidade para 10 figuras (poderia ser "infinito" usando uma lista)

		Ponto p1 = new Ponto(1, 4);
		Ponto p2 = new Ponto(5, 2);
		Ponto p3 = new Ponto(1, 9);
		Quadrado q1 = new Quadrado(p1, 3);
		Quadrado q2 = new Quadrado(p2, 4);
		Circulo c1 = new Circulo(p3, 2);

		//Inserindo algumas figuras no editor.....
		e.receberComandos(1, q1);
		e.receberComandos(1, q2);
		e.receberComandos(1, c1);

		//Imprimindo áreas de cada figura.........
		e.imprimirAreas();

		System.out.print("\n");

		//Desenhando só quadrados.................
		e.desenharFig("Quadrado");
		e.desenharFig("Circulo");

	}

}
