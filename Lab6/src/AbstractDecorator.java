public abstract class AbstractDecorator implements AbstractMaker{
    
    protected AbstractMaker abstractMaker;

    public AbstractDecorator(AbstractMaker abstractMaker){
        this.abstractMaker =  abstractMaker;
    }
    
    public float getPrice (){
        return abstractMaker.getPrice();
    }

    public String getIngredients() {
        
        return abstractMaker.getIngredients();
    }
    
    
}
