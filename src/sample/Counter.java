package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.ModelDevices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Counter implements Initializable {

    public GridPane powerToolsGridPane;
    ModelDevices model;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new ModelDevices();
        generateTable(powerToolsGridPane);
    }

    public void generateTable(GridPane gridPane) {
        gridPane.setGridLinesVisible(true);
        gridPane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 5; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / 5);
            colConst.setHalignment(HPos.CENTER);
            gridPane.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < model.getSize() + 1; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / model.getSize());
            rowConst.setValignment(VPos.CENTER);
            gridPane.getRowConstraints().add(rowConst);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < model.getSize() + 1; j++) {
                if (i == 0) {
                    gridPane.add(new Label(model.deviceArrayList.get(j).getDeviceName()), i, j);
                } else {
                    gridPane.add(new TextField(), i, j);
                }
            }
        }
    }

    public Float ans11, ans12, ans13, ans14, ans15, ans16, ans17, ans18, ans19, ans110, ans111, ans112, ans113, ans114, ans115, ans116, ans117, ans118, ans119, ans120;

    public Button save;
    @FXML
    private TextField v6;

    @FXML
    private TextField v7;

    @FXML
    private TextField v8;

    @FXML
    private TextField v9;

    @FXML
    private TextField v10;

    @FXML
    private TextField v12;

    @FXML
    private TextField v11;

    @FXML
    private TextField v14;

    @FXML
    private TextField v13;

    @FXML
    private TextField v16;

    @FXML
    private TextField v15;

    @FXML
    private TextField v18;

    @FXML
    private TextField v17;

    @FXML
    private TextField v19;

    @FXML
    private TextField k1;

    @FXML
    private TextField k2;

    @FXML
    private TextField k3;

    @FXML
    private TextField k4;

    @FXML
    private TextField k5;

    @FXML
    private TextField k6;

    @FXML
    private TextField k7;

    @FXML
    private TextField k8;

    @FXML
    private TextField k9;

    @FXML
    private TextField v20;

    @FXML
    private TextField cena;

    @FXML
    private TextField oplata;

    @FXML
    private TextField k11;

    @FXML
    private TextField k10;

    @FXML
    private TextField k13;

    @FXML
    private TextField m11;

    @FXML
    private TextField m10;

    @FXML
    private TextField k12;

    @FXML
    private TextField k15;

    @FXML
    private TextField m13;

    @FXML
    private TextField k14;

    @FXML
    private TextField m12;

    @FXML
    private TextField m15;

    @FXML
    private TextField k17;

    @FXML
    private TextField m14;

    @FXML
    private TextField k16;

    @FXML
    private TextField k19;

    @FXML
    private ComboBox m17;
    ObservableList<String> m17List = FXCollections.observableArrayList("8", "11", "18", "28");

    @FXML
    private TextField k18;

    @FXML
    private TextField m16;

    @FXML
    private ComboBox m19;
    ObservableList<String> m19List = FXCollections.observableArrayList("14", "20", "32", "46");

    @FXML
    private ComboBox m18;
    ObservableList<String> m18List = FXCollections.observableArrayList("40", "60", "75", "100");

    @FXML
    private Button ok;

    @FXML
    private ComboBox m1;
    ObservableList<String> m1List = FXCollections.observableArrayList("70", "140", "200", "300");

    @FXML
    private ComboBox m2;
    ObservableList<String> m2List = FXCollections.observableArrayList("80", "90", "120", "180");

    @FXML
    private ComboBox m3;
    ObservableList<String> m3List = FXCollections.observableArrayList("22", "48", "300", "460");

    @FXML
    private ComboBox m4;
    ObservableList<String> m4List = FXCollections.observableArrayList("60", "100", "200", "300");

    @FXML
    private TextField m5;

    @FXML
    private TextField k20;

    @FXML
    private Button clear;

    @FXML
    private ComboBox m6;
    ObservableList<String> m6List = FXCollections.observableArrayList("70", "100", "145", "240", "300");

    @FXML
    private TextField m7;

    @FXML
    private TextField m20;

    @FXML
    private TextField m8;

    @FXML
    private TextField potreb;

    @FXML
    private TextField m9;

    @FXML
    private TextField v1;

    @FXML
    private TextField v2;

    @FXML
    private TextField v3;

    @FXML
    private TextField v4;

    @FXML
    private TextField v5;

    public void actionButtonPressed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (!(source instanceof Button)) {
            return;
        }

        Button clickedButton = (Button) source;

        switch (clickedButton.getId()) {
            case "ok":
                if (cena.getText().trim().isEmpty() || k1.getText().trim().isEmpty()) {
                    Dialog.showInfoDialog("Ошибка", "Заполните все поля!");
                } else {
                    Float k101 = Float.parseFloat(k1.getText());
                    Float m101 = Float.parseFloat(m1.getSelectionModel().getSelectedItem().toString());
                    Float v101 = Float.parseFloat(v1.getText());
                    ans11 = k101 * m101 * v101;
                    Float k102 = Float.parseFloat(k2.getText());
                    Float m102 = Float.parseFloat(m2.getSelectionModel().getSelectedItem().toString());
                    Float v102 = Float.parseFloat(v2.getText());
                    ans12 = k102 * m102 * v102;
                    Float k103 = Float.parseFloat(k3.getText());
                    Float m103 = Float.parseFloat(m3.getSelectionModel().getSelectedItem().toString());
                    Float v103 = Float.parseFloat(v3.getText());
                    ans13 = k103 * m103 * v103;
                    Float k104 = Float.parseFloat(k4.getText());
                    Float m104 = Float.parseFloat(m4.getSelectionModel().getSelectedItem().toString());
                    Float v104 = Float.parseFloat(v4.getText());
                    ans14 = k104 * m104 * v104;
                    Float k105 = Float.parseFloat(k5.getText());
                    Float m105 = Float.parseFloat(m5.getText());
                    Float v105 = Float.parseFloat(v5.getText());
                    ans15 = k105 * m105 * v105;
                    Float k106 = Float.parseFloat(k6.getText());
                    Float m106 = Float.parseFloat(m6.getSelectionModel().getSelectedItem().toString());
                    Float v106 = Float.parseFloat(v6.getText());
                    ans16 = k106 * m106 * v106;
                    Float k107 = Float.parseFloat(k7.getText());
                    Float m107 = Float.parseFloat(m7.getText());
                    Float v107 = Float.parseFloat(v7.getText());
                    ans17 = k107 * m107 * v107;
                    Float k108 = Float.parseFloat(k8.getText());
                    Float m108 = Float.parseFloat(m8.getText());
                    Float v108 = Float.parseFloat(v8.getText());
                    ans18 = k108 * m108 * v108;
                    Float k109 = Float.parseFloat(k9.getText());
                    Float m109 = Float.parseFloat(m9.getText());
                    Float v109 = Float.parseFloat(v9.getText());
                    ans19 = k109 * m109 * v109;
                    Float k110 = Float.parseFloat(k10.getText());
                    Float m110 = Float.parseFloat(m10.getText());
                    Float v110 = Float.parseFloat(v10.getText());
                    ans110 = k110 * m110 * v110;
                    Float k111 = Float.parseFloat(k11.getText());
                    Float m111 = Float.parseFloat(m11.getText());
                    Float v111 = Float.parseFloat(v11.getText());
                    ans111 = k111 * m111 * v111;
                    Float k112 = Float.parseFloat(k12.getText());
                    Float m112 = Float.parseFloat(m12.getText());
                    Float v112 = Float.parseFloat(v12.getText());
                    ans112 = k112 * m112 * v112;
                    Float k113 = Float.parseFloat(k13.getText());
                    Float m113 = Float.parseFloat(m13.getText());
                    Float v113 = Float.parseFloat(v13.getText());
                    ans113 = k113 * m113 * v113;
                    Float k114 = Float.parseFloat(k14.getText());
                    Float m114 = Float.parseFloat(m14.getText());
                    Float v114 = Float.parseFloat(v14.getText());
                    ans114 = k114 * m114 * v114;
                    Float k115 = Float.parseFloat(k15.getText());
                    Float m115 = Float.parseFloat(m15.getText());
                    Float v115 = Float.parseFloat(v15.getText());
                    ans115 = k115 * m115 * v115;
                    Float k116 = Float.parseFloat(k16.getText());
                    Float m116 = Float.parseFloat(m16.getText());
                    Float v116 = Float.parseFloat(v16.getText());
                    ans116 = k116 * m116 * v116;
                    Float k117 = Float.parseFloat(k17.getText());
                    Float m117 = Float.parseFloat(m17.getSelectionModel().getSelectedItem().toString());
                    Float v117 = Float.parseFloat(v17.getText());
                    ans117 = k117 * m117 * v117;
                    Float k118 = Float.parseFloat(k18.getText());
                    Float m118 = Float.parseFloat(m18.getSelectionModel().getSelectedItem().toString());
                    Float v118 = Float.parseFloat(v18.getText());
                    ans118 = k118 * m118 * v118;
                    Float k119 = Float.parseFloat(k19.getText());
                    Float m119 = Float.parseFloat(m19.getSelectionModel().getSelectedItem().toString());
                    Float v119 = Float.parseFloat(v19.getText());
                    ans119 = k119 * m119 * v119;
                    Float k120 = Float.parseFloat(k20.getText());
                    Float m120 = Float.parseFloat(m20.getText());
                    Float v120 = Float.parseFloat(v20.getText());
                    ans120 = k120 * m120 * v120;
                    Float rez = ans11 + ans12 + ans13 + ans14 + ans15 + ans16 + ans17 + ans18 + ans19 + ans110 + ans111 + ans112 + ans113 + ans114 + ans115 + ans116 + ans117 + ans118 + ans119 + ans120;
                    potreb.setText(String.valueOf(rez));

                    Float cena1 = Float.parseFloat(cena.getText());
                    Float c = cena1 * rez;
                    oplata.setText(String.valueOf(c));
                }
                break;
            case "clear":
                k1.setText("0");
                k2.setText("0");
                k3.setText("0");
                k4.setText("0");
                k5.setText("0");
                k6.setText("0");
                k7.setText("0");
                k8.setText("0");
                k9.setText("0");
                k10.setText("0");
                k11.setText("0");
                k12.setText("0");
                k13.setText("0");
                k14.setText("0");
                k15.setText("0");
                k16.setText("0");
                k17.setText("0");
                k18.setText("0");
                k19.setText("0");
                k20.setText("0");
                cena.setText("");
                potreb.setText("");
                oplata.setText("");

//                for (int i = 0; i < modelDevices.deviceArrayList.size(); i++)
//                    System.out.println(modelDevices.deviceArrayList.get(i).deviceName + " " +
//                            modelDevices.deviceArrayList.get(i).devicePower);


                break;
        }
    }

    @FXML
    private void initialize() {
        m1.setValue("140");
        m1.setItems(m1List);
        m2.setValue("90");
        m2.setItems(m2List);
        m3.setValue("48");
        m3.setItems(m3List);
        m4.setValue("100");
        m4.setItems(m4List);
        m6.setValue("145");
        m6.setItems(m6List);
        m17.setValue("8");
        m17.setItems(m17List);
        m18.setValue("40");
        m18.setItems(m18List);
        m19.setValue("14");
        m19.setItems(m19List);
    }

    public void handle(ActionEvent event) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("result.txt"));
        bf.write("Компьютер" + " " + k1 + " " + m1 + " " + v1 + " " +
                "Ноутбук" + " " + k2 + " " + m2 + " " + v2 + " " +
                "Принтер" + " " + k3 + " " + m3 + " " + v3 + " " +
                "Телевизор" + " " + k4 + " " + m4 + " " + v4 + " " +
                "Прочие приборы" + " " + k5 + " " + m5 + " " + v5 + " " +
                "Холодильник" + " " + k6 + " " + m6 + " " + v6 + " " +
                "Микроволновка" + " " + k7 + " " + m7 + " " + v7 + " " +
                "Чайник" + " " + k8 + " " + m8 + " " + v8 + " " +
                "Утюг" + " " + k9 + " " + m9 + " " + v9 + " " +
                "Прочие приборы" + " " + k10 + " " + m10 + " " + v10 + " " +
                "Дрель" + " " + k11 + " " + m11 + " " + v11 + " " +
                "Болгарка" + " " + k12 + " " + m12 + " " + v12 + " " +
                "Газонокосилка" + " " + k13 + " " + m13 + " " + v13 + " " +
                "Электропила" + " " + k14 + " " + m14 + " " + v14 + " " +
                "Прочие приборы" + " " + k15 + " " + m15 + " " + v15 + " " +
                "Галогенные лампы" + " " + k16 + " " + m16 + " " + v16 + " " +
                "Светодиодные лампочки" + " " + k17 + " " + m17 + " " + v17 + " " +
                "Лампы накаливания" + " " + k18 + " " + m18 + " " + v18 + " " +
                "Люминесцентные лампочки" + " " + k19 + " " + m19 + " " + v19 + " " +
                "Прочие наборы освещения" + " " + k20 + " " + m20 + " " + v20);
        bf.newLine();
        bf.write("Цена за кВТ= " + cena.getText());
        bf.newLine();
        bf.write("Общее потребление= " + potreb.getText());
        bf.newLine();
        bf.write("Итого к оплате= " + oplata.getText());

        bf.close();
    }
}
