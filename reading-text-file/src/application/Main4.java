package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\Users\\kaiqu\\OneDrive\\Documentos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // fechamento catch
		
		
		
	}

}
