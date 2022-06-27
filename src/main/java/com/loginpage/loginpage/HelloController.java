package com.loginpage.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private AnchorPane pane;
    @FXML
    private Label label1;
    @FXML
    private ImageView user1;
    @FXML
    private TextField Field2;
    @FXML
    private ImageView PP1;
    @FXML
    private PasswordField pass1;
    @FXML
    private CheckBox Check;
    @FXML
    private Button login;
    @FXML
    private Button forgot;
    @FXML
    private Line line;
    @FXML
    private Label label2;
    @FXML
    private ImageView user2;
    @FXML
    private TextField Field;
    @FXML
    private ImageView mail;
    @FXML
    private TextField email;
    @FXML
    private ImageView PP2;
    @FXML
    private PasswordField pass2;
    @FXML
    private PasswordField pass3;
    @FXML
    private Label dob;
    @FXML
    private DatePicker datepicker;
    @FXML
    private Label gender;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private RadioButton male;
    @FXML
    private RadioButton female;
    @FXML
    private Button terms;
    @FXML
    private CheckBox conditions;
    @FXML
    private Button sign;


    private Stage stage;
    private Scene scene;
    private Parent root;


    public void userLogin(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource ("afterLogin.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
    public void userLogout(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
