package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		//[1]
		//Singleton singleton = new Singleton();
		//에러, 생성자가 private
		
		//[2]
		//Singleton singleton1 = Singleton.getInstance();
		//Singleton singleton2 = Singleton.getInstance();
		//System.out.println(singleton1 == singleton2);
		
		//[3]
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		
	}
}
