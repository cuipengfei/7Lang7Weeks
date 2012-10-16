package Day2.FP;

import scala.Predef.;
import scala.ScalaObject;
import scala.Serializable;
import scala.collection.TraversableLike;
import scala.collection.immutable.List;
import scala.collection.immutable.List.;
import scala.reflect.ScalaSignature;
import scala.runtime.AbstractFunction1;

@ScalaSignature(bytes="\006\001\0052A!\001\002\001\017\t91kY1mC\032\003&BA\002\005\003\t1\005KC\001\006\003\021!\025-\037\032\004\001M\031\001\001\003\t\021\005%qQ\"\001\006\013\005-a\021\001\0027b]\036T\021!D\001\005U\0064\030-\003\002\020\025\t1qJ\0316fGR\004\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\0211bU2bY\006|%M[3di\")q\003\001C\0011\0051A(\0338jiz\"\022!\007\t\0035\001i\021A\001\005\0069\001!\t!H\001\007i\026\034HO\022)\026\003y\001\"!E\020\n\005\001\022\"\001B+oSR\004")
public class ScalaFP
  implements ScalaObject
{
  public void testFP()
  {
    List myList = List..MODULE$.apply(Predef..MODULE$.wrapRefArray((Object[])new String[] { "str1", "str2", "third string", "fourth string" }));
    myList.filter(new AbstractFunction1() { public static final long serialVersionUID = 0L;

      public final boolean apply(String item) { return item.length() > 4; }

    });
  }
}