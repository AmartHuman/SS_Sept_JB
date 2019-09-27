package com.ss.linetest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.*;

import com.ss.junittest.Line;

public class LineTest {
	
	Line line = new Line(0.0002,0.0002,0.0006,0.0005);
	Line line2 = new Line(0.0003,0.0003,0.0001,0.006);
	
	
	@Test(expected = ArithmeticException.class)
	public void testGetSlope() {
	  line.getSlope();
	}
	
	
	@Test
	public void testGetDistance() {
		line.getDistance();
	}
	
	@Test
	public void testParallelTo() {
		line.parallelTo(line2);
	}
}
