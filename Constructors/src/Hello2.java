
public class Hello2 {
	int modelyear;
	String carName;
	
	public Hello2(int year, String name)
	{
		modelyear = year;
		carName = name;
	}
	
public static void main(String[] args) {
	Hello2 obj = new Hello2(1969, "BMW");
	System.out.println(obj.modelyear+" "+obj.carName);
}

}
