package org.halim.logger;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserBusiness {

    private static final Logger log = LogManager.getLogger(UserBusiness.class);
    
    public UserBusiness(){
        log.info("user info");
        log.debug("user debug");
        log.trace("user trace");
        log.warn("user warning");
        log.error("user error");
    }
}
