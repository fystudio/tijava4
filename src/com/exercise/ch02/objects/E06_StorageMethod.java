package com.exercise.ch02.objects;

public class E06_StorageMethod {
	int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06_StorageMethod sm = new E06_StorageMethod();
		System.out.println(sm.storage("dumb"));

	}

}
