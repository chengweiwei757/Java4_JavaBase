package com.ddb.javacore.operator;

import java.io.PrintStream;

public class DataTypeDemo {

	public static void main(String[] args) {
		PrintStream prt = System.out;
		//基础运算符	+-/*
		int int1 = 99;
		int int2 = 25;
		prt.println("int1 + int2 = " + (int1 + int2));
		prt.println("int1 - int2 = " + (int1 - int2));
		prt.println("int1 * int2 = " + (int1 * int2));
		prt.println("int1 / int2 = " + (int1 / int2));
		prt.println("int1 % int2 = " + (int1 % int2));
		
		//int1 +=int2;
		prt.println("--------------------------------");
		prt.println("int1 +=int2 :" + (int1 +=int2));
		prt.println("int1 -=int2 :" + (int1 -=int2));
		prt.println("int1 *=int2 :" + (int1 *=int2));
		prt.println("int1 /=int2 :" + (int1 /=int2));
		prt.println("int1 %=int2 :" + (int1 %=int2));
		
		/*
		// 关系运算符
		int a = 50;
		int b = 60;
		prt.println("a = " + a);
		prt.println("b = " + b);
		prt.println("a > b : " + (a > b));
		prt.println("a >= b : " + (a >= b));
		prt.println("a == b : " + (a == b));
		prt.println("a != b : " + (a != b));
		prt.println("a < b : " + (a < b));
		prt.println("a <= b : " + (a <= b));

		// 逻辑运算
		boolean bn1 = true;
		boolean bn2 = false;
		prt.println("bn1 && bn2 :" + (bn1 && bn2));
		prt.println("bn1 || bn2 :" + (bn1 || bn2));
		prt.println("!bn1 :" + !bn1);
		prt.println("(1<2) && (4<5) :" + ((1 < 2) && (4 < 5)));
		prt.println("(1<2) || (4<5) :" + ((1 < 2) || (4 < 5)));

		// 三目运算符
		int i = 5, j = 9;
		int result = i > j ? i : j; // ？号前面的表达式为真取i，否则取j
		prt.println("result ： " + result);

		
		//String
		String address1 = "Anhui";
		String address2 = "Hefei";
		int code = 5;
		String ret = address1 +" "+ address2 +" "+ code+" 号";
		prt.println("ret :" + ret);
		
		//类型转换
		int num = 1000000000;
		short shot;
		shot = (short) num;
		prt.println("shot : " + shot);
				
		//递增递减运算符
		int age = 6;
		prt.println("age = " + age);
		age++;	//先使用后++
		prt.println("age++: " + age);
		age--;
		prt.println("age--: " + age);
		++age;	//先自增再使用
		prt.println("++age: " + age);		
		--age;
		prt.println("--age: " + age);		*/
		
	}

}
