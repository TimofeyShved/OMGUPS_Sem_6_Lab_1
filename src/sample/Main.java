package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // создаем панель
        Parent root = FXMLLoader.load(getClass().getResource("mainWin.fxml"));

        primaryStage.setTitle("Создание первого приложения. Привет, Мир!"); // заголовок формы
        primaryStage.setScene(new Scene(root, 600, 400)); // размеры формы и наша панель, в форму(окно)

        // показать форму
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}