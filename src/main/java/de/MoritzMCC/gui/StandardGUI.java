package de.MoritzMCC.gui;

import de.MoritzMCC.util.InventoryBuilder;
import de.MoritzMCC.util.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class StandardGUI {
    Inventory inventory;

    public StandardGUI() {
        inventory = new InventoryBuilder(ChatColor.GOLD + "CHALLENGE", 7*9)
                .setItem(4 + 9, new ItemBuilder(Material.BOOK)
                        .withName(ChatColor.AQUA + "Challenges")
                        .build())
                .setItem(3 + 2*9, new ItemBuilder(Material.IRON_SWORD)
                        .withName(ChatColor.DARK_RED + "Damage")
                        .build())
                .setBackground()
                .build();
    }

    public Inventory getInventory() {
        return inventory;
    }
}
