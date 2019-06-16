package com.exercise.ch07.resuseclasses;
/*
 * 修改Detergent 使它代理
 */

import com.course.ch07.reuseclasses.Detergent;

public class Exe11 {
	private Detergent detergent = new Detergent();
	public Exe11(){
		System.out.println("Exe11");
	}
	public void scrub(){
		detergent.scrub();
	}
	
	public void foam(){
		detergent.foam();
	}
	
	public static void main(String[] args){
		Exe11 exe11 = new Exe11();
		exe11.foam();
		exe11.scrub();
	}
}
