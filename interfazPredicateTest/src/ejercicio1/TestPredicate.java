package ejercicio1;

import java.util.function.Predicate;

public class TestPredicate {
	public static void main(String[] args) {
		Predicate<Integer> predicado = (valor)-> {
			return valor > 0 ;
		};
		
		System.out.println(predicado.test(123));
	}
}
