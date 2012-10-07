using scala;
using scala.runtime;
using System;
namespace Day1
{
	[Symtab(new byte[]
	{
		5,
		0,
		33,
		6,
		4,
		1,
		2,
		0,
		5,
		2,
		8,
		68,
		97,
		121,
		49,
		67,
		111,
		100,
		101,
		10,
		1,
		3,
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
		6,
		12,
		16,
		2,
		7,
		10,
		13,
		1,
		8,
		10,
		1,
		9,
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
		11,
		8,
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
		13,
		16,
		13,
		1,
		14,
		10,
		1,
		15,
		1,
		5,
		115,
		99,
		97,
		108,
		97,
		9,
		2,
		17,
		14,
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
		19,
		0,
		132,
		0,
		20,
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
		21,
		16,
		2,
		22,
		0,
		13,
		1,
		2,
		8,
		5,
		24,
		0,
		132,
		0,
		25,
		1,
		9,
		119,
		104,
		105,
		108,
		101,
		76,
		111,
		111,
		112,
		21,
		1,
		26,
		16,
		2,
		13,
		27,
		9,
		2,
		28,
		14,
		2,
		4,
		85,
		110,
		105,
		116,
		8,
		5,
		30,
		0,
		132,
		0,
		25,
		1,
		7,
		102,
		111,
		114,
		76,
		111,
		111,
		112,
		8,
		5,
		32,
		0,
		132,
		0,
		25,
		1,
		11,
		102,
		111,
		114,
		101,
		97,
		99,
		104,
		76,
		111,
		111,
		112
	})]
	public class C#Loops : ScalaObject
	{
		[Symtab]
		public sealed class $anonfun$forLoop$1 : AbstractFunction1$mcVI$sp, Serializable
		{
			public sealed override void apply(int i)
			{
				this.apply$mcVI$sp(i);
			}
			public override void apply$mcVI$sp(int v1)
			{
				Predef$.MODULE$.println(v1);
			}
			public sealed override object apply(object v1)
			{
				this.apply(Convert.ToInt32(v1));
				return BoxedUnit.UNIT;
			}
			public $anonfun$forLoop$1(Day1Code $outer)
			{
			}
		}
		[Symtab]
		public sealed class $anonfun$foreachLoop$1 : AbstractFunction1$mcVL$sp, Serializable
		{
			public sealed override void apply(string arg)
			{
				Predef$.MODULE$.println(arg);
			}
			public sealed override object apply(object v1)
			{
				this.apply((string)v1);
				return BoxedUnit.UNIT;
			}
			public sealed override void apply(object v1)
			{
				this.apply((string)v1);
			}
			public $anonfun$foreachLoop$1(Day1Code $outer)
			{
			}
		}
		public override void whileLoop()
		{
			for (int i = 0; i < 5; i++)
			{
				Predef$.MODULE$.println(i);
			}
		}
		public override void forLoop()
		{
			Predef$.MODULE$.println("this is a for loop");
			Predef$.MODULE$.intWrapper(1).until(10).foreach$mVc$sp(new Day1Code.$anonfun$forLoop$1(this));
		}
		public override void foreachLoop()
		{
			Predef$.MODULE$.println("this is a foreach");
			string[] args = (string[])((object[])new string[]
			{
				"hi",
				"hey"
			});
			Predef$.MODULE$.refArrayOps((object[])args).@foreach(new Day1Code.$anonfun$foreachLoop$1(this));
		}
	}
}
