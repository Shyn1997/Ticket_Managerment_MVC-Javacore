package nkt.entity;

public class Seat {
	private String seatName;
	private Custommer custommer;
	

	public Custommer getCustommer() {
		return custommer;
	}
	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

}
