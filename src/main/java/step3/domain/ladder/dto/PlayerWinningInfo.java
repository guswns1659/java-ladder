package step3.domain.ladder.dto;

import step3.domain.ladder.Player;
import step3.domain.ladder.Point;

public class PlayerWinningInfo {
    private final Player player;
    private final String winningResult;
    private final Point point;

    public PlayerWinningInfo(Builder builder) {
        player = builder.player;
        winningResult = builder.winningResult;
        point = builder.point;
    }

    public boolean match(Player player) {
        return this.player.equals(player);
    }

    public static class Builder {
        private Player player;
        private String winningResult;
        private Point point;

        public Builder player(Player player) {
            this.player = player;
            return this;
        }
        public Builder winningResult(String winningResult) {
            this.winningResult = winningResult;
            return this;
        }
        public Builder point(Point point) {
            this.point = point;
            return this;
        }

        public PlayerWinningInfo build() {
            return new PlayerWinningInfo(this);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public String getWinningResult() {
        return winningResult;
    }

    public Point getPoint() {
        return point;
    }



}