package com.aypc.mediator4.components;

import com.aypc.mediator4.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
