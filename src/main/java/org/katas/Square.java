package org.katas;

/**
 * Created by liyue on 2018/1/12
 */
public class Square implements Shape{
  public static int calcArea(int weight) {
    return weight* weight;
  }

  public double calcArea(ShapeParam shapeParam) {
    if (shapeParam != null) {
      int width = shapeParam.width;
      return width * width;
    }
    return 0;
  }
}
