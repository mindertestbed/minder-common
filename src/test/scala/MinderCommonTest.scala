/**
 * Created by yerlibilgin on 30/11/14.
 */

import java.util.concurrent.PriorityBlockingQueue

import minderengine.{SignalData, ReflectionUtils}
import org.specs2.mutable.Specification

class MinderCommonTest extends Specification {
  "Reflection Utils" should {
    "resolve classes for valid type strings" in {
      classOf[Array[Int]] must be(ReflectionUtils.cannonical2Class("int []"))
      classOf[Array[Int]] must be(ReflectionUtils.cannonical2Class("int[]"))
      classOf[Array[Array[Int]]] must be(ReflectionUtils.cannonical2Class("int[][ ]"))
      classOf[Int] must be(ReflectionUtils.cannonical2Class("int"))
      classOf[String] must be(ReflectionUtils.cannonical2Class("java.lang.String"))
      classOf[Array[String]] must be(ReflectionUtils.cannonical2Class("java.lang.String[]"))
      classOf[Array[Array[String]]] must be(ReflectionUtils.cannonical2Class("java.lang.String[][]"))
      classOf[Array[Array[Array[String]]]] must be(ReflectionUtils.cannonical2Class("java.lang.String[][][]"))
      classOf[org.w3c.dom.Document] must be(ReflectionUtils.cannonical2Class("org.w3c.dom.Document"))
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

  /**
   * Test signal order in priority blocking queue
   */
  "SignalData instances " should {
    "be taken wrt their seq.num order from a pblqueue" in {
      val s1 = new SignalData(null);
      val s2 = new SignalData(null);
      val s3 = new SignalData(null);
      val s4 = new SignalData(null);
      val s5 = new SignalData(null);
      val s6 = new SignalData(null);
      val pbq = new PriorityBlockingQueue[SignalData]();

      pbq.offer(s6);
      pbq.offer(s5);
      pbq.offer(s4);
      pbq.offer(s3);
      pbq.offer(s2);
      pbq.offer(s1);

      pbq.take().seqNum must_==  s1.seqNum
      pbq.take().seqNum must_==  s2.seqNum
      pbq.take().seqNum must_==  s3.seqNum
      pbq.take().seqNum must_==  s4.seqNum
      pbq.take().seqNum must_==  s5.seqNum
      pbq.take().seqNum must_==  s6.seqNum
    }
  }
}

