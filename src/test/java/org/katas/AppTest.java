package org.katas;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void should() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void calc_rectangle_area(){
        Rectangle rectangle= new Rectangle(5,4);
        ShapeParam shapeParam = new ShapeParam();
        shapeParam.width = 5;
        shapeParam.height = 4;

        Assert.assertEquals(20.0,rectangle.calcArea(shapeParam), 0);
    }

    @Test
    public void calc_square_area(){
        Shape square= new Square();
        ShapeParam shapeParam = new ShapeParam();
        shapeParam.width = 5;

        Assert.assertEquals(25.0,square.calcArea(shapeParam), 0);
    }


    @Test
    public void calc_circle_area(){
        Shape circle= new Circle();
        ShapeParam shapeParam = new ShapeParam();
        shapeParam.radius = 5;

        Assert.assertEquals(78.53981633974483,circle.calcArea(shapeParam), 0);
    }




}
