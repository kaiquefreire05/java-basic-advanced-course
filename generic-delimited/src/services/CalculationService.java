package services;

import java.util.List;

public class CalculationService {
	
	// quando static, ela só pode ser usada na própia classe
	public static <T extends Comparable<T>> T max(List<T> list) {
		// programação defensiva
		if (list.isEmpty())
			throw new IllegalStateException("List can't be empty");
		
		T max = list.get(0);
		for (T item : list) {	
			if (item.compareTo(max) > 0) // pegando o maior da lista
				max = item;
		}
		return max; // retornando o maior
	} 
	
}
