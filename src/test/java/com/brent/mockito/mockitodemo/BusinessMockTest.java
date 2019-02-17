package com.brent.mockito.mockitodemo;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;

import org.junit.Test;

public class BusinessMockTest {

	@Test
	public void testFindGreatestFromData() {
		DataService svcMock = mock(DataService.class);
		
		//  I want svcMock.retrieveAllData() to return { 25, 15, 3} without making a stub 
		when (svcMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 3 });
		
		// pass in mock instead
		BusinessImpl businessImpl = new BusinessImpl(svcMock);
		int result = businessImpl.findGreatestFromData();
		assertEquals(25, result);
	}
	
	@Test
	public void testFindGreatestFromData_ForOneValue() {
		DataService svcMock = mock(DataService.class);
		
		// When retrieveAllData() is called, return { 25 }
		when (svcMock.retrieveAllData()).thenReturn(new int[] { 25 });
		
		// pass in mock instead
		BusinessImpl businessImpl = new BusinessImpl(svcMock);
		int result = businessImpl.findGreatestFromData();
		assertEquals(25, result);
	}

}


