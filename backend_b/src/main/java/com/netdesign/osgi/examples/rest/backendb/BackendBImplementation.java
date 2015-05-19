package com.netdesign.osgi.examples.rest.backendb;

import com.netdesign.osgi.examples.rest.domain.MessageProvider;

/**
 * Created by nmw on 14-05-2015.
 */
public class BackendBImplementation implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello from Backend B";
    }
}
