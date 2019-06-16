package com.course.ch07.reuseclasses;
/**
 * 加载顺序
 * 基类的static 方法
 * 基类static 方法调用
 * 导出类static 方法调用
 * 基类constructor
 * 导出类constructor
 * */
class Insect{
	private int i=9;
	protected int j;
	Insect(){//4
		System.out.println("i="+i+",j="+j);
		j=39;
	}
	
	private static int x1 = printInt("static Insect.x1 initialized");//2
	static int printInt(String s){//1
		System.out.println("s");
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInt("Beetle.k initialized");//5
	public Beetle (){//6
		System.out.println("k="+k);
		System.out.println("j="+j);
	}
	private static int x2 = printInt("Beetle.x2 initialized");//3
	
	public static void main(String[] args){
		printInt("Beetle constructor");
		Beetle b = new Beetle();
	}

}
/*
s
s
s
i=9,j=0
s
k=47
j=39
 *／ 
 * 
 * *／
 */