package sesstion7.Assignment;

import javafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField Ten;
    public TextField Gia;
    public TextField DonVi;
    public TextField SoLuong;
    public Text result;
    public Text errMsg;
    public void submit(){
        try {
            Product l = new Product(Ten.getText(),Double.parseDouble(Gia.getText()),DonVi.getText(),Integer.parseInt(SoLuong.getText()));
            result.setText(result.getText()+l.toString());
            sesstion7.Assignment.Main.ProductList.add(l);

            renderList();
            errMsg.setVisible(false);
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            sesstion7.Assignment.Main.rootStage.setScene(new Scene(root,650,480));
        }
        catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }
    }
    public void renderList(){
        Ten.setText("");
        Gia.setText("");
        DonVi.setText("");;
        SoLuong.setText("");
    }
}
