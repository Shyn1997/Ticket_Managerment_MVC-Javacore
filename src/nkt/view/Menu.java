package nkt.view;

import nkt.common.Common;

public class Menu {
	public void menu(){
		System.out.print("\nchoose "+Common.BUY_TICKETS+" to by tickets");
		System.out.print("\nchoose "+Common.DISPLAY+" to display tickets");
		System.out.print("\nchoose "+Common.CHANGE_TICKETS+" to change tickets");
		System.out.print("\nchoose "+Common.PAY_THE_TICKETS+" to pay tickets");
		System.out.print("\nchoose "+Common.END+" to end");
	}

	public void message(String message){
		System.out.print("\n"+message);
	}

}
