/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.Printer;

import org.apache.log4j.Logger;

/**
 *
 * @author niksk
 */
public class PrintLog {
    public static void printLogWarn(String msg, Logger logger){
        logger.warn(msg);
    }
    
    public static void printLogInfo(String msg, Logger logger){
        logger.info(msg);
    }
}
