package com.netdesign.osgi.examples.rest.backenda;
import com.netdesign.osgi.examples.rest.domain.MessageProvider;


/**
 * Created by nmw on 14-05-2015.
 */
public class BackendAImplementation implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello from backend A";
    }
}
