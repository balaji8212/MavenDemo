package org.tcs;

	public class Adactin extends LibGlobal {
		public static void main(String[] args) {
			
			browserConfigur();
		    browserLaunch("http://adactinhotelapp.com/");
		    
		    HotelLogin h = new HotelLogin();
			type(h.getTxtUserName(), "harishdurai123");
			type(h.getTxtPass(), "12345678909");
			press(h.getBtnLogin());
			nextPage n = new nextPage();
            dropDowndeSelectByIndex(n.getDropDow(), 1);
			dropDowndeSelectByIndex(n.getDropDow1(), 1);
		}	

}
