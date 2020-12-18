import java.io.File

object DimensGenerator {

    /**
     * 设计稿尺寸(根据自己设计师的设计稿的宽度填入)
     */
    private const val DESIGN_WIDTH = 800
    private const val DESIGN_HEIGHT = 1280

    /**
     * 适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
     * 适配Android 3.2以上   大部分平板的sw值集中在  700-900之间
     * 小米4 1200x1920x8 sw=678.4 dpi=283.02
     * 小米平板 1536x2048x7.9 sw=758 dpi=324.05
     * 华为平板 T1-A21W 800x1280x9.6 sw=814 dpi=157.23
     * 华为X6 800x1280x9.7 sw=822.57 dpi=155.61
     *
     * dpi = √(width^2 + height^2) / inch
     * sw = height / (dpi /160 )
     * @see Calculator
     */
    private const val MIN_WIDTH_DP = 660
    private const val MAX_WIDTH_DP = 900
    private const val STEP = 20
    private const val buildDir = "./out/res/"

    /**
     * 横屏取长度，竖屏取宽度
     */
    private const val isHorizontal = false

    @JvmStatic
    fun main(args: Array<String>) {
        val deleteSuccess = MakeUtils.deleteDir(File(buildDir))
        println("删除旧文件" + if (deleteSuccess) "成功" else "失败")

        var i = MIN_WIDTH_DP
        while (i <= MAX_WIDTH_DP) {
            MakeUtils.makeAll(DESIGN_WIDTH, if (isHorizontal) DESIGN_HEIGHT else DESIGN_WIDTH, i, buildDir)
            i += STEP
        }

    }


}

