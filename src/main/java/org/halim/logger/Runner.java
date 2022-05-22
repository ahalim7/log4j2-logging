package org.halim.logger;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        for(int i = 0; i<1000; i++) {
            System.out.println("start logging internal ..... ");

            log.info("main info");
            log.debug("main debug");
            log.trace("main trace");
            log.warn("main warning");
            log.error("main error");

            System.out.println("start logging external ..... ");
            new UserBusiness();
            new PaymentBusiness();
        }
    }

}
