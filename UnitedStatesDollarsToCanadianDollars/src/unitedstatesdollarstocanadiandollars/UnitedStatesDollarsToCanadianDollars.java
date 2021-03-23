/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitedstatesdollarstocanadiandollars;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 *
 * @author Zachary Hinote
 */
public class UnitedStatesDollarsToCanadianDollars extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); // Set center alignment
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5); // Set vGap to 5.5px
        
        // Place nodes in the pane
        pane.add(new Label("US Dollars"), 0, 0);
        TextField USdollarTextField = new TextField();
        USdollarTextField.setAlignment(Pos.BASELINE_RIGHT);
        
        
        pane.add(USdollarTextField, 1, 0);
        pane.add(new Label("Canadian Dollars"), 0, 1);
        TextField CanadianDollarTextField = new TextField();
        CanadianDollarTextField.setAlignment(Pos.BASELINE_RIGHT);
        
        pane.add(CanadianDollarTextField, 1, 1);
        Button btConvert = new Button("Convert");
        pane.add(btConvert, 1, 2);
        GridPane.setHalignment(btConvert, HPos.RIGHT);
        
        btConvert.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                CanadianDollarTextField.setText(String.valueOf(Double.parseDouble(USdollarTextField.getText()) * 1.5));
            }
        });
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 110);
        primaryStage.setTitle("Convert US Dollars to Canadian Dollars"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
