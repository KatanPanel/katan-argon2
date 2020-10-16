# katan-argon2
🔐 Plugin that adds support for the Argon2 password hashing function for Katan.

### Requirements
* Argon2 C library
* [A compatible operating system](https://github.com/phxql/argon2-jvm#usage)

### Installation
1. Download a .jar from the [releases](https://github.com/KatanPanel/katan-argon2/releases) tab.
2. Put the downloaded jar in Katan's plugin folder.
3. Change the hashing algorithm in the Katan configuration to `Argon2`.
4. Configure the plugin as you wish.

### Configuration
```yaml
# Will try to find the best possible settings for your machine, ignoring the configuration values.
optimal = true

# The length of the random salt (recommended: 16 bytes).
salt-length = 16

# The length of the generated hash (recommended: 32 bytes).
key-length = 32

# Number of iterations, affect the time cost.
iterations = 10

# The amount of memory used by the algorithm, in quibibytes.
# OBS: affect the memory cost (default: 65536 KiB = 64M)
memoryCost = 65536

# Number of threads used by the algorithm.
parallelism = 1
```

### Adding as a dependency to your plugin:
```kotlin
init {
    dependencyFactory {
        dependsOn("katan-argon-2", "0.0.1")
    }
}
```

### License
Katan Argon2 uses [argon2-jvm by phxql](https://github.com/phxql/argon2-jvm) under the [LGPL v3](https://github.com/phxql/argon2-jvm/blob/master/LICENSE.txt) license.\
Katan Argon2 is licensed under [MIT](https://github.com/KatanPanel/katan-argon2/blob/main/LICENSE).
