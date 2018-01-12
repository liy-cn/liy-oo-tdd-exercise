package org.katas;

/**
 * Created by liyue on 2018/1/12
 */
public class Circle implements Shape{
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double calcArea() {
    return Math.PI * (radius * radius);
  }

//  第二版重构时的实现
//  public double calcArea(ShapeParam shapeParam) {
//    if (shapeParam != null) {
//      int radius = shapeParam.radius;
//      double result = Math.PI * (radius * radius);
//      return result;
//    }
//    return 0;
//  }
}
