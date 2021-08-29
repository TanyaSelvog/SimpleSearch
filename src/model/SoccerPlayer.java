package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class SoccerPlayer {

    private String name;
    private String position;
    private int jersey;
    private String nation;


    private static ObservableList<SoccerPlayer> seattleSounders = FXCollections.observableArrayList();

    // Constructor
    public SoccerPlayer(String name, String position, int jersey, String nation){
        this.name = name;
        this.position = position;
        this.jersey = jersey;
        this.nation = nation;
    }

    // Running a static initializer here
    static {
        init();

    }



    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public int getJersey(){
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public String getNation(){
        return nation;
    }

    public void setNation(String nation){
        this.nation = nation;
    }

    private static void init() {
        if (seattleSounders.size() == 0) {


            seattleSounders.add(new SoccerPlayer("Cristian Roldan", "MF", 7, "United States"));
            seattleSounders.add(new SoccerPlayer("Nouhou", "DF", 5, "Cameroon"));
            seattleSounders.add(new SoccerPlayer("João Paulo", "MF", 6, "Brazil"));
            seattleSounders.add(new SoccerPlayer("Alex Roldan", "DF", 13, "El Salvador"));
            seattleSounders.add(new SoccerPlayer("Raúl Ruidaz", "FW", 9, "Peru"));
            seattleSounders.add(new SoccerPlayer("Yeimar Gómez", "DF", 28, "Colombia"));
            seattleSounders.add(new SoccerPlayer("Xavier Arreaga", "DF", 3, "Ecuador"));
            seattleSounders.add(new SoccerPlayer("Jordy Delem", "MF", 8, "Martinique"));
            seattleSounders.add(new SoccerPlayer("Nicolás Lodeiro", "MF", 10, "Uruguay"));
            seattleSounders.add(new SoccerPlayer("Brad Smith", "DF", 11, "Australia"));
            seattleSounders.add(new SoccerPlayer("Fredy Montero", "FW", 12, "Colombia"));
            seattleSounders.add(new SoccerPlayer("Jordan Morris", "FW", 13, "United States"));
            seattleSounders.add(new SoccerPlayer("Will Bruin", "FW", 17, "United States"));
            seattleSounders.add(new SoccerPlayer("Spencer Richey", "GK", 18, "United States"));
            seattleSounders.add(new SoccerPlayer("Nicolas Benezet", "MF", 20, "France"));
            seattleSounders.add(new SoccerPlayer("Reed Baker-Whiting", "MF", 21, "United States"));
            seattleSounders.add(new SoccerPlayer("Kelyn Rowe", "MF", 22, "United States"));
            seattleSounders.add(new SoccerPlayer("Léo Chú", "MF", 23, "Brazil"));
            seattleSounders.add(new SoccerPlayer("Stefan Frei", "GK", 24, "Switzerland"));
            seattleSounders.add(new SoccerPlayer("Andrew Thomas", "GK", 26, "Russia"));
            seattleSounders.add(new SoccerPlayer("Shane O'Neill", "DF", 27, "United States"));
            seattleSounders.add(new SoccerPlayer("Stefan Cleveland", "GK", 30, "United States"));
            seattleSounders.add(new SoccerPlayer("Ethan Dobbelaere", "MF", 45, "United States"));
            seattleSounders.add(new SoccerPlayer("Danny Leyva", "MF", 75, "United States"));
            seattleSounders.add(new SoccerPlayer("Josh Atencio", "MF", 84, "United States"));
            seattleSounders.add(new SoccerPlayer("Abdoulaye Cissoko", "DF", 92, "France"));
            seattleSounders.add(new SoccerPlayer("Jimmy Medranda", "DF", 94, "Colombia"));
        }
    }
        public static ObservableList<SoccerPlayer> getAllPlayers() {
            return seattleSounders;
        }
        }




