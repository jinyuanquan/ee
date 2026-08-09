# Detail

## 路径定位

- 当前目录：`src/main/java/betterscreenshot/features`
- 上一级："src/main/java/betterscreenshot"
- 直接子目录数量：0
- 直接文件数量：1

## 这一层在做什么

这一层是功能编排和 UI 集成层，负责把底层截图能力变成玩家真正能使用的功能。

## 这一层直接包含什么

### 子目录

- 当前没有子目录。

### 文件

- `BetterScreenShotFeature.java`（15.9 KB）：功能/UI 层；负责设置、热键、面板、进度与 OverlayUI 适配。

## 实现方式

`BetterScreenShotFeature.java` 会声明设置项、注册 F8 热键、构建按钮和状态面板、实时显示预计尺寸与原始内存、触发截图、接收进度回调并更新文案。它还内置了 `MindustryXOverlayUI` 反射适配器，能在检测到 MindustryX 时把面板注册成 OverlayUI 窗口，否则回退到普通 HUD。

## 与其他层级的关系

它向上由模组入口初始化，向下调用 `core.Screenshot` 真正执行渲染，是整个项目的业务策略层。

## 补充观察

如果功能可用但交互体验不理想，首先该调整的通常就是这一层。
