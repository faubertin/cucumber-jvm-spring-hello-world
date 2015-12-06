package org.faubertin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloService {

    private static final Logger log = LoggerFactory.getLogger(HelloService.class);

    public void enterRoom() {
        log.info("Entering the room");
    }

    public boolean checkPresent(String name) {
        log.info("Checking that {} is there", name);
        return true;
    }

    public void sayHello(String name) {
        log.info("Hello {}", name);
    }

}
