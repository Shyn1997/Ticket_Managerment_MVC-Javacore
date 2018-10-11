package nkt.entity;

public class Stand {
	private Seat seat;
	private int cost;
	private Long timeIn;
	private String nameStand;


	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Long getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Long timeIn) {
		this.timeIn = timeIn;
	}

	public String getNameStand() {
		return nameStand;
	}

	public void setNameStand(String nameStand) {
		this.nameStand = nameStand;
	}

}
