package nkt.view;

import java.util.List;
import java.util.concurrent.TimeUnit;

import nkt.common.Common;
import nkt.entity.Custommer;
import nkt.entity.Seat;
import nkt.entity.StandA;
import nkt.entity.Stand;
import nkt.entity.StandB;
import nkt.entity.StandC;
import nkt.entity.StandD;
import nkt.iview.IView;

public class VStadium implements IView {
	InputData inputdata = new InputData();
	Seat seat;
	Custommer custommer;

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////
	public StandA buyTicketsStandA(StandA standA, List<StandA> listStandA,
			List<Seat> listSeat) {
		int temp = 0;
		do {
			long mnTime;
			int identityCard;
			String chairName, name;
			custommer = new Custommer();
			seat = new Seat();

			System.out.print("\nEnter identity card:");
			identityCard = inputdata.inputInt();
			for (Seat seat : listSeat) {
				if (seat.getCustommer().getIdentitycard() == identityCard) {
					System.out
							.print("\nThe identity card has been used, please re-enter: ");
					temp = 1;
				} else {
					temp = 0;
				}
			}
			if (temp == 0) {
				System.out.print("\nEnter Name:");
				name = inputdata.inputString();
				mnTime = System.currentTimeMillis();
				standA.setTimeIn(TimeUnit.HOURS.convert(mnTime,
						TimeUnit.MILLISECONDS));
				standA.setNameStand(Common.standA);
				System.out.print("\nChoose a chair (Vip-1, Casual-0)");
				standA.setCheck(inputdata.inputInt());
				do {
					if (standA.getCheck() == 1) {
						System.out.print("\nEnter the chair name: ");
						chairName = inputdata.inputString();
						standA.setSeatingVip(chairName);
						standA.setCost(Common.VIP_COST);

					} else {
						System.out.print("\nEnter the chair name: ");
						chairName = inputdata.inputString();
						standA.setCost(Common.FARE_COST);
					}
					for (StandA standA1 : listStandA) {
						if (standA1.getSeat().getSeatName()
								.equalsIgnoreCase(chairName)) {
							System.out
									.print("\nThe chair was bought, please re-enter: ");
							temp = 1;
						} else {
							temp = 0;
						}
					}
				} while (temp == 1);
				custommer.setName(name);
				custommer.setIdentitycard(identityCard);
				seat.setCustommer(custommer);
				seat.setSeatName(chairName);
				standA.setSeat(seat);
			}
		} while (temp == 1);
		return standA;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////////

	public StandB buyTicketsStandB(StandB standB, List<StandB> listStandB,
			List<Seat> listSeat) {
		int temp = 0;
		do {
			long mnTime;
			int identityCard;
			String chairName, name;
			custommer = new Custommer();
			seat = new Seat();

			System.out.print("\nEnter identity card:");
			identityCard = inputdata.inputInt();
			for (Seat seat : listSeat) {
				if (seat.getCustommer().getIdentitycard() == identityCard) {
					System.out
							.print("\nThe identity card has been used, please re-enter: ");
					temp = 1;
				} else {
					temp = 0;
				}
			}
			if (temp == 0) {
				System.out.print("\nEnter Name:");
				name = inputdata.inputString();
				mnTime = System.currentTimeMillis();
				standB.setTimeIn(TimeUnit.HOURS.convert(mnTime,
						TimeUnit.MILLISECONDS));
				standB.setNameStand(Common.standB);
				do {
					System.out.print("\nEnter the chair name: ");
					chairName = inputdata.inputString();
					for (StandB standB1 : listStandB) {
						if (standB1.getSeat().getSeatName()
								.equalsIgnoreCase(chairName)) {
							System.out
									.print("\nThe chair was bought, please re-enter: ");
							temp = 1;
						} else {
							temp = 0;
						}
					}
				} while (temp == 1);
				standB.setCost(Common.FARE_COST);
				custommer.setName(name);
				custommer.setIdentitycard(identityCard);
				seat.setCustommer(custommer);
				seat.setSeatName(chairName);
				standB.setSeat(seat);
			}
		} while (temp == 1);
		return standB;
	}
	public StandC buyTicketsStandC(StandC standC, List<StandC> listStandC,
			List<Seat> listSeat) {
		int temp = 0;
		do {
			long mnTime;
			int identityCard;
			String chairName, name;
			custommer = new Custommer();
			seat = new Seat();

			System.out.print("\nEnter identity card:");
			identityCard = inputdata.inputInt();
			for (Seat seat : listSeat) {
				if (seat.getCustommer().getIdentitycard() == identityCard) {
					System.out
							.print("\nThe identity card has been used, please re-enter: ");
					temp = 1;
				} else {
					temp = 0;
				}
			}
			if (temp == 0) {
				System.out.print("\nEnter Name:");
				name = inputdata.inputString();
				mnTime = System.currentTimeMillis();
				standC.setTimeIn(TimeUnit.HOURS.convert(mnTime,
						TimeUnit.MILLISECONDS));
				standC.setNameStand(Common.standB);
				do {
					System.out.print("\nEnter the chair name: ");
					chairName = inputdata.inputString();
					for (StandC standB1 : listStandC) {
						if (standB1.getSeat().getSeatName()
								.equalsIgnoreCase(chairName)) {
							System.out
									.print("\nThe chair was bought, please re-enter: ");
							temp = 1;
						} else {
							temp = 0;
						}
					}
				} while (temp == 1);
				standC.setCost(Common.FARE_COST);
				custommer.setName(name);
				custommer.setIdentitycard(identityCard);
				seat.setCustommer(custommer);
				seat.setSeatName(chairName);
				standC.setSeat(seat);
			}
		} while (temp == 1);
		return standC;
	}
	
	public StandD buyTicketsStandD(StandD standD, List<StandD> listStandD,
			List<Seat> listSeat) {
		int temp = 0;
		do {
			long mnTime;
			int identityCard;
			String chairName, name;
			custommer = new Custommer();
			seat = new Seat();

			System.out.print("\nEnter identity card:");
			identityCard = inputdata.inputInt();
			for (Seat seat : listSeat) {
				if (seat.getCustommer().getIdentitycard() == identityCard) {
					System.out
							.print("\nThe identity card has been used, please re-enter: ");
					temp = 1;
				} else {
					temp = 0;
				}
			}
			if (temp == 0) {
				System.out.print("\nEnter Name:");
				name = inputdata.inputString();
				mnTime = System.currentTimeMillis();
				standD.setTimeIn(TimeUnit.HOURS.convert(mnTime,
						TimeUnit.MILLISECONDS));
				standD.setNameStand(Common.standB);
				do {
					System.out.print("\nEnter the chair name: ");
					chairName = inputdata.inputString();
					for (StandD standB1 : listStandD) {
						if (standB1.getSeat().getSeatName()
								.equalsIgnoreCase(chairName)) {
							System.out
									.print("\nThe chair was bought, please re-enter: ");
							temp = 1;
						} else {
							temp = 0;
						}
					}
				} while (temp == 1);
				standD.setCost(Common.FARE_COST);
				custommer.setName(name);
				custommer.setIdentitycard(identityCard);
				seat.setCustommer(custommer);
				seat.setSeatName(chairName);
				standD.setSeat(seat);
			}
		} while (temp == 1);
		return standD;
	}

	public void displayALLSeat(List<Seat> listSeat) {
		for (Seat seat : listSeat) {
			this.displaySeat(seat);
		}
	}

	public void displaySeat(Seat seat) {
		System.out.print("\n--------------------------------------");
		System.out.print("\nIdentitycard: "
				+ seat.getCustommer().getIdentitycard());
		System.out.print("\nName: " + seat.getCustommer().getName());
		System.out.print("\nSeat: " + seat.getSeatName());
		System.out.print("\n--------------------------------------");
	}

	public Stand changeTicketsStand(List<Seat> listSeat, Stand stand) {
		int identitycard;
		String name = null;
		String seatId = null;
		int temp = 1;
		int temp2 = 0;
		Seat seat1 = new Seat();
		Custommer custommer = new Custommer();
		do {
			System.out.print("\n Enter identitycard :");
			identitycard = inputdata.inputInt();
			for (Seat seat : listSeat) {
				if (seat.getCustommer().getIdentitycard() == identitycard) {
					identitycard = seat.getCustommer().getIdentitycard();
					name = seat.getCustommer().getName();

					temp = 0;
				}
			}
			if (temp == 1) {
				System.out
						.print("\nNot found identitycard, please enter agan: ");
			} else {
				do {
					System.out.print("\n Enter new seatId :");
					seatId = inputdata.inputString();
					for (Seat seat : listSeat) {
						if (seat.getSeatName().equalsIgnoreCase(seatId)) {
							System.out
									.print("\nChairs were sold, please enter agan :");
							temp2 = 1;
						} else {
							temp2 = 0;
						}
					}
				} while (temp2 == 1);
			}

		} while (temp == 1);
		System.out.print("\nEnter the stand you want to change(A-B-C-D) :");
		stand.setNameStand(inputdata.inputString());
		stand.setCost(Common.FARE_COST);
		stand.setTimeIn(TimeUnit.HOURS.convert(System.currentTimeMillis(),
				TimeUnit.MILLISECONDS));
		custommer.setIdentitycard(identitycard);
		custommer.setName(name);
		seat1.setSeatName(seatId);
		seat1.setCustommer(custommer);
		stand.setSeat(seat1);
		return stand;
	}

	public int payTickets() {
		int identitycard;
		System.out.print("\nEnter identity card:");
		identitycard = inputdata.inputInt();
		return identitycard;

	}

	public void displayForChange(List<Seat> listSeat) {
		System.out.print("\nList the seats were bought");
		for (Seat seat : listSeat) {
			System.out.print("\t" + seat.getSeatName());
		}
	}

}