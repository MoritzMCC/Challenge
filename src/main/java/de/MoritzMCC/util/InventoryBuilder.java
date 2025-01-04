package de.MoritzMCC.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryBuilder {

    private Inventory inventory;
    private int size;

    public InventoryBuilder(String title, int size) {
        this.size = size;
        inventory = Bukkit.createInventory(null, size,title );
    }
    public InventoryBuilder(String title) {
        this(title, 9);
    }
    public InventoryBuilder(int size) {
        this.size = size;
        inventory = Bukkit.createInventory(null, size);
    }
    public InventoryBuilder(String title, int size, InventoryHolder owner) {
        inventory = Bukkit.createInventory(owner, size,title );
    }

    public InventoryBuilder setSize(int size) {
        this.size = size;
        return this;
    }
    public InventoryBuilder addItem(ItemStack item) {
        inventory.addItem(item);
        return this;
    }
    public InventoryBuilder addItem(Material material, int amount) {
        inventory.addItem(new ItemStack(material, amount));
        return this;
    }
    public InventoryBuilder setItem(int slot, ItemStack item) {
        inventory.setItem(slot, item);
        return this;
    }
    public InventoryBuilder setItem(int slot, Material material, int amount) {
        inventory.setItem(slot, new ItemStack(material, amount));
        return this;
    }
    public InventoryBuilder setBackground(){
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);

        for (int i=0; i<size; i++) {
            if (inventory.getItem(i) != null) continue;
            inventory.setItem(i, item);
        }
        return this;
    }

    public Inventory build(){
        return inventory;
    }

}
