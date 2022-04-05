package sesstion7.Assignment;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public final class Product {
    public String Ten;
    public Double Gia;
    public String DonVi;
    public Integer SoLuong;
    public Button edit;
    public Button delete;

    public Product(String Ten, Double Gia, String DonVi, Integer SoLuong){
        this.Ten = Ten;
        this.Gia = Gia;
        this.DonVi = DonVi;
        this.SoLuong = SoLuong;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
                sesstion7.Assignment.Main.rootStage.setScene(new Scene(root,800,600));
            }
            catch (Exception e){

            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            Main.ProductList.remove(this);
        });
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double gia) {
        Gia = gia;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String donVi) {
        DonVi = donVi;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public String toString(){
        String s = "\n--------------------";
        s += "\n" + getTen();
        s += "\n" + getGia();
        s += getDonVi();
        s += "\n" + getSoLuong();
        return s;
    }
}
