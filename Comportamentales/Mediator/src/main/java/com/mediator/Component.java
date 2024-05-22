package com.mediator;

public class Component {
    protected Mediator mediator;

    public Component(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
