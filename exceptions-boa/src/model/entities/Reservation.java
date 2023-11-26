package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// construtores
	
	public Reservation() {}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
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
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		// throws quer dizer que ele pode propagar uma exceção
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be be future dates");
		}
		
		// se a data de checkout não for posterior a data e checkin
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
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
