/*    */ package Day1;
/*    */ 
/*    */ import scala.Predef.;
/*    */ import scala.ScalaObject;
/*    */ import scala.Serializable;
/*    */ import scala.collection.IndexedSeqOptimized;
/*    */ import scala.collection.immutable.Range;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractFunction1.mcVI.sp;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.RichInt;
/*    */ 
/*    */ @ScalaSignature(bytes="\006\001\r2A!\001\002\001\013\tAA)Y=2\007>$WMC\001\004\003\021!\025-_\031\004\001M\031\001A\002\b\021\005\035aQ\"\001\005\013\005%Q\021\001\0027b]\036T\021aC\001\005U\0064\030-\003\002\016\021\t1qJ\0316fGR\004\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\0211bU2bY\006|%M[3di\")Q\003\001C\001-\0051A(\0338jiz\"\022a\006\t\0031\001i\021A\001\005\0065\001!\taG\001\no\"LG.\032'p_B,\022\001\b\t\003\037uI!A\b\t\003\tUs\027\016\036\005\006A\001!\taG\001\bM>\024Hj\\8q\021\025\021\003\001\"\001\034\003-1wN]3bG\"dun\0349")
/*    */ public class Day1Code
/*    */   implements ScalaObject
/*    */ {
/*    */   public void whileLoop()
/*    */   {
/* 12 */     int i = 0;
/* 13 */     while (i < 5) {
/* 14 */       Predef..MODULE$.println(BoxesRunTime.boxToInteger(i));
/* 15 */       i += 1;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void forLoop() {
/* 20 */     Predef..MODULE$.println("this is a for loop");
/* 21 */     Predef..MODULE$.intWrapper(1).until(10).foreach$mVc$sp(new AbstractFunction1.mcVI.sp() { public static final long serialVersionUID = 0L;
/*    */ 
/* 21 */       public final void apply(int i) { apply$mcVI$sp(i); } 
/* 22 */       public void apply$mcVI$sp(int v1) { Predef..MODULE$.println(BoxesRunTime.boxToInteger(v1)); } } );
/*    */   }
/*    */ 
/*    */   public void foreachLoop()
/*    */   {
/* 27 */     Predef..MODULE$.println("this is a foreach");
/* 28 */     String[] args = (String[])new String[] { "hi", "hey" };
/* 29 */     Predef..MODULE$.refArrayOps((Object[])args).foreach(
/* 30 */       new AbstractFunction1() { public static final long serialVersionUID = 0L;
/*    */ 
/* 30 */       public final void apply(String arg) { Predef..MODULE$.println(arg); }
/*    */ 
/*    */     });
/*    */   }
/*    */ }

/* Location:           /Users/twer/Documents/CodeCollection/7Lang7Weeks/Scala/out/production/Scala/
 * Qualified Name:     Day1.Day1Code
 * JD-Core Version:    0.6.1
 */