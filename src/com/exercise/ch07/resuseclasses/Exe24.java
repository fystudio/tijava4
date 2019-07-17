package com.exercise.ch07.resuseclasses;
/*
 *在Beetle.java中，从Beetle类继承产生一个具体类型的“甲壳虫”。其形式与现有类相同，跟踪并解释其输出结果 
 *s  Insect static 方法定义
 *s  Insect static 成员 
 *s Beetle static 成员
 *s Exe24 static 成员
 *初始化i,j
 *Insect constructor
 *i=9,j=0 
 *s Beetle 成员k
 *Beetle constructor 
 * k=47
 *j=39
 *s Exe24 成员 p
 *Exe24 constructor
 *p=47
 *k=47
 *
 * **/

class Insect{
	private int i=9;//7
	protected int j;
	Insect(){//6
		System.out.println("i="+i+",j="+j);
		j=39;
	}
	
	private static int x1 = printInt("static Insect.x1 initialized");//2
	static int printInt(String s){//1
		System.out.println("s");
		return 47;
	}
}
 
class Beetle extends Insect {
	protected int k = printInt("Beetle.k initialized");//8
	public Beetle (){
		System.out.println("k="+k);//9
		System.out.println("j="+j);
	}
	private static int x2 = printInt("Beetle.x2 initialized");//3
}


public class Exe24 extends Beetle{
	private int p = printInt("Exe24.p initialized");//10
	public Exe24 (){
		System.out.println("p="+p);//11
		System.out.println("k="+k);
	}
	private static int x3 = printInt("Exe24.x3 initialized");//4
	public static void main(String[] args) {
		printInt("Exe24 constructor");//5
		new Exe24();
	}

}
