package training

import java.util.Date

object Boot {

  def main(args: Array[String]): Unit = {



    // bigdecimal
    val f1: BigDecimal = BigDecimal(11)
    val f2: BigDecimal = BigDecimal(3)
    val ret = f1 / f2

    if(f1.compare(BigDecimal(0.0)) > 0){
      println(f1)
    }

    val f0: BigDecimal = BigDecimal(0.0)
    if (f0 ==  0) {
      println(f0)
    }
//    println(ret)

    implicit def bigDecimalToJavaBigDecimal(ret: math.BigDecimal) = ret.underlying

    val result = ret.setScale(3, scala.math.BigDecimal.RoundingMode.DOWN).stripTrailingZeros().toPlainString()
//    println(result)



  }


}
