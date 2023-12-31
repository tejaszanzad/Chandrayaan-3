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
	

	@Test
	public void testGetNewCoordinatePositionFromNorthToRight() {
		Coordinate coordinate = new Coordinate(0,0,0,"N");
		String[] commmands = {"r"};
		coordinate = LunarCraft.getNewCoordinatePosition(commmands, coordinate);
		 assertTrue(coordinate.direction.equalsIgnoreCase("E"));
	}
	
	@Test
	public void testGetNewCoordinatePositionFromWestToRight() {
		Coordinate coordinate = new Coordinate(0,0,0,"W");
		String[] commmands = {"l"};
		coordinate = LunarCraft.getNewCoordinatePosition(commmands, coordinate);
		 assertTrue(coordinate.direction.equalsIgnoreCase("S"));
	}
	
	@Test
	public void testGetNewCoordinatePositionForSetOfCommands1() {
		Coordinate coordinate = new Coordinate(0,0,0,"N");
		String[] commmands = {"f", "r", "f"};
		coordinate = LunarCraft.getNewCoordinatePosition(commmands, coordinate);
		 assertTrue(coordinate.direction.equalsIgnoreCase("E"));
		 assertTrue(coordinate.x == 1);
		 assertTrue(coordinate.y == 1);
		 assertTrue(coordinate.z == 0);
	}
	
	@Test
	public void testGetNewCoordinatePositionForSetOfCommands2() {
		Coordinate coordinate = new Coordinate(-1,1,2,"W");
		String[] commmands = {"f", "r", "b","r"};
		coordinate = LunarCraft.getNewCoordinatePosition(commmands, coordinate);
		 assertTrue(coordinate.direction.equalsIgnoreCase("E"));
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 0);
		 assertTrue(coordinate.z == 2);
	}
	
	@Test
	public void testGetNewCoordinatePositionForSetOfCommands3() {
		Coordinate coordinate = new Coordinate(0,0,0,"N");
		String[] commmands = {"f", "r", "u","b","l"};
		coordinate = LunarCraft.getNewCoordinatePosition(commmands, coordinate);
		 assertTrue(coordinate.direction.equalsIgnoreCase("W"));
		 assertTrue(coordinate.x == 0);
		 assertTrue(coordinate.y == 1);
		 assertTrue(coordinate.z == -1);
	}
}
