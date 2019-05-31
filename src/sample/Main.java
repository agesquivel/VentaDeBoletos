package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.OperacionesClientes;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        DBManager accesoBD = new DBManager();

        OperacionesClientes opCliente = new OperacionesClientes(accesoBD.getConnection());

        Cliente regCliente = opCliente.getCliente(14);

        System.out.println("Nuevo cliente: " + regCliente);

       // opCliente.deleteCliente(12);

       // opCliente.getCliente(12);

        opCliente.insertCliente("Jorge", "Estrada", "Lázaro Cárdenas 123");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
