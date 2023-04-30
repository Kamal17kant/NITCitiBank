package com.nt.beans;

import java.time.LocalTime;

public class GetingDate {
	private LocalTime  lt;
	public void seLocalTime(LocalTime lt) {
		this.lt=lt;
	}
	public LocalTime getLocalTime() {
		return lt.now();
	}
	public static void main(String[] args) {
		System.out.println( new GetingDate().getLocalTime());
		
	}
}
