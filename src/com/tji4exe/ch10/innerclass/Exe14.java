package com.tji4exe.ch10.innerclass;

import static net.mindview.util.Print.print;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

public class Exe14 {

	static DangerousMonster killMonster() {
		return new DragonZilla() {
			{
				print("kill DragonZilla");
			}
		};
	}

	static Vampire killVampire() {
		return new VeryBadVampire() {
			{
				print("kill VeryBadVampire");
			}
		};
	}

	public static void main(String[] args) {
		killMonster();
		killVampire();
	}
}
