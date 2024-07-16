package Behavioral.State.MusicPlayer.diffStates;

import Behavioral.State.MusicPlayer.Player;

public abstract class State {
    Player player;
    State(Player player) {
        this.player = player;
        System.out.println(this.player.getState());
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
