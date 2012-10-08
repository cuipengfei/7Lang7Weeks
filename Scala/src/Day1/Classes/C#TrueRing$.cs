using scala;
using scala.runtime;
using System;
namespace Day1.Classes
{
	[Symtab]
	public sealed class ScalaTrueRing$ : ScalaObject
	{
		public static ScalaTrueRing$ MODULE$;
		public override void rule()
		{
			Predef$.MODULE$.println("To rule them all");
		}
		private ScalaTrueRing$()
		{
			ScalaTrueRing$.MODULE$ = this;
		}
		static ScalaTrueRing$()
		{
			new ScalaTrueRing$();
		}
	}
}
