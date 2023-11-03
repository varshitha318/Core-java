package programs;

class Box
{
	double width;
	double height;
	double depth;
}
 class Boxdemo {
public static void main(String args[]) {
	Box mybox=new Box();
	mybox.width=10;
	mybox.height=20;
	mybox.depth=30;
	double vol;
	vol=mybox.width*mybox.height*mybox.depth;
	System.out.println("volume="+vol);
}
}