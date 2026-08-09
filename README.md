# BetterScreenShot / 更好的截图

Mindustry / MindustryX mod that captures high-resolution world screenshots with one click from an OverlayUI button or hotkey. Large maps are rendered in chunks to avoid texture-size limits, with size hints and optional progress status.

通过 OverlayUI 按钮或快捷键一键生成高分辨率世界截图。超大地图会自动分块渲染，规避纹理尺寸限制，并提供截图尺寸提示与可选进度状态。

## Features

- One-click high-resolution world screenshots from an OverlayUI button or hotkey
- Chunked rendering for large maps (avoids texture-size limits)
- Screenshot size hints
- Optional progress status

## Requirements

- Mindustry v154+
- OverlayUI (MindustryX) for the overlay button

## Build

```powershell
./gradlew build
```

The built jar is written to `build/libs/`.

## Usage

- In-game: click the OverlayUI screenshot button or press the configured hotkey.
- The screenshot is saved to the Mindustry screenshot folder (or world path).

Install the mod jar through Mindustry's `Mods` menu (`Mods > Import Mod > From File`).

## License

See repository files.
