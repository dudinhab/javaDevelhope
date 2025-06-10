import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players = new ArrayList<>();
    private int playerCount;
    private Coach coach;

    public Team(String teamName, Player[] player, Coach coach) {
        this.teamName = teamName;
        playerCount = player.length;
        Collections.addAll(players, player);
        this.coach = coach;

    }

    public void stampaRoleTeam() {
        System.out.println("Coach: "+coach.firstName+" "+coach.lastName);
        for (int i = 0; i < playerCount; i++) {
            if (players.get(i)!=null){
                System.out.println(players.get(i).firstName + " is a " + players.get(i).getRole());
            }

        }
    }

    public void aggiungePlayer(Player player) {
        boolean duplicate=false;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i)!=null) {
                if (((players.get(i).firstName.equals(player.firstName)) && (players.get(i).lastName.equals(player.lastName)))) {
                    duplicate = true;
                }
            }
        }
        if (duplicate){
            System.out.println("Player giá esiste!");
        }else{
            System.out.println("Player Add!");
            playerCount++;
            players.add(player);
        }
    }

    public void cambiaCoach(Coach coach) {
        this.coach = coach;
    }

}
