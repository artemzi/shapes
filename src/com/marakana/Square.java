package com.marakana;

/**
 * Created by azinoviev on 25.11.13.
 */
public class Square extends Rectangle {

	@Override
    public void setWidth(int width) {
		setSide(width);
    }
    
	@Override
    public void setHeight(int height) {
		setSide(height);
    }
	
	private void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
	}

    public Square(int side) {
        super(side, side);
    }
}
