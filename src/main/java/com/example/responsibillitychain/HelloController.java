package com.example.responsibillitychain;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Gold;
import com.example.responsibillitychain.Models.Diamond;
import com.example.responsibillitychain.Models.Redstone;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloController implements EventHandler<KeyEvent> {
    @FXML
    private Pane mainPane;
    @FXML
    private VBox mainWindow;
    @FXML
    public Label labelD;
    @FXML
    public Label labelR;
    @FXML
    public Label labelG;
    GameEngine game;

    public void initialize()
    {
        mainPane.toFront();
        mainWindow.setOnKeyPressed(this::handle);
        game = new GameEngine(mainPane, labelD, labelR, labelG);
        game.objects.add(new Redstone(8,8));
        game.objects.add(new Redstone(5,3));
        game.objects.add(new Redstone(8,0));
        game.objects.add(new Redstone(0,1));
        game.objects.add(new Gold(7,1));
        game.objects.add(new Gold(5,6));
        game.objects.add(new Gold(1,4));
        game.objects.add(new Diamond(10,1));
        game.objects.add(new Diamond(5,7));

        game.GameMove(mainPane, labelD, labelR, labelG);
    }
    @Override
    public void handle(KeyEvent e) {
        if (e.getCode() == KeyCode.W)
            game.PlayerMove(0, -1);
        if (e.getCode() == KeyCode.A)
            game.PlayerMove(-1, 0);
        if (e.getCode() == KeyCode.S)
            game.PlayerMove(0, 1);
        if (e.getCode() == KeyCode.D)
            game.PlayerMove(1, 0);

        game.GameMove(mainPane, labelD, labelR, labelG);
    }
}