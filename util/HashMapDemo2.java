import java.util.*;

public class HashMapDemo2
{
	public static void main(String args[])
	{
		HashMap hm = new HashMap();

		hm.put("rajni", new Integer(1000000000));
		hm.put("ajith", new Integer(1000000));
		hm.put("vijay", new Integer(1000000));
		hm.put("abc", new Integer(2000));
		
		System.out.println(hm);
		
		Set s1 = hm.keySet();
		
		System.out.println(s1);

		Collection c = hm.values();
		
		System.out.println(c);
	}
}