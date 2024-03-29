package com.aypc.behavioral.mediator4.components;

import com.aypc.behavioral.mediator4.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
