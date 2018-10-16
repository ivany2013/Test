package defaultInterface;



public interface TestInfterface2 {
	default String test(){
		System.out.println("test2");
		return "test2";
	};
	
	String test3();
}
