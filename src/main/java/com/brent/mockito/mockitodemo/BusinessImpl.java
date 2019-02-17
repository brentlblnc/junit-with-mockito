package com.brent.mockito.mockitodemo;

public class BusinessImpl {
	// Data service is dependency of business service
	private DataService svc;
	
	public BusinessImpl(DataService svc) {
		super();
		this.svc = svc;
	}
	
	public int findGreatestFromData() {
		int[] data = svc.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}


