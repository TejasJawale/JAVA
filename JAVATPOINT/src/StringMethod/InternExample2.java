package StringMethod;

public class InternExample2 {
	public static void main(String[] args) {
		String s1 = "Javatpoint";
		String s2 = s1.intern();
		String s3 = new String("Javatpoint");
		String s4 = s3.intern();
		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3); // False
		System.out.println(s1 == s4); // True
		System.out.println(s2 == s3); // False
		System.out.println(s2 == s4); // True
		System.out.println(s3 == s4); // False
	}
}
