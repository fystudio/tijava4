package com.tji4exe.ch07.resuingClasses;
/*
 * 修改Detergent 使它代理
 */

import com.tji4.ch07.reusingClasses.Detergent;

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
