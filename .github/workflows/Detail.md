# Detail

## 路径定位

- 当前目录：`.github/workflows`
- 上一级：".github"
- 直接子目录数量：0
- 直接文件数量：1

## 这一层在做什么

这一层承载 GitHub Actions 工作流文件，当前只有 `release.yml`，因此它就是远程发布策略的唯一入口。

## 这一层直接包含什么

### 子目录

- 当前没有子目录。

### 文件

- `release.yml`（10.1 KB）：GitHub Actions 自动发布工作流；负责版本提升、构建、打 tag 与 Release。

## 实现方式

`release.yml` 会根据最近 tag 之后的提交信息判断版本提升级别，再同步更新 `build.gradle` 与 `src/main/resources/mod.json` 的版本号，之后安装 Android SDK、调用 Gradle 任务、推送 tag 并创建 GitHub Release。它的实现特点是优先复用本地已有任务，而不是在 CI 里另写一套打包逻辑。

## 与其他层级的关系

它向上依赖 GitHub 事件和仓库权限，向下依赖根目录构建脚本、资源文件和生成产物路径。CI 的本质是远程重放本地构建。

## 补充观察

这个目录体现出项目已经具备基本的自动版本化和自动发布意识。
