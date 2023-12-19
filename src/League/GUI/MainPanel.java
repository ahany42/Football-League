package League.GUI;

import League.League;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    CardLayout cardLayout;

    public MainPanel(League league) {
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        //PlayerGui playerGui = new PlayerGui(this,cardLayout,league);
        Matches matches = new Matches(this, cardLayout,league.upcomingMatches,league.pastMatches,league);
        Standings standings = new Standings();
        Players players = new Players(this,cardLayout,league);
        PlayerHome playerHome = new PlayerHome(this,cardLayout,league.teamnames);
        AddPlayer addPlayer = new AddPlayer(league.teamnames);
        EditPlayer editPlayer = new EditPlayer(league);
        DeletePlayer deletePlayer = new DeletePlayer(league);
        //this.add(playerGui, "PlayerGUI");
        this.add(playerHome,"PlayerHome");
        this.add(matches, "Matches");
        this.add(standings, "Standings");
        this.add(players,"Stats");
        this.add(addPlayer,"AddPlayer");
        this.add(editPlayer,"EditPlayer");
        this.add(deletePlayer,"DeletePlayer");
        this.add(new TeamInfo(league.getTeams().get(0)),"TeamInfo");
    }
}
