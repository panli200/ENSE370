public class CreamDecorator extends AbstractDecorator {
    String ingredients;

    public CreamDecorator(AbstractMaker abstractMaker) {
        super(abstractMaker);
    }

    public float getPrice() {

        return (float) (super.abstractMaker.getPrice() + 0.15);
    }

    public String getIngredients() {

        return super.abstractMaker.getIngredients() + "@";
    }

}
