package com.sda.mihia.florian.advanced.inheritance.ex1;

public class Main {
    /**
     *
     Create a Shape class.
     - Add fields, create constructor, getters and setters.
     - Create classes Rectangle and Circle. Both of them should inherit class Shape.
     - Which fields and methods are common?
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape(5, 7);
        shapes[1] = new Rectangle(10, 15);
        shapes[2] = new Circle(3);
        shapes[3] = new Square(21);

        Shape shapeWithMaxArea = shapes[0];
        for(Shape currentShape : shapes){
            if(currentShape.getArea() > shapeWithMaxArea.getArea()){
                shapeWithMaxArea = currentShape;
            }
        }

        System.out.println(shapeWithMaxArea.toString());


    }
}
