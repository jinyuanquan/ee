# BetterScreenShot / 更好的截图

## 中文

> 把一张 Mindustry 地图完整、清晰地保存下来。

BetterScreenShot 面向需要记录基地、分享地图或复盘布局的玩家。它可以从游戏内直接生成高分辨率世界截图，大地图也会自动分块处理，不必先缩小视野或手工拼图。

截图只在本地生成，不影响游戏状态。安装 MindustryX 时可以使用 OverlayUI 按钮；没有它时会回退到普通 HUD 面板。

### 使用

安装并启用后，使用 OverlayUI 截图按钮、HUD 按钮或默认 F8 快捷键开始截图。文件会保存到 Mindustry 的截图目录。

### 需求与构建

需要 Mindustry v154+。OverlayUI（MindustryX）是可选的。

~~~powershell
gradle build
gradle deploy
~~~

项目没有 Gradle Wrapper，需要使用系统 Gradle。

## English

> Save a complete, clear view of a Mindustry world.

BetterScreenShot is for players who want to record a base, share a map, or review a layout. It captures high-resolution world screenshots from inside the game and renders large maps in chunks, so you do not need to zoom out or stitch images by hand.

Screenshots are created locally and do not affect the game state. MindustryX provides an OverlayUI button when installed; otherwise the mod falls back to a regular HUD panel.

### Usage

Enable the mod, then use the OverlayUI button, HUD button, or the default F8 hotkey to capture a world. The PNG is saved to Mindustry's screenshot directory.

### Requirements and build

Mindustry v154+ is required. OverlayUI from MindustryX is optional.

~~~powershell
gradle build
gradle deploy
~~~

This project has no Gradle Wrapper and requires a system Gradle installation.
