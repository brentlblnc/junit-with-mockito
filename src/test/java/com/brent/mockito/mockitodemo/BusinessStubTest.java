package com.brent.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessStubTest {

	@Test
	public void testFindGreatestFromData() {
		BusinessImpl businessImpl = new BusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatestFromData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] { 24, 6, 15 };
	}
	
}
