package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		//Number x = myNums.get(0); // pode adicionar mas não pegar
				
	}

}
