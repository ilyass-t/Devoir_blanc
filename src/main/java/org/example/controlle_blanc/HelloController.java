package org.example.controlle_blanc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;


    @FXML
    protected void onHelloButtonClick() {
        MembreDaoImpl membreDao = new MembreDaoImpl();
        Membre membre=new Membre(nom.getText(),prenom.getText(),email.getText(),phone.getText());
        membreDao.inserer(membre);



    }
}