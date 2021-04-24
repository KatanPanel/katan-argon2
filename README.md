<p align="center"><img src="https://i.imgur.com/A4T861z.png" alt="Katan Logo"/></p>
<h1 align="center">Katan Official Plugin</h1>

## Introduction
katan-argon2-plugin is a plugin that adds support for the [Argon2](https://github.com/P-H-C/phc-winner-argon2) hashing algorithm to Katan.

## Requirements
To use this plug-in you need to install the Argon2 libraries on your machine with your preferred package manager [or compile the libraries yourself](https://github.com/phxql/argon2-jvm/blob/master/docs/compile-argon2.md).

* Minimum Katan version: v0.0.1 or higher
* Argon2 libraries
* [A compatible operating system](https://github.com/phxql/argon2-jvm#usage)

## Installation
* Download a release from the [releases](https://github.com/KatanPanel/katan-argon2/releases) tab.
* Put the downloaded executable in Katan's plugin folder.
* Change the hashing algorithm in the Katan configuration to `Argon2` *(security » crypto » hash)*.

## Configuration
See the full configuration [here](https://github.com/KatanPanel/katan-argon2-plugin/blob/main/src/main/resources/config.conf)

## License
katan-argon2-plugin uses [argon2-jvm](https://github.com/phxql/argon2-jvm) under the [LGPL v3](https://github.com/phxql/argon2-jvm/blob/master/LICENSE.txt) license.\
katan-argon2-plugin is licensed under [MIT](https://github.com/KatanPanel/katan-argon2/blob/main/LICENSE).
