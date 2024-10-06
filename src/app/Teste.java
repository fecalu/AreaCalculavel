package app;

import entidades.Quadrado;
import entidades.Retangulo;
import interfaces.AreaCalculavel;

public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel a = new Retangulo(3, 2);
		AreaCalculavel b = new Quadrado(2);
		
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());

	}

}
