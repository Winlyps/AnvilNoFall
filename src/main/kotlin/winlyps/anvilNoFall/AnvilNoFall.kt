package winlyps.anvilNoFall

import org.bukkit.plugin.java.JavaPlugin

class AnvilNoFall : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(AnvilNoFallListener(this), this)
        logger.info("AnvilNoFall plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("AnvilNoFall plugin has been disabled.")
    }
}
