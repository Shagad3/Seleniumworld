package day38Screenshotsheadlessadblockextensionssl;


interface A{
	void method1();
}
interface B extends A{
	void method1();
}
public class Assignment implements A,B{
	
	
	public void method1() {
		System.out.println("1234");
	}
	public void method1(String a) {
		System.out.println("51234");
	}
	
	

	public static void main(String[] a) {

		Assignment hello =	new Assignment();
		hello.method1();
		
		
	}

}
