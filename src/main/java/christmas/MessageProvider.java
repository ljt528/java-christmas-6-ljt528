package christmas;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageProvider {
    private static final ResourceBundle messages;
    private static final Locale defaultLocale = new Locale("en"); // Default to English

    static {
        messages = ResourceBundle.getBundle("messages", defaultLocale);
    }

    public static String getMessage(String key) {
        return messages.getString(key);
    }

    public static String getMessage(String key, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString(key);
    }
}