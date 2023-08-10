package com.incubyte;

import static org.junit.Assert.*;
import com.incubyte.*;
import org.junit.Test;

public class LunarCraftTest {

	@Test
	public void testCalculateCoordinateForForwardFromNorthDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"N");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 1);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForForwardFromSouthDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"S");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 1);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForForwardFromEastDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"E");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 1);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForForwardFromWestDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"W");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 1);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForForwardFromUpDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"U");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 1);
	}
	
	@Test
	public void testCalculateCoordinateForForwardFromDownDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"D");
		coordinate = LunarCraft.calculateCoordinate("f", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 1);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromNorthDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"N");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == -1);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromSouthDirection() {
		Coordinate coordinate = new Coordinate(1,1,1,"S");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == 1);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 1);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromEastDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"E");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == -1);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromWestDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"W");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == -1);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromUpDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"U");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == -1);
	}
	
	@Test
	public void testCalculateCoordinateForBackwardFromDownDirection() {
		Coordinate coordinate = new Coordinate(0,0,0,"D");
		coordinate = LunarCraft.calculateCoordinate("b", coordinate);
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == -1);
	}


}
