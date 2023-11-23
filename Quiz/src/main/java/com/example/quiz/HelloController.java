package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resource) {

    }

    @FXML
    private Button changeBtn10;

    public void changeScene() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn10.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane;

    public void loadPage() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view.fxml"));
            pane.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button popBtn;
    @FXML
    private Button closebtn;
    @FXML
    private Label label;
    private Stage pop;

    public void popup() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //####################################################################메인메뉴
    @FXML
    private Button changeBtn1;

    public void changeScene1() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn1.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane1;

    public void loadPage1() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            pane1.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup1() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close1() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }


//##############################################메인메뉴


    @FXML
    private Button changeBtn2;

    public void changeScene2() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view2.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn2.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane2;

    public void loadPage2() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view2.fxml"));
            pane2.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup2() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view2.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close2() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //#########################################
    @FXML
    private Button changeBtn3;

    public void changeScene3() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view5.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn4.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane3;

    public void loadPage3() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view5.fxml"));
            pane3.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup3() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view5.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close3() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

//###############################################

    @FXML
    private Button changeBtn5;

    public void changeScene5() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view6.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn4.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane5;

    public void loadPage5() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view6.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup5() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view6.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close5() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //################################
    @FXML
    private Button changeBtn4;

    public void changeScene4() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view7.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn4.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane4;

    public void loadPage4() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view7.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup4() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view7.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close4() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //-------------------------------------------------------------------------
    @FXML
    private Button changeBtn6;

    public void changeScene6() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view8.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn6.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane6;

    public void loadPage6() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view8.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup6() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view8.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close6() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //-----------------------------------------------------------------------------
    @FXML
    private Button changeBtn7;

    public void changeScene7() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view9.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn7.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane7;

    public void loadPage7() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view9.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup7() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view9.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close7() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //----------------------------------------------------------------------
    @FXML
    private Button changeBtn8;

    public void changeScene8() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view10.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn8.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane8;

    public void loadPage8() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view10.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup8() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view10.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close8() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //-------------------------------------------------------------------------------------
    @FXML
    private Button changeBtn9;

    public void changeScene9() {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("sub-view11.fxml"));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeBtn9.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private BorderPane pane9;

    public void loadPage9() {
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view11.fxml"));
            pane4.setCenter(nextScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void popup9() {
        Stage mainStage = (Stage) popBtn.getScene().getWindow();
        pop = new Stage(StageStyle.DECORATED);
        pop.initModality(Modality.APPLICATION_MODAL);
        pop.initOwner(mainStage);
        try {
            Parent nextScene = FXMLLoader.load(getClass().getResource("sub-view11.fxml"));
            Scene scene = new Scene(nextScene);
            pop.setScene(scene);
            pop.setTitle("팝업 띄우기");
            pop.setResizable(false);
            pop.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close9() {
        pop = (Stage) closebtn.getScene().getWindow();
        pop.close();
    }

    //퀴즈 ________________________________________________________________________________________________________
//------------------------------------------------/
    @FXML
    private TextField quiz;

    @FXML
    private BorderPane Pane;

    @FXML
    public void quiz(ActionEvent event) {

        String a = quiz.getText();

        String result = a.replaceAll(" ", "");

        if (result.equals("조스로보기때문") || result.equals("조스로봐서") || result.equals("조스로보기때문에") || result.equals("조스로보니까")
                || result.equals("조스로보여서") || result.equals("죠스로보여서") || result.equals("죠스로봐서") || result.equals("죠스로보기때문에")
                || result.equals("죠스로보니까")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view3.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /*---------------------------------------------*/


    @FXML
    private TextField quiz1;

    @FXML
    private BorderPane Pane1;

    @FXML
    public void quiz1(ActionEvent event) {

        String a = quiz1.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("더워") || result.equals("the war") || result.equals("THE WAR")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view4.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz1.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane1.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-----------------------------------------------//
    @FXML
    private TextField quiz2;

    @FXML
    private BorderPane Pane2;

    @FXML
    public void quiz2(ActionEvent event) {

        String a = quiz2.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("아마존") || result.equals("아마 존?")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view5.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz2.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane2.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //---------------------------------------------

    @FXML
    private TextField quiz3;

    @FXML
    private BorderPane Pane3;

    @FXML
    public void quiz3(ActionEvent event) {

        String a = quiz3.getText();


        String result = a.replaceAll(" ", "");

        if (result.equals("이별") || a.equals("작별") || a.equals("결별") || a.equals("생이별")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view6.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz3.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane3.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //---------------------------------------------
    @FXML
    private TextField quiz4;

    @FXML
    private BorderPane Pane4;

    @FXML
    public void quiz4(ActionEvent event) {

        String a = quiz4.getText();
        String result = a.replaceAll(" ", "");
        if (result.equals("계집")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view7.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz4.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane4.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //------------------------------------------------------------
    @FXML
    private TextField quiz5;

    @FXML
    private BorderPane Pane5;

    @FXML
    public void quiz5(ActionEvent event) {

        String a = quiz5.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("문방구")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view8.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz5.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane5.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-------------------------------------------------
    @FXML
    private TextField quiz6;

    @FXML
    private BorderPane Pane6;

    @FXML
    public void quiz6(ActionEvent event) {

        String a = quiz6.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("허수")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view9.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz6.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane6.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //----------------------------------
    @FXML
    private TextField quiz7;

    @FXML
    private BorderPane Pane7;

    @FXML
    public void quiz7(ActionEvent event) {

        String a = quiz7.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("치과")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view10.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz7.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane7.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-------------------------------------------------------
    @FXML
    private TextField quiz8;

    @FXML
    private BorderPane Pane8;

    @FXML
    public void quiz8(ActionEvent event) {

        String a = quiz8.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("배나온카리나") || result.equals("배리나") || result.equals("베리나")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view11.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz8.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane8.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //--------------------------------------------------
    @FXML
    private TextField quizz;

    @FXML
    private BorderPane Panez;

    @FXML
    public void quizz(ActionEvent event) {

        String a = quizz.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("청소년")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view13.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quizz.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Panez.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //--------------------------------------------
    @FXML
    private TextField quiz9;

    @FXML
    private BorderPane Pane9;

    @FXML
    public void quiz9(ActionEvent event) {

        String a = quiz9.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("옥신각신")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view14.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz9.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane9.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-----------------------------------------
    @FXML
    private TextField quiz10;

    @FXML
    private BorderPane Pane10;

    @FXML
    public void quiz10(ActionEvent event) {

        String a = quiz10.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("안데스산맥")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view15.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz10.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane10.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //--------------------------------------------------------------

    @FXML
    private TextField quiz12;

    @FXML
    private BorderPane Pane12;

    @FXML
    public void quiz12(ActionEvent event) {

        String a = quiz12.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("참새")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-view16.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz12.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane12.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //-------------------------------------
    @FXML
    private TextField quiz13;

    @FXML
    private BorderPane Pane13;

    @FXML
    public void quiz13(ActionEvent event) {

        String a = quiz13.getText();
        String result = a.replaceAll(" ", "");

        if (result.equals("산타패") || result.equals("산타페") || result.equalsIgnoreCase("santafe")) {

            try {
                Parent nextScene
                        = FXMLLoader.load(getClass().getResource("sub-viewfinish1.fxml"));
                Scene scene = new Scene(nextScene);
                Stage primaryStage = (Stage) quiz13.getScene().getWindow();
                primaryStage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                Parent scene
                        = FXMLLoader.load(getClass().getResource("Pane-is.fxml"));
                Pane13.setCenter(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



