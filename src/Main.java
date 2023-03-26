import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
		//charSample();
		//booleanSample();
		//arraySample();
		//bitOperationSample();
		//stringSample();
		//arrayListSample();
		//setSample();
		//hashmapSample();
		//bitwiseSample();
		printfSample();
		
		
	}

	private static void printfSample() {
		// TODO Auto-generated method stub
		System.out.printf("Chelsea lost again.\n");
		System.out.printf("%s won last week\n", "Manchest United");
		System.out.printf("The score is %d:%d\n", 3,0);
		double p = 5.1321343141;
		double area = 10.4254325235342;
		System.out.printf("The perimeter is %.2f, the area is %.2f\n", p, area);
		System.out.println("====================");
		
		//System.out.printf("Triangle a b c Perimeter Area\n");
		System.out.printf("%-20s %-5s %-5s %-5s %-10s %-10s\n", "Triangle", "a", "b", "c", "Perimeter", "Area");
		String triangle = "ABC";
		int a=4;
		int b=5;
		int c=6;
		int P=a+b+c;
		p=(double)P/2;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.printf("%-20s %-5d %-5d %-5d %-10d %-10.2f\n", triangle, a, b, c, P, area);
	}

	private static void bitwiseSample() {
		// TODO Auto-generated method stub
		int a = 1024*1024;
		System.out.println(a+":"+Integer.toBinaryString(a));
		
		int b = 0x08000800;
		System.out.println(b+":"+Integer.toBinaryString(b));
		
		int c = 0B1100110001100110000000;
		System.out.println(c+":"+Integer.toBinaryString(c));
		
		c >>= 1;
		System.out.println(c+">>1:"+Integer.toBinaryString(c));
		
		c >>= 2;
		System.out.println(c+">>2:"+Integer.toBinaryString(c));
		
		c = ~c;
		System.out.println("~"+c+":"+Integer.toBinaryString(c));
		
		a=0B110011000;
		b=0B011101110;
				
		System.out.println("a&b:"+Integer.toBinaryString(a&b));
		System.out.println("a|b:"+Integer.toBinaryString(a|b));
		System.out.println("a^b:"+Integer.toBinaryString(a^b));
		
		
		
		
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'A'+1;
		char c3 = 'a'+5;
		
		System.out.println(c1+" "+c2+" "+c3);
	}

	private static void hashmapSample() {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		hashmap.put("Chelsea", 17);
		hashmap.put("HuangZheng", 55);
		hashmap.put("Peter", 16);
		hashmap.put("David",14);
		
		System.out.println(hashmap.get("Chelsea"));
		System.out.println(hashmap.get("Peter"));
		
		HashMap<String, Human> hashmap2 = new HashMap<>();
		Human person1 = new Human("Chelsea", "Female", 17);
		Human person2 = new Human("HuangZheng", "Male", 55);
		Human person3 = new Human("Peter", "Male", 16);
		Human person4 = new Human("Helen", "Female", 40);
		
		hashmap2.put(person1.name, person1);
		hashmap2.put(person2.name, person2);
		hashmap2.put(person3.name, person3);
		hashmap2.put(person4.name, person4);
		
		System.out.println(hashmap2.get("Chelsea"));
		System.out.println(hashmap2.get("Peter"));
		
		System.out.println("====================");
		
		for (String key:hashmap2.keySet()) {
			System.out.println(hashmap2.get(key));
		}
		
		System.out.println("=======================");
		hashmap2.remove("HuangZheng");
		for (String key:hashmap2.keySet()) {
			System.out.println(hashmap2.get(key));
		}
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
		
		System.out.println("=============================");
		
		ArrayList<String> sAl2 = new ArrayList<>();
		sAl2.add("HuangZheng");
		sAl2.add("David");
		sAl2.add("Chelsea");
		sAl2.add("Hellen");
		sAl2.add("Peter");
		
		
		System.out.println(sAl2);
		Collections.sort(sAl2);
		System.out.println(sAl2);
		Collections.sort(sAl2, Collections.reverseOrder());
		System.out.println(sAl2);
		
		int[] iAl3 = {3489, 732, 1, 3, 89, 3384};
		for (int i:iAl3) {
			System.out.print(i+",");
		}
		System.out.println();
		Arrays.sort(iAl3);
		for (int i:iAl3) {
			System.out.print(i+",");
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
		/*int[] intArray = new int[10];
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
		System.out.println();*/
		
		SortData[] data = new SortData[5];
		data[0]=new SortData(5,"abc");
		data[1]=new SortData(10, "def");
		data[2]=new SortData(10, "123");
		data[3]=new SortData(12, "789");
		data[4] = new SortData(7, "a12");
		Arrays.sort(data);
		
		for (SortData d:data) {
			System.out.print(d+" ");
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

class Human {
	String name;
	String gender;
	int 	age;
	
	public Human(String n,String g, int a) {
		this.name = n;
		this.gender = g;
		this.age = a;
	}
	
	@Override
	public String toString() {
		return "name:" + name +", gender:" + gender + ", age: " + age;
	}
}

class SortData implements Comparable<SortData> {
	int a;
	String b;
	
	public SortData(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "{"+this.a+",\""+this.b+"\"}";
	}

	@Override
	public int compareTo(SortData o) {
		// TODO Auto-generated method stub
		return this.a - o.a;
	}

	
}
