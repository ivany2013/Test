package defaultInterface;



public interface TestInfterface {
	default String test(){
		System.out.println("test");
		return "test";
	};
	
	String test1();
}
