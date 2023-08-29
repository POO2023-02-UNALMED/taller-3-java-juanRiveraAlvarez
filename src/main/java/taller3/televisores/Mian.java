package taller3.televisores;



public class Mian {
    public static void main(String[] args) {
        
		Marca marca =  new Marca("Mitorola");
		
		TV tv1 =  new TV(marca, true);
		tv1.setVolumen(5);
		tv1.volumenDown();
		tv1.volumenUp();
		tv1.volumenDown();
		tv1.volumenDown();
		tv1.turnOff();
		tv1.volumenUp();
		
		TV tv2 = new TV(marca, false);
		tv2.setVolumen(3);
		tv2.volumenUp();
		tv2.volumenDown();
		tv2.turnOn();
		tv2.volumenUp();
		tv2.volumenUp();
		tv2.volumenDown();
		tv2.volumenUp();
		
		TV tv3 = new TV(marca, true);
		tv3.setVolumen(9);
		tv3.volumenUp();
		
		TV tv4 = new TV(marca, true);
		tv4.setVolumen(-2);
		tv4.volumenDown();
		
		TV tv5 = new TV(marca, true);
		tv5.setVolumen(0);
		tv5.volumenDown();
		
		TV tv6 = new TV(marca, true);
		tv6.setVolumen(7);
		tv6.volumenUp();
		
		TV tv7 = new TV(marca, true);
		tv7.setVolumen(4);
		tv7.volumenDown();
		tv7.setVolumen(15);
		
		boolean ok = false;
		if (tv1.getVolumen() == 3 && 
			tv2.getVolumen() == 3 &&
			tv3.getVolumen() == 2 &&
			tv4.getVolumen() == 0 &&
			tv5.getVolumen() == 0 &&
			tv6.getVolumen() == 7 &&
			tv7.getVolumen() == 3)
			ok = true;
		
		
    }
}
