package Day1.Classes;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/7/12
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */

import scala.reflect.ScalaSignature;

package Day1.Classes;

import scala.Predef.;
import scala.ScalaObject;
import scala.collection.LinearSeqOptimized;
import scala.collection.SeqLike;
import scala.collection.immutable.List;
import scala.collection.immutable.List.;
import scala.collection.mutable.StringBuilder;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00193A!\001\002\001\017\t91i\\7qCN\034(BA\002\005\003\035\031E.Y:tKNT\021!B\001\005\t\006L\030g\001\001\024\007\001A\001\003\005\002\n\0355\t!B\003\002\f\031\005!A.\0318h\025\005i\021\001\0026bm\006L!a\004\006\003\r=\023'.Z2u!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005-\0316-\0317b\037\nTWm\031;\t\013]\001A\021\001\r\002\rqJg.\033;?)\005I\002C\001\016\001\033\005\021\001b\002\017\001\005\004%\t!H\001\013I&\024Xm\031;j_:\034X#\001\020\021\007}!c%D\001!\025\t\t#%A\005j[6,H/\0312mK*\0211EE\001\013G>dG.Z2uS>t\027BA\023!\005\021a\025n\035;\021\005%9\023B\001\025\013\005\031\031FO]5oO\"1!\006\001Q\001\ny\t1\002Z5sK\016$\030n\0348tA!9A\006\001a\001\n\003i\023a\0022fCJLgnZ\013\002]A\021\021cL\005\003aI\0211!\0238u\021\035\021\004\0011A\005\002M\n1BY3be&twm\030\023fcR\021Ag\016\t\003#UJ!A\016\n\003\tUs\027\016\036\005\bqE\n\t\0211\001/\003\rAH%\r\005\007u\001\001\013\025\002\030\002\021\t,\027M]5oO\002BQ\001\020\001\005\002u\n\021\002Z5sK\016$\030n\0348\025\003\031BQa\020\001\005\002\001\013a!\0338g_JlGC\001\033B\021\025\021e\b1\001D\0035!XO\0358ESJ,7\r^5p]B\021Ai\022\b\003#\025K!A\022\n\002\rA\023X\rZ3g\023\tA\003J\003\002G%!)!\n\001C\001\027\006IA/\036:o%&<\007\016\036\013\002i!)Q\n\001C\001\027\006AA/\036:o\031\0264G\017")
public class JavaCompass
        implements ScalaObject {
    private final List<String> directions;
    private int bearing;

    public List<String> directions() {
        return this.directions;
    }

    public int bearing() {
        return this.bearing;
    }

    public void bearing_$eq(int paramInt) {
        this.bearing = paramInt;
    }


    public String direction() {
        return (String) directions().apply(bearing());
    }

    public void inform(String turnDirection) {
        Predef..
        MODULE$.println(new StringBuilder().append("Turning ").append(turnDirection).append(". Now bearing ").append(direction()).toString());
    }

    public void turnRight() {
        bearing_$eq((bearing() + 1) % directions().size());
        inform("right");
    }

    public void turnLeft() {
        bearing_$eq((bearing() + (directions().size() - 1)) % directions().size());
        inform("left");
    }

    public JavaCompass() {
        this.directions = List..
        MODULE$.apply(Predef..MODULE$.wrapRefArray((Object[]) new String[]{"north", "east", "south", "west"}));
        this.bearing = 0;
        Predef..MODULE$.print("Initial bearing: ");
        Predef..MODULE$.println(direction());
    }
}
