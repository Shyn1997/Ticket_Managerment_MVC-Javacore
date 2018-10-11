package nkt.controller;

import java.util.ArrayList;
import java.util.List;

import nkt.common.Common;
import nkt.entity.Seat;
import nkt.entity.StandA;
import nkt.entity.Stand;
import nkt.entity.StandB;
import nkt.entity.StandC;
import nkt.entity.StandD;
import nkt.model.MStadium;
import nkt.view.InputData;
import nkt.view.Menu;
import nkt.view.VStadium;

public class Program {

	public static void main(String[] args) {
		String checkOut;
		int sc;
		boolean flag = false;
		boolean flagTemp;
		List<Seat> listSeat = new ArrayList<Seat>();
		List<StandA> listStandA = new ArrayList<StandA>();
		List<StandB> listStandB = new ArrayList<StandB>();
		List<StandC> listStandC = new ArrayList<StandC>();
		List<StandD> listStandD = new ArrayList<StandD>();
		StandA standA;
		StandD standD;
		StandC standC;
		Stand stand;
		StandB standB;
		MStadium mStadium = new MStadium();
		VStadium vStadium = new VStadium();
		Menu menu = new Menu();
		InputData input = new InputData();
		do {
			menu.menu();
			menu.message("Ban chon: ");
			sc = input.inputInt();
			switch (sc) {
			case Common.BUY_TICKETS: {
				System.out.print("\nSelect the stand(A-B-C-D)");
				String stand1 = input.inputString();
				switch (stand1) {
				case Common.A: {
					standA = new StandA();
					standA = vStadium.buyTicketsStandA(standA, listStandA,
							listSeat);
					flagTemp = mStadium.buyTicketsStandA(listStandA, listSeat,
							standA);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.B: {
					standB = new StandB();
					standB = vStadium.buyTicketsStandB(standB, listStandB,
							listSeat);
					flagTemp = mStadium.buyTicketsStandB(listStandB, listSeat,
							standB);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.C: {
					standC = new StandC();
					standC = vStadium.buyTicketsStandC(standC, listStandC,
							listSeat);
					flagTemp = mStadium.buyTicketsStandC(listStandC, listSeat,
							standC);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.D: {
					standD = new StandD();
					standD = vStadium.buyTicketsStandD(standD, listStandD,
							listSeat);
					flagTemp = mStadium.buyTicketsStandD(listStandD, listSeat,
							standD);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				default: {
					menu.message("ERROR");
				}
				}
				flag = true;
				break;
			}
			case Common.DISPLAY: {
				listSeat = mStadium.display(listSeat);
				vStadium.displayALLSeat(listSeat);
				flag = true;
				break;
			}
			case Common.CHANGE_TICKETS: {
				stand = new Stand();
				vStadium.displayForChange(listSeat);
				stand = vStadium.changeTicketsStand(listSeat, stand);
				flagTemp = mStadium.changeTicketsstand(listStandA, listStandB,
						listStandC, listStandD, listSeat, stand);
				if (flagTemp) {
					menu.message("successfully");
				} else {
					menu.message("Failure");
				}
				flag = true;
				break;
			}
			case Common.PAY_THE_TICKETS: {
				System.out.print("\nSelect the stand(A-B-C-D)");
				String stand1 = input.inputString();
				switch (stand1) {
				case Common.A: {
					int identitycard;
					standA = new StandA();
					identitycard = vStadium.payTickets();
					flagTemp = mStadium.payTicketsStandA(identitycard,
							listStandA, listSeat);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.B: {
					int identitycard;
					standB = new StandB();
					identitycard = vStadium.payTickets();
					flagTemp = mStadium.payTicketsStandB(identitycard,
							listStandB, listSeat);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.C: {
					int identitycard;
					standC = new StandC();
					identitycard = vStadium.payTickets();
					flagTemp = mStadium.payTicketsStandC(identitycard,
							listStandC, listSeat);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				case Common.D: {
					int identitycard;
					standD = new StandD();
					identitycard = vStadium.payTickets();
					flagTemp = mStadium.buyTicketsStandD(listStandD, listSeat,
							standD);
					if (flagTemp) {
						menu.message("successfully");
					} else {
						menu.message("Failure");
					}
					break;
				}
				default: {
					menu.message("ERROR");
				}
				}
				flag = true;
				break;
			}
			case Common.END: {
				flag = false;
			}
			}
		} while (flag);
	}
}
