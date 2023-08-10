package com.incubyte;
import java.util.HashMap;
import java.util.Map;

import com.incubyte.Coordinate;


public class LunarCraft {
	
	
	public static Coordinate calculateCoordinate(String command, Coordinate coordinate) {

		if (command.equalsIgnoreCase("f") ||  command.equalsIgnoreCase("b")){
			String direction = coordinate.direction;
			
			int changedCoordinateBy  = command.equalsIgnoreCase("f") ? 1:-1;
	
			if (direction.equalsIgnoreCase("n") || direction.equalsIgnoreCase("s")) {
	
			    coordinate.y  = coordinate.y + (changedCoordinateBy);
	
			} else if (direction.equalsIgnoreCase("e") || direction.equalsIgnoreCase("w")) {
	
			    coordinate.x  = coordinate.x + (changedCoordinateBy);
	
			} else if (direction.equalsIgnoreCase("u") || direction.equalsIgnoreCase("d")) {
	
			    coordinate.z  = coordinate.z + (changedCoordinateBy);
	
			} 
		  }

		 return coordinate;
    }
	
	public static Coordinate getNewCoordinatePosition (String[] commandArr,Coordinate coordinate) {

		return coordinate;
	}  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
