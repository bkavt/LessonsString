package by.htp.string.launch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		/*String s="First string";
		System.out.println("s: "+s.hashCode());
		String s2="Second string";
		System.out.println("s2: "+s2.hashCode());
		String s3="First string";
		System.out.println("s3: "+s3.hashCode());
		String s4=s3;
		System.out.println("s4: "+s4.hashCode());
		String s5=new String("Second string");
		System.out.println("s5: "+s5.hashCode());
		String s6=new String();
		System.out.println("s6: "+s6.hashCode());
		String s7="";
		System.out.println("s7: "+s7.hashCode());
		
		System.out.println(s2==s5);
		System.out.println(s2.equals(s5));
		
		String s8=s5.intern();
		System.out.println(s2==s8);
		
		if(s5.isEmpty()){}
		
		
		char[]data=new char[10];
		data[0]='a';
		data[1]='b';
		data[9]='c';
		String s9=String.copyValueOf(data);
		System.out.println(s9);*/
		
	//Num1	
		String str="dfddfdfsfsfd";
		System.out.println(str);
		char ch='#';
		int k=7;
		char[] charArray;
		charArray=str.toCharArray();
		for(int i=k-1;i<charArray.length;i=k+i){
			charArray[i]=ch;
		}
		str=String.copyValueOf(charArray);
		System.out.println(str);
		//Num8		
		
		
		str="dfda(fdfsfs)fd";
		System.out.println(str);
		charArray=str.toCharArray();
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		String inStr=scanner.next();
		System.out.println(inStr);
		
		char[] inChar;
		inChar=inStr.toCharArray();
		
		int indexOne=str.indexOf(inChar[0]);
		int indexTwo=str.lastIndexOf(inChar[1]);
		
		System.out.println(indexOne+ " "+ indexTwo);
		
		
		for (int i=indexTwo+1;i<str.length();i++){
			charArray[indexOne]=charArray[i];
			charArray[i]=' ';
			indexOne++;
		}
		for (int i=indexOne;i<str.length();i++){
			
			charArray[i]=' ';
			
		}
		str=String.copyValueOf(charArray);
		System.out.println(str);
		
		
	}

}
