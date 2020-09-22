package org.api4.java.common.color;

import java.awt.Color;

public interface IColorMap {

	public Color get(double min, double max, double val);
}
