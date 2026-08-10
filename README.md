# BetterScreenShot / 更好的截图

Mindustry / MindustryX mod that captures high-resolution world screenshots with one click from an OverlayUI button or hotkey. Large maps are rendered in chunks to avoid texture-size limits, with size hints and optional progress status.

通过 OverlayUI 按钮或快捷键一键生成高分辨率世界截图。超大地图会自动分块渲染，规避纹理尺寸限制，并提供截图尺寸提示与可选进度状态。

## Features

- One-click high-resolution world screenshots from an OverlayUI button or hotkey (default `F8`)
- Chunked rendering for large maps (avoids texture-size limits)
- Screenshot size hints (dimensions, raw memory, chunk count)
- Optional progress status while capturing
- Falls back to a built-in HUD panel when OverlayUI is not installed

## Settings

Available in `Settings > BetterScreenShot`:

- **Enable** — enable/disable the mod (default on)
- **Resolution scale** — screenshot resolution multiplier, 25%–400% (default 100%)
- **Show progress status** — display chunk progress while capturing (default on)

## Requirements

- Mindustry v154+
- OverlayUI (MindustryX) optional: the overlay button is used when it is installed, otherwise a HUD panel is shown.

## Build

The repository has no Gradle wrapper, so use a system `gradle` installation:

```powershell
gradle build
```

This produces the mod archive `build/libs/betterScreenShot.zip` (a `.zip`, not a `.jar`; Mindustry loads it as a zip mod).

Optional artifacts:

```powershell
gradle jarDesktop   # build/libs/betterScreenShot.jar (desktop jar)
gradle jarAndroid   # build/libs/betterScreenShot-android.jar (Android dex jar)
gradle deploy       # builds all three
```

The jar tasks also copy versioned copies (`betterScreenShot-v1.0.0.zip`, `betterScreenShot-v1.0.0.jar`, `betterScreenShot-v1.0.0-android.jar`) into `构建/BetterScreenShot/`.

## Usage

- In-game: click the OverlayUI screenshot button / HUD panel button, or press the configured hotkey (`F8`).
- The screenshot is saved to the Mindustry screenshot directory as `screenshot-<timestamp>.png`.

Install the built `.zip` (or desktop `.jar`) through Mindustry's `Mods` menu (`Mods > Import Mod > From File`).
