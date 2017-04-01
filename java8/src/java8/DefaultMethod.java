package java8;

public class DefaultMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T3();
		t1.print();
	}	
}

interface T1{
	default void print(){
		System.out.println("T1");
	}
}

interface T2{
	default void print(){
		System.out.println("T2");
	}
}

class T3 implements T1, T2{
	public void print(){
		System.out.println("T3");
	}
}