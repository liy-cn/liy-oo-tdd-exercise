package org.katas;

/**
 * Created by liyue on 2018/1/12
 */
public class Circle implements Shape{
  public double calcArea(ShapeParam shapeParam) {
    if (shapeParam != null) {
      int radius = shapeParam.radius;
      double result = Math.PI * (radius * radius);
      return result;
    }
    return 0;
  }
}
