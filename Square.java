package com.sda.mihia.florian.advanced.inheritance.ex1;

public class Square extends Rectangle{
    private double length;

    public Square(double length) {
        super(length, length);
        this.length = length;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length
                +
                '}'+ super.toString() ;
    }
}
