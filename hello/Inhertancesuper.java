class x
{
	x(){
		System.out.println("constructer 1");
	}
	x(int i){
		System.out.println("constructer 2");
	}
	x(int i,int j){
		System.out.println("constructer 3");
	}
}

public class Inhertancesuper extends x {
	Inhertancesuper(){
		//super(20,30);
	}
public static void main(String[] args){
	//Inhertancesuper b=new Inhertancesuper();
	System.out.println("main");
}
}
