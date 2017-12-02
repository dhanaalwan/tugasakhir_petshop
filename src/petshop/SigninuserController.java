/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Dna
 */
public class SigninuserController implements Initializable {

    @FXML
    private JFXTextField insertnama2;
    @FXML
    private JFXTextField insertalamat2;
    @FXML
    private JFXTextField insertid2;
    @FXML
    private JFXTextField insertpass2;
    @FXML
    private JFXButton btndaftar2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void daftar(ActionEvent event) throws IOException {
        if(insertnama2.getText().equals("")||insertnama2.getText().equals("")||insertid2.getText().equals("")||insertpass2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi data yang tertera");
        }
        else{
        try {
            String sql = "INSERT INTO pelanggan VALUES('"+insertnama2.getText()+"', '"+insertalamat2.getText()+"', '"+insertid2.getText()+"', '"+insertpass2.getText()+"')";
            
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("loginuser.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setTitle("PetShop");
            stage.show();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }
    
}
