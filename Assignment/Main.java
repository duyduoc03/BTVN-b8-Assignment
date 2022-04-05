package sesstion7.Assignment;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static ObservableList<Product> ProductList = FXCollections.observableArrayList();
    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("Quản Lý Danh Sách Sản Phẩm");
        primaryStage.setScene(new Scene(root, 650, 480));
        primaryStage.show();
    }
    public static void main(String[] args) {
        ProductList.add(new Product("dép lào",20.000,"vnđ",3));
        ProductList.add(new Product("xúc xích",12.000,"vnđ",5));
        launch(args);
    }
}
