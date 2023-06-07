package io.github.itscoldhere.customitems.Util;

import java.util.ArrayList;
import java.util.List;

public class ActualRegistery {
    public static List<ItemUtil> Items = new ArrayList<>();
    public static void register(ItemUtil customItem) {
        Items.add(customItem);
    }
}
