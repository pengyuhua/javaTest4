package com.hand.pyh.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    public static Logger getLogger(Class tClass) {
        return LoggerFactory.getLogger(tClass);
    }
}
