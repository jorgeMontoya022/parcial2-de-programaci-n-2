package co.edu.uniquindio.parcial2.parcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.parcial2.controller.AdministracionController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdministracionViewController {
    AdministracionController administracionController;

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
        mostrarClientesMasPrestamos();
    }

    @FXML
    void onMostrarObjetoPorCodigo(ActionEvent event) {
        mostrarObjetoPorCodigo();
    }

    @FXML
    void onMostrarObjetosMasPrestados(ActionEvent event) {
        mostrarObjetosMasPrestado();
    }

    @FXML
    void onObjetosDisponibles(ActionEvent event) {
        mostrarObjetosDisponibles();
    }

    @FXML
    void onObjetosNoDisponibles(ActionEvent event) {
        mostrarObjetosNoDisponibles();
    }

    @FXML
    void initialize() {
        administracionController = new AdministracionController();
    }

    private void mostrarClientesMasPrestamos() {
        if(!txtRangoClienteMasPrestamos.getText().isEmpty()){
            String clientesConMasPrestamos = administracionController.obtenerClientesConMasPrestamos(txtRangoClienteMasPrestamos.getText());
            txtResultadoClientesMasPrestamos.setText(clientesConMasPrestamos);
        }
    }

    private void mostrarObjetoPorCodigo() {
        if(!txtCodigoObjeto.getText().isEmpty()){
            String objetoPorCodigo = administracionController.obtenerObjetoPorCodigo(txtCodigoObjeto.getText());
            txtResultadoObjetoPorCodigo.setText(objetoPorCodigo);
        }
    }

    private void mostrarObjetosMasPrestado() {
        if(!txtRangoObjetosMasPrestados.getText().isEmpty()){
            String objetosMasPrestados = administracionController.obtenerObjetosPrestados(txtRangoObjetosMasPrestados.getText());
            txtResultadoObjetosMasPrestados.setText(objetosMasPrestados);
        }
    }

    private void mostrarObjetosDisponibles() {
        //codigo para mostrar objetos disponibles Jorge
    }

    private void mostrarObjetosNoDisponibles() {
        //codigo para mostrar objetos no disponibles Jorge
    }
}
