/*    */ package Day1.Tuple;
/*    */ 
/*    */ import scala.Predef.;
/*    */ import scala.ScalaObject;
/*    */ import scala.Tuple2;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes="\006\001\0052A!\001\002\001\017\tQ1kY1mCR+\b\017\\3\013\005\r!\021!\002+va2,'\"A\003\002\t\021\013\0270M\002\001'\r\001\001\002\005\t\003\0239i\021A\003\006\003\0271\tA\001\\1oO*\tQ\"\001\003kCZ\f\027BA\b\013\005\031y%M[3diB\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\tY1kY1mC>\023'.Z2u\021\0259\002\001\"\001\031\003\031a\024N\\5u}Q\t\021\004\005\002\033\0015\t!\001C\003\035\001\021\005Q$A\005uKN$H+\0369mKV\ta\004\005\002\022?%\021\001E\005\002\005+:LG\017")
/*    */ public class JavaTuple
/*    */   implements ScalaObject
/*    */ {
/*    */   public void testTuple()
/*    */   {
/* 12 */     Tuple2 person = new Tuple2("tom", BoxesRunTime.boxToInteger(25));
/* 13 */     Predef..MODULE$.println(person._1());
/* 14 */     Predef..MODULE$.println(BoxesRunTime.boxToInteger(person._2$mcI$sp()));
/*    */   }
/*    */ }

/* Location:           /Users/twer/Documents/CodeCollection/7Lang7Weeks/Scala/out/production/Scala/
 * Qualified Name:     Day1.Tuple.JavaTuple
 * JD-Core Version:    0.6.1
 */