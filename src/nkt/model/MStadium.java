package nkt.model;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import nkt.common.Common;
import nkt.entity.Seat;
import nkt.entity.StandA;
import nkt.entity.Stand;
import nkt.entity.StandB;
import nkt.entity.StandC;
import nkt.entity.StandD;

import java.util.Collections;

public class MStadium {
	Seat seat;

	public boolean buyTicketsStandA(List<StandA> listStandA,
			List<Seat> listSeat, StandA standA) {
		boolean flag = false;
		int size;
		seat = new Seat();
		seat.setCustommer(standA.getSeat().getCustommer());
		seat.setSeatName(standA.getSeat().getSeatName());
		listSeat.add(seat);
		size = listStandA.size();
		listStandA.add(standA);
		if (listStandA.size() > size) {
			flag = true;
		}
		return flag;

	}

	public boolean buyTicketsStandB(List<StandB> listStandB,
			List<Seat> listSeat, StandB standB) {
		boolean flag = false;
		int size;
		seat = new Seat();
		seat.setCustommer(standB.getSeat().getCustommer());
		seat.setSeatName(standB.getSeat().getSeatName());
		size = listStandB.size();
		listSeat.add(seat);
		listStandB.add(standB);
		if (listStandB.size() > size) {
			flag = true;
		}
		return flag;

	}

	public boolean buyTicketsStandC(List<StandC> listStandC,
			List<Seat> listSeat, StandC standC) {
		boolean flag = false;
		int size;
		seat = new Seat();
		seat.setCustommer(standC.getSeat().getCustommer());
		seat.setSeatName(standC.getSeat().getSeatName());
		size = listStandC.size();
		listSeat.add(seat);
		listStandC.add(standC);
		if (listStandC.size() > size) {
			flag = true;
		}
		return flag;

	}

	public boolean buyTicketsStandD(List<StandD> listStandD,
			List<Seat> listSeat, StandD standD) {
		boolean flag = false;
		int size;
		seat = new Seat();
		seat.setCustommer(standD.getSeat().getCustommer());
		seat.setSeatName(standD.getSeat().getSeatName());
		size = listStandD.size();
		listSeat.add(seat);
		listStandD.add(standD);
		if (listStandD.size() > size) {
			flag = true;
		}
		return flag;

	}

	public boolean payTicketsStandA(int identitycard, List<StandA> listStandA,
			List<Seat> listSeat) {
		boolean flag = false;
		int size;
		size = listStandA.size();
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getCustommer().getIdentitycard() == identitycard) {
				listSeat.remove(i);
			}
		}
		for (int i = 0; i < listStandA.size(); i++) {
			if (listStandA.get(i).getSeat().getCustommer().getIdentitycard() == identitycard) {
				listStandA.remove(i);
			}
		}
		if (size > listStandA.size()) {
			flag = true;
		}
		return flag;

	}

	public boolean payTicketsStandB(int identitycard, List<StandB> listStandB,
			List<Seat> listSeat) {
		boolean flag = false;
		int size;
		size = listStandB.size();
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getCustommer().getIdentitycard() == identitycard) {
				listSeat.remove(i);
			}
		}
		for (int i = 0; i < listStandB.size(); i++) {
			if (listStandB.get(i).getSeat().getCustommer().getIdentitycard() == identitycard) {
				listStandB.remove(i);
			}
		}
		if (size > listStandB.size()) {
			flag = true;
		}
		return flag;

	}

	public boolean payTicketsStandC(int identitycard, List<StandC> listStandC,
			List<Seat> listSeat) {
		boolean flag = false;
		int size;
		size = listStandC.size();
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getCustommer().getIdentitycard() == identitycard) {
				listSeat.remove(i);
			}
		}
		for (int i = 0; i < listStandC.size(); i++) {
			if (listStandC.get(i).getSeat().getCustommer().getIdentitycard() == identitycard) {
				listStandC.remove(i);
			}
		}
		if (size > listStandC.size()) {
			flag = true;
		}
		return flag;

	}

	public boolean payTicketsStandD(int identitycard, List<StandD> listStandD,
			List<Seat> listSeat) {
		boolean flag = false;
		int size;
		size = listStandD.size();
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getCustommer().getIdentitycard() == identitycard) {
				listSeat.remove(i);
			}
		}
		for (int i = 0; i < listStandD.size(); i++) {
			if (listStandD.get(i).getSeat().getCustommer().getIdentitycard() == identitycard) {
				listStandD.remove(i);
			}
		}
		if (size > listStandD.size()) {
			flag = true;
		}
		return flag;

	}

	public boolean changeTicketsstand(List<StandA> listStandA,
			List<StandB> listStandB, List<StandC> listStandC,
			List<StandD> listStandD, List<Seat> listSeat, Stand stand) {
		boolean flag = false;
		StandA standA;
		StandB standB;
		StandC standC;
		StandD standD;
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getCustommer().getIdentitycard() == stand
					.getSeat().getCustommer().getIdentitycard()) {
				listSeat.remove(i);
				flag = true;
			}
		}

		for (int i = 0; i < listStandA.size(); i++) {
			if (listStandA.get(i).getSeat().getCustommer().getIdentitycard() == stand
					.getSeat().getCustommer().getIdentitycard()) {
				listStandA.remove(i);
				flag = true;
			}
		}

		for (int i = 0; i < listStandB.size(); i++) {
			if (listStandB.get(i).getSeat().getCustommer().getIdentitycard() == stand
					.getSeat().getCustommer().getIdentitycard()) {
				listStandB.remove(i);
				flag = true;
			}

		}
		for (int i = 0; i < listStandA.size(); i++) {
			if (listStandC.get(i).getSeat().getCustommer().getIdentitycard() == stand
					.getSeat().getCustommer().getIdentitycard()) {
				listStandC.remove(i);
				flag = true;
			}
		}
		for (int i = 0; i < listStandA.size(); i++) {
			if (listStandD.get(i).getSeat().getCustommer().getIdentitycard() == stand
					.getSeat().getCustommer().getIdentitycard()) {
				listStandD.remove(i);
				flag = true;
			}
		}
		switch (stand.getNameStand()) {
		case Common.A: {
			standA = new StandA();
			standA.setCheck(0);
			standA.setCost(stand.getCost());
			standA.setNameStand(stand.getNameStand());
			standA.setSeat(stand.getSeat());
			standA.setTimeIn(stand.getTimeIn());
			listStandA.add(standA);
			flag = true;
			break;
		}
		case Common.B: {
			standB = new StandB();
			standB.setCost(stand.getCost());
			standB.setNameStand(stand.getNameStand());
			standB.setSeat(stand.getSeat());
			standB.setTimeIn(stand.getTimeIn());
			listStandB.add(standB);
			flag = true;
			break;
		}
		case Common.C: {
			standC = new StandC();
			standC.setCost(stand.getCost());
			standC.setNameStand(stand.getNameStand());
			standC.setSeat(stand.getSeat());
			standC.setTimeIn(stand.getTimeIn());
			listStandC.add(standC);
			flag = true;
			break;
		}
		case Common.D: {
			standD = new StandD();
			standD.setCost(stand.getCost());
			standD.setNameStand(stand.getNameStand());
			standD.setSeat(stand.getSeat());
			standD.setTimeIn(stand.getTimeIn());
			listStandD.add(standD);
			flag = true;
			break;
		}
		}
		listSeat.add(stand.getSeat());

		return flag;

	}

	public List<Seat> display(List<Seat> listSeat) {
		Collections.sort(listSeat, new Comparator<Seat>() {
			@Override
			public int compare(Seat seat1, Seat seat2) {
				return seat1.getSeatName().compareTo(seat2.getSeatName());
			}
		});
		return listSeat;

	}
}
