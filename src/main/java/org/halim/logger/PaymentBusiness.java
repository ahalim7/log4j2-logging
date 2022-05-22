package org.halim.logger;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaymentBusiness {

    private static final Logger log = LogManager.getLogger(PaymentBusiness.class);

    public PaymentBusiness(){
        log.info("payment info");
        log.debug("payment debug");
        log.trace("payment trace");
        log.warn("payment warning");
        log.error("payment error");
    }
}
