/**
 * Created by yerlibilgin on 30/11/14.
 */

import minderengine.ReflectionUtils
import org.specs2.mutable.Specification

class MinderCommonTest extends Specification {
  "Reflection Utils" should {
    "resolve classes for valid type strings" in {
      classOf[Array[Int]] must be (ReflectionUtils.cannonical2Class("int []"))
      classOf[Array[Int]] must be (ReflectionUtils.cannonical2Class("int[]"))
      classOf[Array[Array[Int]]] must be (ReflectionUtils.cannonical2Class("int[][ ]"))
      classOf[Int] must be (ReflectionUtils.cannonical2Class("int"))
      classOf[String] must be (ReflectionUtils.cannonical2Class("java.lang.String"))
      classOf[Array[String]] must be (ReflectionUtils.cannonical2Class("java.lang.String[]"))
      classOf[Array[Array[String]]] must be (ReflectionUtils.cannonical2Class("java.lang.String[][]"))
      classOf[Array[Array[Array[String]]]] must be (ReflectionUtils.cannonical2Class("java.lang.String[][][]"))
      classOf[org.w3c.dom.Document] must be (ReflectionUtils.cannonical2Class("org.w3c.dom.Document"))
    }

    "reject invalid type strings" in {
      ReflectionUtils.cannonical2Class("hede") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("int[[]") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("int]") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("[]int") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("java.zang.Ztring") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("java.lang.String.") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("java.lang.String.[]") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("[]") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("..") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class(".....") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("int.[]") must throwA[IllegalArgumentException]
      ReflectionUtils.cannonical2Class("int.abc") must throwA[IllegalArgumentException]
    }
  }
}
