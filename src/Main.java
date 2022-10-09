import java.util.Scanner;

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
		stringSample();
		/*arrayListSample();*/
		
		
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
