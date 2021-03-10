package me.gavin.shulkerpatch

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockDispenseEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {

    override fun onEnable() {
        this.server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun onDispense(event: BlockDispenseEvent) {
        if (event.block.location.y > 250) {
            if (isShulkerBox(event.item.type))
                event.isCancelled = true
        }
    }

    fun isShulkerBox(material: Material) : Boolean {
        return material == Material.YELLOW_SHULKER_BOX ||
            material == Material.WHITE_SHULKER_BOX ||
            material == Material.SILVER_SHULKER_BOX ||
            material == Material.RED_SHULKER_BOX ||
            material == Material.PURPLE_SHULKER_BOX ||
            material == Material.PINK_SHULKER_BOX ||
            material == Material.ORANGE_SHULKER_BOX ||
            material == Material.MAGENTA_SHULKER_BOX ||
            material == Material.GRAY_SHULKER_BOX ||
            material == Material.LIME_SHULKER_BOX ||
            material == Material.LIGHT_BLUE_SHULKER_BOX ||
            material == Material.GREEN_SHULKER_BOX ||
            material == Material.BROWN_SHULKER_BOX ||
            material == Material.BLACK_SHULKER_BOX ||
            material == Material.CYAN_SHULKER_BOX ||
            material == Material.BLUE_SHULKER_BOX
    }
}