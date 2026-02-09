public class Card {

    private String name;
    private boolean answeredIncorrectlyLastRound;

    public Card(String name, boolean answeredIncorrectlyLastRound) {
        this.name = name;
        this.answeredIncorrectlyLastRound = answeredIncorrectlyLastRound;
    }

    public boolean wasAnsweredIncorrectlyLastRound() {
        return answeredIncorrectlyLastRound;
    }

    public String getName() {
        return name;
    }
}
