package sample;

import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.ModelDevices;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public GridPane powerToolsGridPane;
    ModelDevices model;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new ModelDevices();
        generateTable();
    }

    public void generateTable() {
        powerToolsGridPane.setGridLinesVisible(true);
        powerToolsGridPane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 5; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / 5);
            colConst.setHalignment(HPos.CENTER);
            powerToolsGridPane.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < model.getSize() + 1; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / model.getSize());
            rowConst.setValignment(VPos.CENTER);
            powerToolsGridPane.getRowConstraints().add(rowConst);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < model.getSize() + 1; j++) {
                if (i == 0) {
                    powerToolsGridPane.add(new Label(model.deviceArrayList.get(0).getDeviceName()), i, j);
                } else {
                    powerToolsGridPane.add(new TextField(), i, j);
                }
            }
        }
    }
}
