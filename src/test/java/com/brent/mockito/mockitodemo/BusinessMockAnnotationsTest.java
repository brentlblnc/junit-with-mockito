package com.brent.mockito.mockitodemo;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockAnnotationsTest {

	@Mock
	DataService svcMock = mock(DataService.class);
	
	@InjectMocks
	BusinessImpl businessImpl;
	
	@Test
	public void testFindGreatestFromData() {
		when (svcMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 3 });
		assertEquals(25, businessImpl.findGreatestFromData());
	}
	
	@Test
	public void testFindGreatestFromData_NoValues() {
		when (svcMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestFromData());
	}

}


