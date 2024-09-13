public class ExtremeCard extends MemberCard {
    public ExtremeCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .30f;
    }
    
}