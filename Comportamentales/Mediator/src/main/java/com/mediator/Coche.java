package com.mediator;

public class Coche extends Component {
    public Coche(Mediator mediator) {
        super(mediator);
    }
    public void enciende(){
        mediator.notify(this, "enciende");
    }
    public void apaga(){
        mediator.notify(this, "apaga");
    }
}
