/*    */ package Day1.Classes;
/*    */ 
/*    */ ;
/*    */ import scala.ScalaObject;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes="\006\001A2A!\001\002\001\017\tY1kY1mCB+'o]8o\025\t\031A!A\004DY\006\0348/Z:\013\003\025\tA\001R1zc\r\0011c\001\001\t!A\021\021BD\007\002\025)\0211\002D\001\005Y\006twMC\001\016\003\021Q\027M^1\n\005=Q!AB(cU\026\034G\017\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"CA\006TG\006d\027m\0242kK\016$\b\002C\f\001\005\003\005\013\021\002\r\002\023\031L'o\035;OC6,\007CA\r\035\035\t\t\"$\003\002\034%\0051\001K]3eK\032L!!\b\020\003\rM#(/\0338h\025\tY\"\003C\003!\001\021\005\021%\001\004=S:LGO\020\013\003E\021\002\"a\t\001\016\003\tAQaF\020A\002aAQ\001\t\001\005\002\031\"2AI\024)\021\0259R\0051\001\031\021\025IS\0051\001\031\003!a\027m\035;OC6,\007\"B\026\001\t\003a\023\001\002;bY.$\022!\f\t\003#9J!a\f\n\003\tUs\027\016\036")
/*    */ public class JavaPerson
/*    */   implements ScalaObject
/*    */ {
/*    */   public void talk()
/*    */   {
/* 18 */     Predef..MODULE$.println("Hi");
/*    */   }
/*    */ 
/*    */   public JavaPerson(String firstName)
/*    */   {
/* 11 */     Predef..MODULE$.println("Outer constructor");
/*    */   }
/*    */   public JavaPerson(String firstName, String lastName) {
/* 14 */     this(firstName);
/* 15 */     Predef..MODULE$.println("Inner constructor");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cui\Documents\GitHub\7Lang7Weeks\Scala\out\production\Scala\
 * Qualified Name:     Day1.Classes.JavaPerson
 * JD-Core Version:    0.6.1
 */