import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // إنشاء الكروت
        Card card1 = new Card("Card A", false);
        Card card2 = new Card("Card B", true);
        Card card3 = new Card("Card C", true);
        Card card4 = new Card("Card D", false);

        // حطهم في ليست
        List<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);

        // طباعة قبل الترتيب
        System.out.println("Before:");
        for (Card c : cards) {
            System.out.println(c.getName());
        }

        // إنشاء كلاس الترتيب
        CardOrganizer organizer = new RecentMistakesFirstSorter();

        // ترتيب الكروت
        List<Card> sortedCards = organizer.organize(cards);

        // طباعة بعد الترتيب
        System.out.println("\nAfter:");
        for (Card c : sortedCards) {
            System.out.println(c.getName());
        }
    }
}
