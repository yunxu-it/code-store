## Android Dimens sw generator

生成dimens文件(夹)，用于原生UI适配

### Usage

1. 在`DimensGenerator`里设置属性值
   1. 设计稿宽度（UI的设计稿宽度）`DESIGN_WIDTH`
   2. 适配设备的DPI宽度区间 `MIN_WIDTH_DP`和`MAX_WIDTH_DP`，例如Nexus 5 的宽度为`1080px=360dp`
   3. 区间跨度`STEP`，默认为每10个dp为一个跨度
   4. 文件生成路径`buildDir`
2. 运行`DimensGenerator`文件


### License
[MIT](./LICENSE)