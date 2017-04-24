package com.tji4exe.ch09.interfaces;

abstract class BaseExe03 {
	public abstract void print();
}

public class Exe03 extends BaseExe03 {
	private int i = 99;

	public Exe03() {
		print();
	}

	@Override
	public void print() {
		System.out.println("i:" + i);

	}
	
	public static void main(String[] args){
		
		new Exe03();
	}
	

}
