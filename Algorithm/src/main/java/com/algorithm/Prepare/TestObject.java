public class TestObject implements Comparable{
	private int value;
	public int getValue(){
		return value;
	}
	@override
	public int compareTo(Object o1, Object o2){
		TestObject to1 = (TestObject)o1;
		TestObject to2 = (TestObject)o2;
		return to1.getValue()=to2.getValue();
	}

}