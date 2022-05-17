package nextstep.ladder;

import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Player;
import nextstep.ladder.view.Input;
import nextstep.ladder.view.Output;

import java.util.List;
import java.util.stream.Collectors;

public class LadderGame {
    public static void main(String[] args) {
        List<String> playersAsString = Input.askPlayers();
        List<Player> players = playersAsString.stream()
                .map(Player::new)
                .collect(Collectors.toList());

        Height height = Input.askLadderHeight();
        Ladder ladder = Ladder.init(players.size() - 1, height);
        ladder.create(height);

        Output.printPlayers(players);
        Output.printLadder(ladder, height);
    }
}
