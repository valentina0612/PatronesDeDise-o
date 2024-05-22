package com.mediator;

public class Radio extends Component {
    private boolean encendida = false;
    
    public Radio(Mediator mediator) {
        super(mediator);
    }

    public void enciende() {
        encendida = true;
        mediator.notify(this, "enciende");
    }

    public void apaga() {
        encendida = false;
    }

    public boolean encendida(){
        return encendida;
    }

}
