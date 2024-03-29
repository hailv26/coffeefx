/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeefx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MyPC
 */
public class HomeController implements Initializable {
    
    @FXML
    private Pane panel_main;
//    
//    @FXML
//    private GridPane panel_main;
    
    @FXML
    private void onClickLogout(ActionEvent event){
        System.out.println("Log out");
        try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                /* 
                 * if "fx:controller" is not set in fxml
                 * fxmlLoader.setController(NewWindowController);
                 */
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Login");
                stage.setScene(scene);
                stage.show();
                ((Node)(event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
    }
//    
//    @FXML
//    private void onClickHome(ActionEvent event) {
//    }
//    
    @FXML
    private void onClickOrder(ActionEvent event) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("panelorder.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form order");
    }
    
    @FXML
    private void onClickMenu(ActionEvent event) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("panelmenu.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form menu");
    }
    
    @FXML
    private void onClickEmployee(ActionEvent event) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("panelemployee.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form employee");
    }
    
    @FXML
    private void onClickCustomer(ActionEvent event) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("panelcustomer.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form customer");
    }
    
    @FXML
    private void onClickMaterial(ActionEvent event) throws IOException{
        Pane root = FXMLLoader.load(getClass().getResource("panelmaterial.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form customer");
    }
    
    @FXML
    private void onClickStorage(ActionEvent event) throws IOException{
        Pane root = FXMLLoader.load(getClass().getResource("panelstorage.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form customer");
    }
    
    @FXML
    private void onClickReport(ActionEvent event) throws IOException{
        Pane root = FXMLLoader.load(getClass().getResource("panelreport.fxml"));
        panel_main.getChildren().setAll(root);
        System.out.println("load form report");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
