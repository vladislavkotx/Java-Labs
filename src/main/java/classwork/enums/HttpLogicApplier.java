package classwork.enums;

import java.util.Locale;

public class HttpLogicApplier {
    public static void applyLogic (HttpCode httpCode) {
        String str = httpCode.toString().toLowerCase(Locale.ROOT);
        System.out.println("Applying " + str + " logic");
    }
}
