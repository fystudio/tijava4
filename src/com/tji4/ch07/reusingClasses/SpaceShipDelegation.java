package com.tji4.ch07.reusingClasses;

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	// Delegation method
	void up(int velocity) {
		controls.up(velocity);
	}

	void down(int velocity) {
		controls.down(velocity);
	}

	void left(int velocity) {
		controls.left(velocity);
	}

	void right(int velocity) {
		controls.right(velocity);
	}

	void forward(int velocity) {
		controls.forward(velocity);
	}

	void back(int velocity) {
		controls.back(velocity);
	}

	void turboBoost() {
		controls.turboBoost();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpaceShipDelegation protector = new SpaceShipDelegation("NESA Protector");
		protector.forward(100);
	}

}
