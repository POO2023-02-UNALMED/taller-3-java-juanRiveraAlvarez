package taller3.televisores;

public class Mian {
    public static void main(String[] args) {
        
		Marca marca =  new Marca("Ipple");
		
		TV tv1 =  new TV(marca, true);
		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.setCanal(60);
		control1.canalDown();
		control1.canalUp();
		control1.canalDown();
		control1.turnOff();
		control1.canalUp();
		
		TV tv2 = new TV(marca, false);
		Control control2 = new Control();
		control2.enlazar(tv2);
		control2.setCanal(20);
		control2.canalUp();
		control2.canalDown();
		control2.turnOn();
		control2.canalUp();
		control2.canalDown();
		control2.canalUp();
		
		TV tv3 = new TV(marca, true);
		Control control3 = new Control();
		control3.enlazar(tv3);
		control3.setCanal(122);
		control3.canalUp();
		control3.canalUp();
		
		TV tv4 = new TV(marca, true);
		Control control4 = new Control();
		control4.enlazar(tv4);
		control4.setCanal(-1);
		control4.canalUp();
		control4.canalDown();
		
		TV tv5 = new TV(marca, true);
		Control control5 = new Control();
		control5.enlazar(tv5);
		control5.canalDown();
		control5.canalUp();
		
		TV tv6 = new TV(marca, true);
		Control control6 = new Control();
		control6.enlazar(tv6);
		control6.setCanal(120);
		control6.canalUp();
		control6.canalDown();
		
		TV tv7 = new TV(marca, true);
		Control control7 = new Control();
		control7.enlazar(tv7);
		control7.setCanal(35);
		control7.canalUp();
		control7.setCanal(200);
		
		boolean ok = false;
		if (tv1.getCanal() == 59 && 
			tv2.getCanal() == 2 &&
			tv3.getCanal() == 3 &&
			tv4.getCanal() == 1 &&
			tv5.getCanal() == 2 &&
			tv6.getCanal() == 119 &&
			tv7.getCanal() == 36)
			ok = true;
		
        System.out.println(ok);
        System.out.println(tv3.getCanal());
    }
}
