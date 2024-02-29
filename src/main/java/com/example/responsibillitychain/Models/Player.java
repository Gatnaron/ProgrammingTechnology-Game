package com.example.responsibillitychain.Models;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Player extends SceneObject{
    public Integer Redstone;
    public Integer Gold;
    public Integer Diamond;
    public Player() {
        Redstone = 0;
        Gold = 0;
        Diamond = 0;
    }
    @Override
    public Shape asObj()
    {
        Rectangle playa = new Rectangle();
        playa.setFill(Color.GREEN);
        playa.setHeight(SIZE);
        playa.setWidth(SIZE);
        playa.setX(X*SIZE);
        playa.setY(Y*SIZE);

        return playa;
    }
}
