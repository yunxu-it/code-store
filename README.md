## Android Dimens sw generator

生成dimens文件(夹)，用于原生UI适配

### Usage

1. 在`DimensGenerator`里设置属性值
   1. 设计稿宽度（UI的设计稿宽度）`DESIGN_WIDTH`
   2. 适配设备的DPI宽度区间 `MIN_WIDTH_DP`和`MAX_WIDTH_DP`，例如Nexus 5 的宽度为`1080px=360dp`
   3. 区间跨度`STEP`，默认为每10个dp为一个跨度
   4. 文件生成路径`buildDir`
2. 运行`DimensGenerator`文件


### 常见 sw 值

> 适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
> 适配Android 3.2以上   大部分平板的sw值集中在  700-900之间


| 机型                   | 分辨率及屏幕对角线 | DPI    | SW         |
| ---------------------- | ------------------ | ------ | ---------- |
| RedMi 9A (Phone)       | 720x1600x6.53      | 268.69 | **428.75** |
| 小米4 (Pad)            | 120x1920x8         | 283.02 | **678.4**  |
| 小米平板 (Pad)         | 1536x2048x7.9      | 324.05 | **758**    |
| 华为平板 T1-A21W (Pad) | 800x1280x9.6       | 157.23 | **814**    |
| 华为X6 (Pad)           | 800x1280x9.7       | 155.61 | **822**    |

### License
[MIT](./LICENSE)