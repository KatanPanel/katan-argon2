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
See the full configuration [here](https://github.com/KatanPanel/katan-argon2-plugin/blob/main/src/main/resources/config.conf).

### How to use
```kotlin
init {
    dependencyManager {
        plugin("katan-argon2")
    }
}
```

Hook using the lazily loaded `dependency` inline function.
```kotlin
val hash by dependency<Hash>()
```

### License
katan-argon2-plugin uses [argon2-jvm](https://github.com/phxql/argon2-jvm) under the [LGPL v3](https://github.com/phxql/argon2-jvm/blob/master/LICENSE.txt) license.\
katan-argon2-plugin is licensed under [MIT](https://github.com/KatanPanel/katan-argon2/blob/main/LICENSE).
