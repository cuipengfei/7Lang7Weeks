using scala;
using scala.collection;
using scala.collection.immutable;
using scala.runtime;
using System;
namespace Day2.FP
{
	[Symtab(new byte[]
	{
		5,
		0,
		31,
		6,
		4,
		1,
		2,
		0,
		7,
		2,
		7,
		83,
		99,
		97,
		108,
		97,
		70,
		80,
		10,
		2,
		3,
		4,
		1,
		2,
		70,
		80,
		10,
		1,
		5,
		1,
		4,
		68,
		97,
		121,
		50,
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
		5,
		26,
		0,
		132,
		0,
		27,
		1,
		6,
		116,
		101,
		115,
		116,
		70,
		80,
		21,
		1,
		28,
		16,
		2,
		15,
		29,
		9,
		2,
		30,
		16,
		2,
		4,
		85,
		110,
		105,
		116
	})]
	public class ScalaFP : ScalaObject
	{
		[Symtab]
		public sealed class $anonfun$testFP$1 : AbstractFunction1$mcZL$sp, Serializable
		{
			public sealed override bool apply(string item)
			{
				return item.Length > 4;
			}
			public sealed override object apply(object v1)
			{
				return this.apply((string)v1);
			}
			public sealed override bool apply(object v1)
			{
				return this.apply((string)v1);
			}
			public $anonfun$testFP$1(ScalaFP $outer)
			{
			}
		}
		public override void testFP()
		{
			List myList = List$.MODULE$.apply(Predef$.MODULE$.wrapRefArray((object[])new string[]
			{
				"str1",
				"str2",
				"third string",
				"fourth string"
			}));
			((TraversableLike)myList).filter(new ScalaFP.$anonfun$testFP$1(this));
		}
	}
}
