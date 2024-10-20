package winlyps.anvilNoFall

import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityChangeBlockEvent

class AnvilNoFallListener(private val plugin: AnvilNoFall) : Listener {

    @EventHandler
    fun onEntityChangeBlock(event: EntityChangeBlockEvent) {
        if (event.entityType == EntityType.FALLING_BLOCK) {
            val fallingBlock = event.block.type
            if (fallingBlock == Material.ANVIL || fallingBlock == Material.CHIPPED_ANVIL || fallingBlock == Material.DAMAGED_ANVIL || fallingBlock == Material.LEGACY_ANVIL) {
                event.isCancelled = true
            }
        }
    }
}