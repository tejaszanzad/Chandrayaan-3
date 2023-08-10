package com.incubyte;

import java.util.HashMap;
import java.util.Map;

public final class DirectionHelper {
	public static final Map directionMapping = new HashMap();
	static{
		directionMapping.put("N-R", "E");
		directionMapping.put("N-L", "W");
		directionMapping.put("E-R", "S");
		directionMapping.put("E-L", "N");
		directionMapping.put("S-R", "W");
		directionMapping.put("S-L", "E");
		directionMapping.put("W-R", "N");
		directionMapping.put("W-L", "S");
	}
}
