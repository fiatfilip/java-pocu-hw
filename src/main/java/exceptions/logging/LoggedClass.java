package exceptions.logging;

import exceptions.ThrowException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggedClass {
    private static Logger logger = LogManager.getLogger(LoggedClass.class);
    public static void main(String[] args) {
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");

        m1();
    }

    private static void m1(){
        m2();
    }

    private static void m2(){
        try{
            throw new ThrowException();
        }catch(ThrowException throwException){
            logger.warn(throwException.getMessage(), throwException);
        }
    }
}
