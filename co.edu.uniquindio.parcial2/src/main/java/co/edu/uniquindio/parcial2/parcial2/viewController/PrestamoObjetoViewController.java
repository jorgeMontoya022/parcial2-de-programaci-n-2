package co.edu.uniquindio.parcial2.parcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.parcial2.controller.PrestamoObjetoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PrestamoObjetoViewController {
    PrestamoObjetoController prestamoObjetoController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnMostrarClientesMasPrestamos;

    @FXML
    private Button btnMostrarObjetoPorCodigo;

    @FXML
    private AnchorPane btnMostrarObjetosMasPrestado;

    @FXML
    private Button btnMostrarObjetosMasPrestados;

    @FXML
    private Button btnObjetosDisponibles;

    @FXML
    private Button btnObjetosNoDisponibles;

    @FXML
    private TextField txtCodigoObjeto;

    @FXML
    private TextField txtRangoObjetosMasPrestados;

    @FXML
    private TextField txtRangoClienteMasPrestamos;

    @FXML
    private TextArea txtResultadoClientesMasPrestamos;

    @FXML
    private TextArea txtResultadoEstadoObjeto;

    @FXML
    private TextArea txtResultadoObjetoPorCodigo;

    @FXML
    private TextArea txtResultadoObjetosMasPrestados;

    @FXML
    void onMostrarClientesMasPrestamos(ActionEvent event) {
        if(!txtRangoClienteMasPrestamos.getText().isEmpty()){
            String clientesConMasPrestamos = prestamoObjetoController.obtenerClientesConMasPrestamos(txtRangoClienteMasPrestamos.getText());
            txtResultadoClientesMasPrestamos.setText(clientesConMasPrestamos);
        }

    }

    @FXML
    void onMostrarObjetoPorCodigo(ActionEvent event) {
        if(!txtCodigoObjeto.getText().isEmpty()){
            String objetoPorCodigo = prestamoObjetoController.obtenerObjetoPorCodigo(txtCodigoObjeto.getText());
            txtResultadoObjetoPorCodigo.setText(objetoPorCodigo);
        }

    }

    @FXML
    void onMostrarObjetosMasPrestados(ActionEvent event) {
        if(!txtRangoObjetosMasPrestados.getText().isEmpty()){
            String objetosMasPrestados = prestamoObjetoController.obtenerObjetosPrestados(txtRangoObjetosMasPrestados.getText());
            txtResultadoObjetosMasPrestados.setText(objetosMasPrestados);
        }

    }

    @FXML
    void onObjetosDisponibles(ActionEvent event) {

    }

    @FXML
    void onObjetosNoDisponibles(ActionEvent event) {

    }

    @FXML
    void initialize() {
        prestamoObjetoController = new PrestamoObjetoController();


    }

}
