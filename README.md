[![Stand With Ukraine](https://raw.githubusercontent.com/vshymanskyy/StandWithUkraine/main/banner2-direct.svg)](https://vshymanskyy.github.io/StandWithUkraine/)

<h1 align="center">
    <a href="https://plugins.jetbrains.com/plugin/11058-extra-icons">
      <img src="./src/main/resources/META-INF/pluginIcon.svg" width="84" height="84" alt="logo"/>
    </a><br/>
    Extra Icons
</h1>

<p align="center">
    <a href="https://plugins.jetbrains.com/plugin/11058-extra-icons"><img alt="plugin's version" src="https://img.shields.io/jetbrains/plugin/v/11058-extra-icons.svg"/></a>
    <a href="https://plugins.jetbrains.com/plugin/11058-extra-icons"><img alt="plugin's downloads" src="https://img.shields.io/jetbrains/plugin/d/11058-extra-icons.svg"/></a>
    <a href="https://github.com/jonathanlermitage/intellij-extra-icons-plugin/blob/master/LICENSE.txt"><img alt="plugin's license" src="https://img.shields.io/github/license/jonathanlermitage/intellij-extra-icons-plugin.svg"/></a>
    <a href="https://github.com/jonathanlermitage/intellij-extra-icons-plugin/graphs/contributors"><img alt="number of contributors" src="https://img.shields.io/github/contributors/jonathanlermitage/intellij-extra-icons-plugin"/></a><br>
</p>

Intellij IDEA (Community and Ultimate) plugin that adds icons for files like Travis YML, Appveyor YML, Git sub-modules, etc.  
You can also register your own icons in order to override file icons, but also all [IDE icons](https://jetbrains.design/intellij/resources/icons_list/) (including toolbars, menus, etc.). It works with all JetBrains products like IntelliJ (ultimate and community), PyCharm, WebStorm, DataGrip, etc.  
To get started with this plugin, please see this [guide](docs/GET_STARTED.md).

1. [Download](#download)
2. [Build](#build)  
3. [Contribution](#how-to-contribute)  
4. [Known issues](#known-issues)  
5. [License](#license)  
6. [Credits](#contributors)  
7. [Screenshots](#screenshots)  

## Download

Download plugin from the [JetBrains marketplace](https://plugins.jetbrains.com/plugin/11058-extra-icons) or via your IDE: <kbd>File</kbd>, <kbd>Settings...</kbd>, <kbd>Plugins</kbd>, <kbd>Marketplace</kbd>.

## Build

Install a JDK17+. You should be able to start Gradle Wrapper (`gradlew`).  
Take a look at the `Makefile` script: it contains useful commands to build, run and test the plugin, check for dependencies updates and some maintenance tasks. Show available commands by running `make help`.  
You may also want to see the [development FAQ](./docs/DEV_FAQ.md) if you faced an issue.

### Optimizations

Optionally, you may want to install SVGO in order to optimize SVG icons. Install SVGO with `npm install -g svgo`, then optimize SVG files by running `make svgo`.

## How to contribute

Please see [CONTRIBUTION.md](CONTRIBUTION.md).

Nota: you can test icons with this [sample project](https://github.com/jonathanlermitage/intellij-extra-icons-plugin/tree/sample-project). This is a project with many empty files. It will help you to verify icon overrides.

## Known issues

Please see [KNOWN_ISSUES.md](KNOWN_ISSUES.md) and [GitHub open issues](https://github.com/jonathanlermitage/intellij-extra-icons-plugin/issues).

## License

MIT License. In other words, you can do what you want: this project is entirely OpenSource, Free and Gratis.  
All features are available in this open-source build.

## Contributors

* Please see the [contributors list](https://github.com/jonathanlermitage/intellij-extra-icons-plugin/graphs/contributors)

## Screenshots

![Dark Screenshot](docs/screenshots/intellijidea-ce_dark.png)

![Screenshot](docs/screenshots/intellijidea-ce.png)

![Config Panel Screenshot](docs/screenshots/config-panel.png)

![User Config Panel Screenshot](docs/screenshots/config-panel-user-tab.png)
