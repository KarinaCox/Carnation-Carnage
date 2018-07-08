/**
 * Author: Isaac McClure
 * Date: Jul 8, 2018
 */
package CarnationCarnage;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//Controller class for MainMenu.FXML 
public class MainMenuController extends Application{
    // This class shows and handles input from the main menu
    @FXML
    AnchorPane mainMenuPane = new AnchorPane()
    ;
    public void initialize(){
    }

    
    
    
    @FXML
    public void newGameClicked() {
        //New game code here
    	//CarnationCarnageMain.NewGame()
    }
    
    @FXML
    public void howToPlayClicked() throws IOException{
        //Opens how to play scene
        //Load scene
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(CarnationCarnageMain.class.getResource("/CarnationCarnage/FXMLFiles/RulesPage.fxml"));        
        BorderPane menuScreen = loader.load();
        
        //show scene
        Stage primaryStage = (Stage) mainMenuPane.getScene().getWindow();
        primaryStage.setScene(new Scene(menuScreen));
    }
    
    @FXML
    public void highScoreClicked() {
        //High score code here
    }
    
    @FXML
    public void exitClicked() {
        //Exit
        System.exit(0);
    }


    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }

}
