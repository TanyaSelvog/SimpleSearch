package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.SoccerPlayer;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {
    public TableColumn playerName;
    public TableColumn playerPosition;
    public TableColumn playerNum;
    public TableColumn playerNat;
    public TableView soundersTable;
    public Button submitButton;
    public Label teamLabel;
    public TextField resultsField;
    public Label resultsLBL;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        playerName.setCellValueFactory(new PropertyValueFactory<>("name"));
        playerPosition.setCellValueFactory(new PropertyValueFactory<>("position"));
        playerNum.setCellValueFactory(new PropertyValueFactory<>("jersey"));
        playerNat.setCellValueFactory(new PropertyValueFactory<>("nation"));

        ObservableList<SoccerPlayer> seattleSounders = SoccerPlayer.getAllPlayers();
        soundersTable.setItems(seattleSounders);
        resultsLBL.setText(Integer.toString(seattleSounders.size()) + " players returned.");

    }

    public void onSearchBtn(ActionEvent actionEvent){
        String q = resultsField.getText();

        //Search query by player name
        ObservableList<SoccerPlayer> seattleSounders = searchByPlayerName(q);


        soundersTable.setItems(seattleSounders);
        resultsLBL.setText(Integer.toString(seattleSounders.size()) + " players returned.");
        resultsField.setText("");
    }


    private ObservableList<SoccerPlayer> searchByPlayerName(String partialName){
        ObservableList<SoccerPlayer> namedPlayers = FXCollections.observableArrayList();

        ObservableList<SoccerPlayer> seattleSounders = SoccerPlayer.getAllPlayers();

        for(SoccerPlayer footballer : seattleSounders){
            if(footballer.getName().contains(partialName)){
                namedPlayers.add(footballer);
            }
        }

        return namedPlayers;

    }



}
