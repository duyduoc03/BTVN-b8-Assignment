package sesstion7.Assignment;

import javafx.Main;
import sesstion7.Assignment.Product;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class listcontroller implements Initializable {
    public TableView<Product> tbView;
    public TableColumn<Product,String> cTen;
    public TableColumn<Product,Double>  cGia;
    public TableColumn<Product,String>  cDonVi;
    public TableColumn<Product,Integer>  cSoLuong;
    public TableColumn<Product, Button>  cEdit;
    public TableColumn<Product, Button>  cDelete;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cTen.setCellValueFactory(new PropertyValueFactory<Product,String>("Ten"));
        cGia.setCellValueFactory(new PropertyValueFactory<Product,Double>("Gia"));
        cDonVi.setCellValueFactory(new PropertyValueFactory<Product,String>("DonVi"));
        cSoLuong.setCellValueFactory(new PropertyValueFactory<Product,Integer>("SoLuong"));
        cEdit.setCellValueFactory(new PropertyValueFactory<Product,Button>("edit"));
        cDelete.setCellValueFactory(new PropertyValueFactory<Product,Button>("delete"));
        tbView.setItems(sesstion7.Assignment.Main.ProductList);
    }
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        sesstion7.Assignment.Main.rootStage.setScene(new Scene(root,800,600));
    }
}
