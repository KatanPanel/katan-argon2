package me.devnatan.katan.plugin.argon2

import me.devnatan.katan.api.annotations.UnstableKatanApi
import me.devnatan.katan.api.plugin.*
import me.devnatan.katan.api.security.crypto.Hash

class Argon2Plugin : KatanPlugin("katan-argon2", "0.0.1", "DevNatan") {

    init {
        handle(PluginEnabled, ::onStart)
        handle(PluginDisabled, ::onStop)
    }

    val hash by dependency<Hash>()

    @OptIn(UnstableKatanApi::class)
    private fun onStart() {
        registerService<Hash>(Argon2Hash(config))
    }

    @OptIn(UnstableKatanApi::class)
    private fun onStop() {
        unregisterService(Hash::class)
    }

}