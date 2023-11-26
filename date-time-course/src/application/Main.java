package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/time/format/DateTimeFormatter.html

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatar a data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Z = Padrão de Londres
		LocalDate d01 = LocalDate.now(); // Pegando somente a data, local
		LocalDateTime d02 = LocalDateTime.now(); // Pegando data e hora, local
		Instant d03 = Instant.now(); // Data e hora GMT Global de Londres
		
		LocalDate d04 = LocalDate.parse("2012-01-18"); // Iserindo a data desejada
		LocalDateTime d05 = LocalDateTime.parse("2012-01-18T01:30:28"); // Inserindo data e hora
		Instant d06 = Instant.parse("2012-01-18T01:30:28Z");
		Instant d07 = Instant.parse("2012-01-18T01:30:28-03:00"); // Mudando o horário para o de São Paulo
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 8, 12);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 18, 1, 30);
		
		System.out.println("d01 = "+ d01);
		System.out.println("d02 = "+ d02);
		System.out.println("d03 = "+ d03);
		System.out.println("d04 = "+ d04);
		System.out.println("d05 = "+ d05);
		System.out.println("d06 = "+ d06);
		System.out.println("d07 = "+ d07);
		System.out.println("d08 =  "+ d08);
		System.out.println("d09 = "+ d09);
		System.out.println("d10 = "+ d10);
		System.out.println("d11 = "+ d11);
	}
}
