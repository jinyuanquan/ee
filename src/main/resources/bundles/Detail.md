# Detail

## 路径定位

- 当前目录：`src/main/resources/bundles`
- 上一级："src/main/resources"
- 直接子目录数量：0
- 直接文件数量：2

## 这一层在做什么

这一层保存国际化文本，是 UI 功能的一部分，而不是附属资源。

## 这一层直接包含什么

### 子目录

- 当前没有子目录。

### 文件

- `bundle_zh_CN.properties`（1.0 KB）：简体中文文本资源。
- `bundle.properties`（1.0 KB）：默认语言文本资源。

## 实现方式

当前包含默认英文 `bundle.properties` 和简体中文 `bundle_zh_CN.properties`。它们为设置页面标题、按钮文字、尺寸提示、进度状态和 toast 消息提供字符串，避免把用户可见文本硬编码在 Java 中。

## 与其他层级的关系

它向上属于资源树，向下被 `BetterScreenShotFeature` 通过 `Core.bundle.get/format` 使用。

## 补充观察

新增设置项或状态文案时，这一层必须同步补键，否则界面会显示缺失键名。
