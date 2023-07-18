package com.example.test

import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin() {

    override fun onEnable() {
        println("Wow, it worked!")
    }

    override fun onDisable() {

    }

}