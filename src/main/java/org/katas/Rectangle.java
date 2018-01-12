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

  public double calcArea() {
    int width = this.width;
    int height = this.height;
    return width * height;
  }
}
