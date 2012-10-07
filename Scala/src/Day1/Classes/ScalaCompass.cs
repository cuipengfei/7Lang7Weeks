using scala;
using scala.collection;
using scala.collection.immutable;
using scala.runtime;
using System;
using System.Text;
namespace Day1.Classes
{
	[Symtab(new byte[]
	{
		5,
		0,
		76,
		6,
		4,
		1,
		2,
		0,
		7,
		2,
		12,
		83,
		99,
		97,
		108,
		97,
		67,
		111,
		109,
		112,
		97,
		115,
		115,
		10,
		2,
		3,
		4,
		1,
		7,
		67,
		108,
		97,
		115,
		115,
		101,
		115,
		10,
		1,
		5,
		1,
		4,
		68,
		97,
		121,
		49,
		3,
		0,
		19,
		3,
		0,
		8,
		14,
		16,
		2,
		9,
		12,
		13,
		1,
		10,
		10,
		1,
		11,
		1,
		6,
		83,
		121,
		115,
		116,
		101,
		109,
		9,
		2,
		13,
		10,
		2,
		6,
		79,
		98,
		106,
		101,
		99,
		116,
		16,
		2,
		15,
		18,
		13,
		1,
		16,
		10,
		1,
		17,
		1,
		5,
		115,
		99,
		97,
		108,
		97,
		9,
		2,
		19,
		16,
		2,
		11,
		83,
		99,
		97,
		108,
		97,
		79,
		98,
		106,
		101,
		99,
		116,
		8,
		5,
		21,
		0,
		132,
		0,
		22,
		1,
		6,
		60,
		105,
		110,
		105,
		116,
		62,
		20,
		1,
		23,
		16,
		2,
		24,
		0,
		13,
		1,
		2,
		8,
		7,
		26,
		0,
		194,
		128,
		132,
		0,
		27,
		1,
		10,
		100,
		105,
		114,
		101,
		99,
		116,
		105,
		111,
		110,
		115,
		21,
		1,
		28,
		16,
		3,
		29,
		34,
		36,
		13,
		1,
		30,
		10,
		2,
		31,
		32,
		1,
		9,
		105,
		109,
		109,
		117,
		116,
		97,
		98,
		108,
		101,
		10,
		2,
		33,
		16,
		1,
		10,
		99,
		111,
		108,
		108,
		101,
		99,
		116,
		105,
		111,
		110,
		9,
		2,
		35,
		30,
		2,
		4,
		76,
		105,
		115,
		116,
		16,
		2,
		9,
		37,
		9,
		2,
		38,
		10,
		2,
		6,
		83,
		116,
		114,
		105,
		110,
		103,
		8,
		6,
		40,
		0,
		160,
		128,
		4,
		28,
		1,
		11,
		100,
		105,
		114,
		101,
		99,
		116,
		105,
		111,
		110,
		115,
		32,
		8,
		7,
		42,
		0,
		192,
		128,
		132,
		0,
		43,
		1,
		7,
		98,
		101,
		97,
		114,
		105,
		110,
		103,
		21,
		1,
		44,
		16,
		2,
		15,
		45,
		9,
		2,
		46,
		16,
		2,
		3,
		73,
		110,
		116,
		8,
		7,
		48,
		0,
		192,
		128,
		132,
		0,
		49,
		1,
		11,
		98,
		101,
		97,
		114,
		105,
		110,
		103,
		95,
		36,
		101,
		113,
		20,
		2,
		50,
		53,
		16,
		2,
		15,
		51,
		9,
		2,
		52,
		16,
		2,
		4,
		85,
		110,
		105,
		116,
		8,
		7,
		54,
		47,
		129,
		128,
		192,
		0,
		44,
		1,
		3,
		120,
		36,
		49,
		8,
		6,
		56,
		0,
		160,
		160,
		4,
		44,
		1,
		8,
		98,
		101,
		97,
		114,
		105,
		110,
		103,
		32,
		8,
		5,
		58,
		0,
		132,
		0,
		59,
		1,
		9,
		100,
		105,
		114,
		101,
		99,
		116,
		105,
		111,
		110,
		20,
		1,
		36,
		8,
		5,
		61,
		0,
		132,
		0,
		62,
		1,
		6,
		105,
		110,
		102,
		111,
		114,
		109,
		20,
		2,
		50,
		63,
		8,
		5,
		64,
		60,
		192,
		0,
		65,
		1,
		13,
		116,
		117,
		114,
		110,
		68,
		105,
		114,
		101,
		99,
		116,
		105,
		111,
		110,
		16,
		2,
		66,
		69,
		14,
		2,
		15,
		67,
		9,
		2,
		68,
		16,
		1,
		6,
		80,
		114,
		101,
		100,
		101,
		102,
		9,
		2,
		38,
		70,
		10,
		2,
		68,
		16,
		8,
		5,
		72,
		0,
		132,
		0,
		73,
		1,
		9,
		116,
		117,
		114,
		110,
		82,
		105,
		103,
		104,
		116,
		20,
		1,
		50,
		8,
		5,
		75,
		0,
		132,
		0,
		73,
		1,
		8,
		116,
		117,
		114,
		110,
		76,
		101,
		102,
		116
	})]
	public class ScalaCompass : ScalaObject
	{
		private List directions;
		private int bearing;
		public override List directions()
		{
			return this.directions;
		}
		public override int bearing()
		{
			return this.bearing;
		}
		public override void bearing_$eq(int x$1)
		{
			this.bearing = x$1;
		}
		public override string direction()
		{
			return (string)((LinearSeqOptimized)this.directions()).apply(this.bearing());
		}
		public override void inform(string turnDirection)
		{
			Predef$.MODULE$.println(new StringBuilder().Append("Turning ").Append(turnDirection).Append(". Now bearing ").Append(this.direction()).ToString());
		}
		public override void turnRight()
		{
			this.bearing_$eq((this.bearing() + 1) % ((SeqLike)this.directions()).size());
			this.inform("right");
		}
		public override void turnLeft()
		{
			this.bearing_$eq((this.bearing() + (((SeqLike)this.directions()).size() - 1)) % ((SeqLike)this.directions()).size());
			this.inform("left");
		}
		public ScalaCompass()
		{
			this.directions = List$.MODULE$.apply(Predef$.MODULE$.wrapRefArray((object[])new string[]
			{
				"north",
				"east",
				"south",
				"west"
			}));
			this.bearing = 0;
			Predef$.MODULE$.print("Initial bearing: ");
			Predef$.MODULE$.println(this.direction());
		}
	}
}
