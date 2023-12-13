package ladderGame;

import ladderGame.domain.LadderGame;
import ladderGame.view.ConsoleInputView;
import ladderGame.view.ConsoleOutputView;

public class LadderGameApplication {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(new ConsoleInputView(), new ConsoleOutputView());
        ladderGame.run();
    }
}
