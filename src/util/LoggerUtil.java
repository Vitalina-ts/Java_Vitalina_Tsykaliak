package util;

import java.io.IOException;
import java.util.logging.*;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("app.log", true);
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            System.err.println("Не вдалося створити лог-файл: " + e.getMessage());
        }
    }

    public static void logInfo(String msg) {
        logger.info(msg);
    }

    public static void logSevere(String msg) {
        logger.severe(msg);
    }
}
