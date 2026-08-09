# Detail

## 路径定位

- 当前目录：`src/main/java/betterscreenshot`
- 上一级："src/main/java"
- 直接子目录数量：2
- 直接文件数量：1

## 这一层在做什么

这一层是项目唯一业务包的根，负责模组入口与内部功能分层。

## 这一层直接包含什么

### 子目录

- `core`：这一层是项目的核心算法区，当前只有 `Screenshot.java`，但它承担了整张地图截图的实质工作。
- `features`：这一层是功能编排和 UI 集成层，负责把底层截图能力变成玩家真正能使用的功能。

### 文件

- `BetterScreenShotMod.java`（664 B）：Mindustry 模组入口类；负责初始化功能并注册设置分类。

## 实现方式

直接文件 `BetterScreenShotMod.java` 作为 `mod.json` 指定的入口类，只做初始化与设置项分类注册；`core` 放真正的截图引擎；`features` 放设置、热键、UI 面板和 MindustryX OverlayUI 适配。入口类本身很薄，这是一种清晰的职责分离。

## 与其他层级的关系

它向上与 `mod.json` 的 `main` 字段直接对齐，向下把截图功能拆成“出图”和“交互”两条线。

## 补充观察

理解这一层，就能快速建立整个项目的心智模型。
