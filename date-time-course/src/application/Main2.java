package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main2 {
	public static void main(String[] args) {
	
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		@SuppressWarnings("unused")
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		// Duas formas de fazer a mesma coisa
		System.out.println("d04 = "+ d04.format(fmt1));
		System.out.println("d04 = "+ fmt1.format(d04));
		System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = "+ d05.format(fmt2));
		
		// Imprimindo uma Instant
		System.out.println("d06 = "+ fmt3.format(d06));
		System.out.println("d06 = "+ fmt5.format(d06));
		
	}
}
