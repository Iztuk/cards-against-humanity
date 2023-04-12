public class Main {
    public static void main(String[] args) {
        // Creates the CardGenerator object.
        CardGenerator drawCard = new CardGenerator();

        // Determines the index numbers of the cards.
        int drawWhiteCard = (int)(Math.random() * 100 - 1);
        int drawBlackCard = (int)(Math.random() * 20 - 1);

        System.out.println(drawCard.getBlackCard(drawBlackCard));
        System.out.print(drawCard.GetWhiteCard(drawWhiteCard));
    }
}