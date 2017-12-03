package Cheaprer6;

public class BoxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BoxDemo3 mybox1 = new BoxDemo3();
      BoxDemo3 mybox2 = new BoxDemo3();
      mybox1.setdim(10,20,30);
      mybox2.setdim(10,2,3);
      double vol1,vol2;
      vol1 = mybox1.younus();
      System.out.println(vol1);
      vol2 =  mybox2.younus();
      System.out.println(vol2);
	}

}
