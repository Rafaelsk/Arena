/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:00 PM
 */
public class Logger {
    private Logger() {
        // private constructor
    }
    public static class LoggerHolder {
        public static Logger logger = new Logger();
    }
    public static Logger getInstance() {
        return LoggerHolder.logger;
    }
    public void log(String s) {
        // log implementation
        System.err.println(s);
    }
}


