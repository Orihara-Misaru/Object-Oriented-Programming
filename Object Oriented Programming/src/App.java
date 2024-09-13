public class App {
    public static void main(String[] args) {
        MemberCard goldCard = new GoldCard("Kyoko Kirigiri", 20000);
        System.out.println("Gold info");
        goldCard.display();
        System.out.println("****************");

        MemberCard silverCard = new SilverCard("Makoto Naegi", 10000);
        System.out.println("Silver info");
        silverCard.display();
        System.out.println("****************");

        MemberCard extremeCard = new ExtremeCard("Monokuma", 50000);
        System.out.println("Extreme info");
        extremeCard.display();
        System.out.println("****************");
        MemberCard platinumCard = new PlatinumCard("Junko Enoshima", 40000);
        System.out.println("Platinum info");
        platinumCard.display();
    }
}
