import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by mario on 30/10/2016.
 */
public class ApplicationStarter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPane = new ApplicationUI();
        rootPane.getStyleClass().add("gridpane");

        Scene myScene = new Scene(rootPane);

        myScene.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");
        myScene.getStylesheets().add("https://fonts.googleapis.com/css?family=Open+Sans");
        String stylesheet = getClass().getResource("style.css").toExternalForm();
        myScene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("Hello Kitty Calculator");
        primaryStage.setScene(myScene);
        primaryStage.show();
        primaryStage.setMinHeight(480);
        primaryStage.setMaxHeight(480);
        primaryStage.setMinWidth(320);
        primaryStage.setMaxWidth(320);
    }
}
