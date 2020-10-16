package me.devnatan.katan.plugin.argon2

import com.typesafe.config.Config
import de.mkammerer.argon2.Argon2Factory
import de.mkammerer.argon2.Argon2Helper
import me.devnatan.katan.api.security.crypto.SaltedHash

class Argon2Hash(config: Config) : SaltedHash {

    companion object {
        const val MAX_ITERATIONS_DURATION: Long = 3000
    }

    override val name: String get() = "Argon2"
    override val saltLength: Int = config.getInt("salt-length")

    private val argon2 = Argon2Factory.create(saltLength, config.getInt("key-length"))
    private val memory = config.getInt("memory-cost")
    private val parallelism = config.getInt("parallelism")

    override fun hash(value: CharArray): String {
        return argon2.hash(Argon2Helper.findIterations(argon2, MAX_ITERATIONS_DURATION, memory, parallelism), memory, parallelism, value, Charsets.UTF_8)
    }

    override fun compare(value: CharArray, hash: String): Boolean {
        return argon2.verify(hash, value, Charsets.UTF_8)
    }

}