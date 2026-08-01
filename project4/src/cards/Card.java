package cards;

/**
 * A single Chance or Community Chest card.
 *
 * @param cardType    the effect the card produces when drawn
 * @param targetIndex the destination board index for {@link CardType#ADVANCE_TO}
 *                    cards, or {@code -1} when the card has no fixed target
 */
public record Card(CardType cardType, int targetIndex) {
    /**
     * Creates a card with no fixed target square (target index {@code -1}).
     * Used for every card whose effect is not a move to a specific square.
     *
     * @param cardType the effect the card produces when drawn
     */
    public Card(CardType cardType) {
        this(cardType, -1); // -1 means no target
    }

    /**
     * @return the card type's name, used for logging
     */
    @Override
    public String toString() {
        return cardType().toString();
    }
}