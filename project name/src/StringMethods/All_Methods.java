package StringMethods;

public class All_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Velocity";
		String b="Velocity";
		String c=new String("Velocity");
		String d=new String("Velocity");
		
		System.out.println(a);//Velocity
		System.out.println(a.length());//8
		System.out.println(a.charAt(5));//i
		System.out.println(a.indexOf('i'));//5
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));
		System.out.println();
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace('i', 'e'));
		System.out.println(a.replaceAll("Vel", "Stand"));
		System.out.println(a.toCharArray());
		System.out.println(a.endsWith("Class"));
		System.out.println(a.startsWith("Start"));
		System.out.println(a.lastIndexOf(a));
		
		
	}

}
