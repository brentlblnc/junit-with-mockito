package com.brent.mockito.mockitodemo;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

import org.mockito.Mockito;

public class ListTest {

	@Test
	public void testMultipleReturns() {
		List listMock = mock(List.class);
		// When size() method is called second time, return 15
		when(listMock.size()).thenReturn(10).thenReturn(15);
		assertEquals(10, listMock.size());
		assertEquals(15, listMock.size());
	}

	@Test
	public void testGet() {
		List listMock = mock(List.class);
		// 0th index should return "Test string"
		when(listMock.get(0)).thenReturn("Test string");
		assertEquals("Test string", listMock.get(0));
		assertEquals(null, listMock.get(5));
	}
	
	@Test
	public void testGetAnyParameter() {
		List listMock = mock(List.class);
		// Mockito.anyInt() => list at any index should return "Test string"
		when(listMock.get(Mockito.anyInt())).thenReturn("Test string");
		assertEquals("Test string", listMock.get(0));
		assertEquals("Test string", listMock.get(5));
	}
}
