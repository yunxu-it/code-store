import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt
import java.math.BigDecimal
import java.math.RoundingMode


object Calculator {

    @JvmStatic
    fun main(args: Array<String>) {
        calcDpi()
    }

    /**
     * 根据分辨率和设备尺寸计算sw值
     */
    private fun calcDpi() {
        val sc = Scanner(System.`in`)
        println("enter width: ")
        val width = sc.nextInt()
        println("enter height: ")
        val height = sc.nextInt()
        println("enter screen size: ")
        val screenSize = sc.nextDouble()

        val dpi = getDpi(width, height, screenSize).omit()
        println("dpi: $dpi")
        println("small width: " + getSmallWidthDp(width, dpi).omit())
    }

    /**
     * 根据设备宽度与dpi计算宽度dp值
     */
    private fun getSmallWidthDp(width: Int, dpi: Double) = width / (dpi / 160)

    /**
     * 根据设备的长宽高计算dpi
     */
    private fun getDpi(width: Int, height: Int, inch: Double): Double {
        return sqrt(width.toDouble().pow(2.0) + height.toDouble().pow(2.0)) / inch
    }

    /**
     * 省略两位小数
     */
    private fun Double.omit(): Double {
        return BigDecimal(this).setScale(2, RoundingMode.HALF_UP).toDouble()
    }


}
