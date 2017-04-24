package com.tji4exe.ch07.resuingClasses;
/**
 * 创建Frog并向上转型Amphibian，并说明方法都工作
 * **/
class Amphibian{
	
	protected void craw(){
		System.out.println("Amphibian can craw");
	};
	
	protected void jump(){
		System.out.println("Amphibian can jump");
	}
	
	public void play(Amphibian a){
		a.craw();
		a.jump();
	}
}

class Frog extends Amphibian{
	
	//Exe17
	public void craw(){
		System.out.println("Frog can craw");
	}
	
	protected void jump(){
		System.out.println("Frog can jump");
	}
	
	public void play(Amphibian a){
		a.craw();
		a.jump();
	}
}

public class Exe16 {
	public  static void main(String[] args){
		
		Frog frog = new Frog();
		Amphibian am = new Amphibian();
		am.play(frog);
		
		
	}

}
