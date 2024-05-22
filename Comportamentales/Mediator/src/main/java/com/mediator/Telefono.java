package com.mediator;

public class Telefono extends Component {
    private boolean musicaOn = false;

    public Telefono(Mediator mediator) {
        super(mediator);
    }

    public void recibeLlamada(){
        mediator.notify(this,"recibeLlamada");
    }

    public void enciendeMusica(){
        musicaOn = true;
    }

    public void apagaMusica(){
        musicaOn = false;
    }
    public boolean musicaEncendida() {
        return musicaOn;
    }

}
