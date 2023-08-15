package com.javacourse.oops2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("LG",0.15,"Blue");
		fan.switchOn();
		fan.setSpeed((byte)50);
		System.out.println(fan);
	}

}
