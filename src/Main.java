import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//String name=sc.nextLine();
		
		/*String name = "";
		for (String arg:args) {
			name+=arg+" ";
		}
		
		System.out.println("Hellow World,"+name);*/
		
		
		//intSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		//bitOperationSample();
		//stringSample();
		//arrayListSample();
		setSample();
		
		
	}

	private static void setSample() {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);

		set1.add(3);
		System.out.println(set1);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println(set2);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set1.addAll(set2);
		System.out.println(set1);
		
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set1.removeAll(set2);
		System.out.println(set1);
		
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		
		set2.removeAll(set1);
		System.out.println(set2);
		
		
		
	}

	private static void arrayListSample() {
		// TODO Auto-generated method stub
		ArrayList<Integer> iAl = new ArrayList<>();
		int[] iAr = new int[10];
		
		System.out.println("array length:"+iAr.length);
		System.out.println("arraylist size:"+iAl.size());
		iAr[0] = 1;
		iAr[1] = 2;
		iAr[2] = 3;
		
		iAl.add(1);
		iAl.add(2);
		iAl.add(3);
		
		System.out.println("array elements:");
		for (int i=0;i<iAr.length;i++) {
			System.out.print(iAr[i]+",");
		}
		System.out.println();
		
		System.out.println("arraylist elements:");
		for (int i=0;i<iAl.size();i++) {
			System.out.print(iAl.get(i)+",");
		}
		System.out.println();
		
		
		// change element value at position 1.
		
		iAr[1] = 100;
		iAl.set(1, 100);
		
		System.out.println("array elements:");
		for (int i=0;i<iAr.length;i++) {
			System.out.print(iAr[i]+",");
		}
		System.out.println();
		
		System.out.println("arraylist elements:");
		for (int i=0;i<iAl.size();i++) {
			System.out.print(iAl.get(i)+",");
		}
		System.out.println();
		
		// insert element 200 at position 1
		for (int i=iAr.length-2;i>=1;i--) { // move elements to next position
			iAr[i+1] = iAr[i];
		} 
		iAr[1] = 200;
		
		iAl.add(1,200);
		System.out.println("array elements:");
		for (int i:iAr) {
			System.out.print(i+",");
		}
		System.out.println();
		
		System.out.println("arraylist elements:");
		for (int i:iAl) {
			System.out.print(i+",");
		}
		System.out.println();
		
		// remove element
		iAl.remove(1);
		System.out.println("arraylist elements:");
		for (int i=0;i<iAl.size();i++) {
			System.out.print(iAl.get(i)+",");
		}
		System.out.println();
		
		ArrayList iAl2 = new ArrayList();
		iAl2.add(1);
		iAl2.add("String");
		iAl2.add(true);
		iAl2.add(12.3);
		
		System.out.println("arraylist elements:");
		for (Object o:iAl2) {
			System.out.print(o+",");
		}
		System.out.println();
		
		System.out.println(iAl2.contains("String"));
		System.out.println(iAl2.contains("abc"));
		
		System.out.println(iAl2.indexOf("String"));
		System.out.println(iAl2.lastIndexOf("String"));
		
		
		// remove element
		iAl2.remove(12.3);
		iAl2.remove(1);
		System.out.println("arraylist elements:");
		for (Object o:iAl2) {
			System.out.print(o+",");
		}
		System.out.println();
		
		
		
	}

	private static void stringSample() {
		// TODO Auto-generated method stub
		String a,b;
		System.out.print("Please input string a:");
		a = sc.nextLine();
		System.out.print("Please input string b:");
		b = sc.nextLine();
		
		String c = a+b;
		System.out.println("a+b='" + c + "'");
		
		System.out.println("Please input spliter: ");
		String spliter = sc.nextLine();
		String[] tockens = c.split(spliter);
		
		System.out.println("Splited results:");
		for (String s:tockens) {
			System.out.println(s);
		}
		
		System.out.println("The characters in the first tocken are:");
		for (int i=0;i<tockens[0].length();i++) {
			char cc = tockens[0].charAt(i);
			System.out.print(cc+" ");
		}
		System.out.println();
		
		
		System.out.println("Please input a sub string: ");
		String subs = sc.nextLine();
		int idx = c.indexOf(subs);
		System.out.println("The first index of the substring is: "+idx);
		idx = c.lastIndexOf(subs);
		System.out.println("The last index of the substring is: "+idx);
		
		System.out.println("All indexes of the substrings are: ");
		idx = c.indexOf(subs);
		
		while (idx>=0) {
			System.out.print(idx+" ");
			idx=c.indexOf(subs, idx+subs.length());
		}
		System.out.println();
		
		System.out.println("Please input the position of a substr:");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(c.substring(start, end));
		
		int i1 = Integer.parseInt("12345");
		double d = Double.parseDouble("134.25");
		boolean bool = Boolean.parseBoolean("true");
	}

	private static void bitOperationSample() {
		// TODO Auto-generated method stub
		int a,b;
		
		System.out.print("Please input int a,b:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a&b="+(a&b));
		System.out.println("a|b="+(a|b));
		System.out.println("a^b="+(a^b));

	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		int[] intArray = new int[10];
		for (int i=0;i<intArray.length;i++) {
			intArray[i]=100-i*5;
		}
		for (int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		
		int[] intArray2 = {3,4,5,6,7};
		System.out.println("The length of intArray2 is "+intArray2.length);
		for (int i=0;i<intArray2.length;i++) {
			System.out.print(intArray2[i]+" ");
		}
		System.out.println();
	}

	private static void booleanSample() {
		// TODO Auto-generated method stub
		boolean a,b;
		System.out.print("Please input boolean a,b:");
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		
		System.out.println("a || b="+(a || b));
		System.out.println("a && b="+(a && b));
		System.out.println("!a="+!a);
		
		boolean c = a && (!a || b);
		boolean d = b || !(a || b);
		if (c) {
			System.out.println("First time is a true");
		} else if (d) {
			System.out.println("Second time is a true");
		} else {
			System.out.println("Unlucky! False!");
		}
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		double a,b;
		
		System.out.print("Please input double a,b:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
	}

	private static void intSample() {
		// TODO Auto-generated method stub
		long a,b;
		
		System.out.print("Please input long a,b:");
		a = sc.nextLong();
		b = sc.nextLong();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
	}

}
