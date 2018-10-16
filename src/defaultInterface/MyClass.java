package defaultInterface;

public class MyClass implements TestInfterface,TestInfterface2{

	@Override
	public String test() {
		return null;
	}
	
	@Override
	public String test3() {
		System.out.println("test3");
		return null;
	}

	@Override
	public String test1() {
		System.out.println("test1");
		return null;
	}

	public static void main(String[] args) {
		
//		for (int i = 101; i < 201; i++) {
//			if(primeNum(i)){
//				System.out.println(i);
//			}
//		}
		
//		for (int i = 100; i < 1000; i++) {
//			if(getSXH(i)){
//				System.out.println(i);
//			}
//		}
		
//		for (int i = 1; i < 21; i++) {
//			System.out.println("第"+i+"个月:"+getNum(i));
//		}
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(getYS(i));
//		}
		
		System.out.println(outGrade(89));
	}
	public static boolean primeNum(Integer i){
		
		for (int j = 2; j < i; j++) {
			if(i%j==0){
				return false;
			}
		}
		return true;
	}
	public static Integer getNum(Integer i){
		if(i == 1 || i == 2){
			return 1;
		}else{
			return getNum(i - 2) + getNum(i - 1);
		}
		
	}
	public static boolean getSXH(Integer i ){
		Integer j = i%10;
		Integer k = i/10%10;
		Integer l = i/100;
		if((j*j*j+k*k*k+l*l*l) != i){
			return false;
		}
		return true;
	}
	
	public static String getYS(Integer i){
		
		if(i%2 == 0 && i/2 != 1){
			return "2*"+getYS(i/2);
		}else if(i%3 ==0 && i/3 != 1){
			return "3*"+getYS(i/3);
		}else if(i%5 == 0 && i/5 != 1){
			return "5*"+getYS(i/5);
		}
		else if(i%7 == 0 && i/7 != 1){
			return "7*"+getYS(i/7);
		}
		else{
			return i+""; 
		}
	}
	
	public static String outGrade(Integer i){
		String str = i>=90?"A":(i>=60?"B":"C");
		return str;
	}
}
