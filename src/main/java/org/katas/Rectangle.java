package org.katas;

/**
 * Created by liyue on 2018/1/12
 */
public class Rectangle implements Shape {


  private final int width;
  private final int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public double calcArea(ShapeParam shapeParam) {
    if (shapeParam != null) {
      int width = shapeParam.width;
      int height = shapeParam.height;
      return width * height;
    }
    return 0;
  }
}
