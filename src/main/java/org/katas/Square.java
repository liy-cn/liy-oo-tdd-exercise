package org.katas;

/**
 * Created by liyue on 2018/1/12
 */
public class Square implements Shape{
  private int width;

  public Square(int width) {
    this.width = width;
  }

  public double calcArea() {
    return width * width;
  }

//  最早做的时候的实现
//  public static int calcArea(int weight) {
//    return weight* weight;
//  }

//  第二版重构时用的方法
//  public double calcArea(ShapeParam shapeParam) {
//    if (shapeParam != null) {
//      int width = shapeParam.width;
//      return width * width;
//    }
//    return 0;
//  }
}
