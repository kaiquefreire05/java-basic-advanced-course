package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Integer> intList = new ArrayList<>();
		
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		//list.add(20); // pode pegar mas não pode adicionar
	}

}
