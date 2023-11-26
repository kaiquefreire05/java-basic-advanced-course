package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// construtores
	
	public Reservation() {}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	// getters e setters
	
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	// métodos da classe
	
	// duração de dias
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // está em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  // convertendo milisegundos
	}
	
	// checkin e checkout
	public void updateDate(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room "+ roomNumber 
				+ ", check-in: "
				+ sdf.format(checkIn) + ", check-out: "+ sdf.format(checkOut)+ ", "
				+ duration() + " nights";
	}
	
	
}
