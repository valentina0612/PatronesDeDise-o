package com.mediator;

public class MediatorImpl implements Mediator{
    private Telefono telefono;
    private Radio radio;
    private Coche coche;

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void notify(Component sender, String event) {
        if(sender == coche && event=="enciende"){
            radio.enciende();
            telefono.apagaMusica();
        }
        if(sender == coche && event=="apaga"){
            radio.apaga();
        }
        if(sender == telefono && event=="recibeLlamada"){
            radio.apaga();
        }
        if(sender == radio && event=="enciende"){
            telefono.apagaMusica();
        }
    }


}
