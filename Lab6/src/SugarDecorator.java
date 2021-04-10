public class SugarDecorator extends AbstractDecorator {

    String ingredients;

    public SugarDecorator(AbstractMaker abstractMaker) {
        super(abstractMaker);
    }

    public float getPrice() {

        return (float) (super.abstractMaker.getPrice() + 0.10);

    }

    public String getIngredients() {

        return super.abstractMaker.getIngredients() + "$";

    }
}
