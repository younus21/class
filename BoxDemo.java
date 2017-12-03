package Cheaprer6;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 mybox = new Box1();
		double vol;
		// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
		}
		
	}


