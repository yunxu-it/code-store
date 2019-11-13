import java.io.File

object DimensGenerator {

    /**
     * 设计稿尺寸(根据自己设计师的设计稿的宽度填入)
     */
    private const val DESIGN_WIDTH = 750
    private const val DESIGN_HEIGHT = 1334

    /**
     * 适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
     * dpi = √(width^2 + height^2) / inch
     * sw = height / (dpi /160 )
     * @see Calculator
     */
    private const val MIN_WIDTH_DP = 400
    private const val MAX_WIDTH_DP = 600
    private const val STEP = 10
    private const val buildDir = "./out/res/"

    @JvmStatic
    fun main(args: Array<String>) {
        val deleteSuccess = MakeUtils.deleteDir(File(buildDir))
        println("删除旧文件" + if (deleteSuccess) "成功" else "失败")

        var i = MIN_WIDTH_DP
        while (i <= MAX_WIDTH_DP) {
            MakeUtils.makeAll(DESIGN_WIDTH, DESIGN_HEIGHT, i, buildDir)
            i += STEP
        }
    }


}

