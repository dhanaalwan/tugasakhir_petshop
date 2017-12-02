/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.mysql.fabric.xmlrpc.base.Data;
import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Dna
 */
public class HomeController implements Initializable {

    @FXML
    private JFXRadioButton addsatu;
    @FXML
    private JFXRadioButton addempat;
    @FXML
    private JFXRadioButton addtiga;
    @FXML
    private JFXRadioButton adddua;
    @FXML
    private JFXRadioButton addlima;
    @FXML
    private JFXRadioButton adddelapan;
    @FXML
    private JFXRadioButton addtujuh;
    @FXML
    private JFXRadioButton addenam;
    @FXML
    private JFXRadioButton addsepuluh;
    @FXML
    private JFXRadioButton addsembilan;
    @FXML
    private JFXRadioButton addsebelas;
    @FXML
    private JFXRadioButton addtigabelas;
    @FXML
    private JFXRadioButton addduabelas;
    @FXML
    private JFXButton list;
    
    @FXML
    private JFXTextField jumlah1;
    @FXML
    private JFXTextField jumlah4;
    @FXML
    private JFXTextField jumlah3;
    @FXML
    private JFXTextField jumlah2;
    @FXML
    private JFXTextField jumlah5;
    @FXML
    private JFXTextField jumlah8;
    @FXML
    private JFXTextField jumlah7;
    @FXML
    private JFXTextField jumlah6;
    @FXML
    private JFXTextField jumlah10;
    @FXML
    private JFXTextField jumlah9;
    @FXML
    private JFXTextField jumlah11;
    @FXML
    private JFXTextField jumlah13;
    @FXML
    private JFXTextField jumlah12;
    @FXML
    private Label barang1;
    @FXML
    private Label barang2;
    @FXML
    private Label barang4;
    @FXML
    private Label barang3;
    @FXML
    private Label barang5;
    @FXML
    private Label barang8;
    @FXML
    private Label barang7;
    @FXML
    private Label barang6;
    @FXML
    private Label barang10;
    @FXML
    private Label barang9;
    @FXML
    private Label barang11;
    @FXML
    private Label barang13;
    @FXML
    private Label barang12;
    @FXML
    private JFXTextArea TA;
    
    String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, hasil1, hasil2,
            hasil3,hasil4,hasil5,hasil6,hasil7,hasil8,hasil9,hasil10,hasil11,hasil12,hasil13,tampiltotalsum,nama,alamat,tanggalpesan,tanggalkirim,barang,totalbayar;
    int price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13,
        number1,number2,number3,number4,number5,number6,number7,number8,number9,number10,number11,number12,number13,
        sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9,sum10,sum11,sum12,sum13, totalsum;
    @FXML
    private JFXTextField namap;
    @FXML
    private JFXTextField alamatp;
    @FXML
    private JFXTextField tglp;
    @FXML
    private JFXButton btnkirim;
    @FXML
    private JFXTextField total;
    @FXML
    private JFXButton btnproses;
    @FXML
    private JFXTextArea TA1;
    @FXML
    private JFXTextField total1;
    @FXML
    private JFXButton btnhapus;
    @FXML
    private JFXButton btnkeluar;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }


    @FXML
    private void listbtn(ActionEvent event) {
        if(addsatu.isSelected()){
            name1 = barang1.getText();
            price1 = 50000;
            number1 =Integer.parseInt(jumlah1.getText());
            sum1 = number1*price1;
            System.out.println(name1);
            System.out.println(price1);
            System.out.println(number1);
            System.out.println(sum1);
        }
        if(adddua.isSelected()){
            name2 = barang2.getText();
            price2 = 50000;
            number2 =Integer.parseInt(jumlah2.getText());
            sum2 = number2*price2;
            System.out.println(name2);
            System.out.println(price2);
            System.out.println(number2);
            System.out.println(sum2);
        }
        if(addtiga.isSelected()){   
            name3 = barang3.getText();
            price3 = 50000;
            number3 =Integer.parseInt(jumlah3.getText());
            sum3 = number3*price3;
            System.out.println(name3);
            System.out.println(price3);
            System.out.println(number3);
            System.out.println(sum3);
           
        }
        if(addempat.isSelected()){     
            name4 = barang4.getText();
            price4 = 50000;
            number4 =Integer.parseInt(jumlah4.getText());
            sum4 = number4*price4;
            System.out.println(name4);
            System.out.println(price4);
            System.out.println(number4);
            System.out.println(sum4);
        }
        if(addlima.isSelected()){     
            name5 = barang5.getText();
            price5 = 200000;
            number5 =Integer.parseInt(jumlah5.getText());
            sum5 = number5*price5;
            System.out.println(name5);
            System.out.println(price5);
            System.out.println(number5);
            System.out.println(sum5);
        }
        if(addenam.isSelected()){     
            name6 = barang6.getText();
            price6 = 200000;
            number6 =Integer.parseInt(jumlah6.getText());
            sum6 = number6*price6;
            System.out.println(name6);
            System.out.println(price6);
            System.out.println(number6);
            System.out.println(sum6);
        }
        if(addtujuh.isSelected()){     
            name7 = barang7.getText();
            price7 = 200000;
            number7 =Integer.parseInt(jumlah7.getText());
            sum7 = number7*price7;
            System.out.println(name7);
            System.out.println(price7);
            System.out.println(number7);
            System.out.println(sum7);
        }
        if(adddelapan.isSelected()){     
            name8 = barang8.getText();
            price8 = 50000;
            number8 =Integer.parseInt(jumlah8.getText());
            sum8 = number8*price8;
            System.out.println(name8);
            System.out.println(price8);
            System.out.println(number8);
            System.out.println(sum8);
        }
        if(addsembilan.isSelected()){     
            name9 = barang9.getText();
            price9 = 50000;
            number9 =Integer.parseInt(jumlah9.getText());
            sum9 = number9*price9;
            System.out.println(name9);
            System.out.println(price9);
            System.out.println(number9);
            System.out.println(sum9);
        }
        if(addsepuluh.isSelected()){     
            name10 = barang10.getText();
            price10 = 50000;
            number10 =Integer.parseInt(jumlah10.getText());
            sum10 = number10*price10;
            System.out.println(name10);
            System.out.println(price10);
            System.out.println(number10);
            System.out.println(sum10);
        }
        if(addsebelas.isSelected()){     
            name11 = barang11.getText();
            price11 = 50000;
            number11 =Integer.parseInt(jumlah11.getText());
            sum11 = number11*price11;
            System.out.println(name11);
            System.out.println(price11);
            System.out.println(number11);
            System.out.println(sum11);
        }
        if(addduabelas.isSelected()){     
            name12 = barang12.getText();
            price12 = 50000;
            number12 =Integer.parseInt(jumlah12.getText());
            sum12 = number12*price12;
            System.out.println(name12);
            System.out.println(price12);
            System.out.println(number12);
            System.out.println(sum12);
        }
        if(addtigabelas.isSelected()){     
            name13 = barang13.getText();
            price13 = 50000;
            number13 =Integer.parseInt(jumlah13.getText());
            sum13 = number13*price13;
            System.out.println(name13);
            System.out.println(price13);
            System.out.println(number13);
            System.out.println(sum13);
        }
        hasil1=name1+" "+price1+" "+number1+" "+sum1+"\n";    
        hasil2=name2+" "+price2+" "+number2+" "+sum2+"\n";
        hasil3=name3+" "+price3+" "+number3+" "+sum3+"\n";    
        hasil4=name4+" "+price4+" "+number4+" "+sum4+"\n";
        hasil5=name5+" "+price5+" "+number5+" "+sum5+"\n";    
        hasil6=name6+" "+price6+" "+number6+" "+sum6+"\n";
        hasil7=name7+" "+price7+" "+number7+" "+sum7+"\n";    
        hasil8=name8+" "+price8+" "+number8+" "+sum8+"\n";
        hasil9=name9+" "+price9+" "+number9+" "+sum9+"\n";    
        hasil10=name10+" "+price10+" "+number10+" "+sum10+"\n";
        hasil11=name11+" "+price11+" "+number11+" "+sum11+"\n";    
        hasil12=name12+" "+price12+" "+number12+" "+sum12+"\n";
        hasil13=name13+" "+price13+" "+number13+" "+sum13+"\n";
        TA.setText(hasil1+hasil2+hasil3+hasil4+hasil5+hasil6+hasil7+hasil8+hasil9+hasil10+hasil11+hasil12+hasil13);
        
    }

    @FXML
    private void kirim(ActionEvent event) {
        nama=namap.getText();
        alamat=alamatp.getText();
        tanggalpesan=tglp.getText();
        tanggalkirim=total1.getText();
        barang=TA1.getText();
        totalbayar=total.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Package is saved");
            alert.setHeaderText(null);
            alert.setContentText("PACKAGE WITH: \nNama Pelanggan : " +nama+
                    "\nAlamat Pengiriman : "+alamat+"\nTanggal Pesan : "
                    + ""+tanggalpesan+"\nTanggal Kirim : "+tanggalkirim+
                    "\nList Barang : \n"+barang+"\nTotal Bayar : "+totalbayar+"\nTERKIRIM!\n");
            alert.showAndWait();

            System.out.println("PACKAGE WITH: \nNama Pelanggan : " +nama+
                    "\nAlamat Pengiriman : "+alamat+"\nTanggal Pesan : "
                    + ""+tanggalpesan+"\nTanggal Kirim : "+tanggalkirim+
                    "\nList Barang : \n"+barang+"\nTotal Bayar : "+totalbayar+"\nTERKIRIM!\n");
    }

    @FXML
    private void proses(ActionEvent event) {
        TA1.setText(hasil1+hasil2+hasil3+hasil4+hasil5+hasil6+hasil7+hasil8+hasil9+hasil10+hasil11+hasil12+hasil13);
        totalsum=sum1+sum2+sum3+sum4+sum5+sum6+sum7+sum8+sum9+sum10+sum11+sum12+sum13;
        tampiltotalsum=String.valueOf(totalsum);
        total.setText(tampiltotalsum);
    }

    @FXML
    private void hapus(ActionEvent event) {
        addsatu.setSelected(false);
        adddua.setSelected(false);
        addtiga.setSelected(false);
        addempat.setSelected(false);
        addlima.setSelected(false);
        addenam.setSelected(false);
        addtujuh.setSelected(false);
        adddelapan.setSelected(false);
        addsembilan.setSelected(false);
        addsepuluh.setSelected(false);
        addsebelas.setSelected(false);
        addduabelas.setSelected(false);
        addtigabelas.setSelected(false);
        jumlah1.setText("");
        jumlah2.setText("");
        jumlah3.setText("");
        jumlah4.setText("");
        jumlah5.setText("");
        jumlah6.setText("");
        jumlah7.setText("");
        jumlah8.setText("");
        jumlah9.setText("");
        jumlah10.setText("");
        jumlah11.setText("");
        jumlah12.setText("");
        jumlah13.setText("");
        TA.setText("");
        namap.setText("");
        alamatp.setText("");
        tglp.setText("");
        total1.setText("");
        TA1.setText("");
        total.setText("");
    }

    @FXML
    void keluar(ActionEvent event) {
        System.exit(0);
    }
}
