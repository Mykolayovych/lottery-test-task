package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    // Empty line
    //It is not advisable to use static methods. It is better to create an instance of the class whose method needs to be called.
    //In general, it is not necessary to create a class in which one method is also static. It is better to use the anonymous method.
    public static String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        //You need to use name() to get the string representation of enum constants
        //return Colors.values()[index].toString();
        return Colors.values()[index].name();
    }
}
