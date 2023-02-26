package PlayerLeague;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayManager {
        private List<Player> allplayers;

        public PlayManager() {

        allplayers = new ArrayList<Player>();
         }


        public boolean addPlayer(Player player){
                for (Player player1:allplayers){
                   if (player.getPlayerId().equals(player1.getPlayerId()))
                           return false;
                }

                if (assignLeague(player))
                    allplayers.add(player);
                return true;
        }

        public boolean assignLeague(Player player){
            boolean res = true;
                if (player.getAge() >= 15 && player.getAge() <= 20)
                    player.setLeague(League.FIRST);
            else if (player.getAge() >= 21 && player.getAge() <= 30)
                    player.setLeague(League.SECOND);
            else if (player.getAge() >= 31 && player.getAge() <= 100)
                    player.setLeague(League.THIRD);
            else res = false;
            return res;
        }

        public  List<Player> getPlayersByLeague(League league){
            List<Player> playerList = new LinkedList<>();
            for (Player player : allplayers) {
                if (player.getLeague().equals(league))
                    playerList.add(player);
            }
            return playerList;
        }

    


}
