package com.sup.practice.structural.flyweight;

import java.awt.*;

/**
 * Created by ACER on 12-02-2017.
 */
public interface MyShape {
    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color, boolean fill, String font);
}
