public class Class390 implements Class393 {
	public static final Class390 field4544;
	public static final Class390 field4545;
	public static final Class390 field4546;
	public static final Class390 field4547;
	public static final Class390 field4548;
	public static final Class390 field4549;
	public final int field4551;
	public final String field4550;

	static {
		field4547 = new Class390("runescape", "RuneScape", 0);
		field4545 = new Class390("stellardawn", "Stellar Dawn", 1);
		field4544 = new Class390("game3", "Game 3", 2);
		field4546 = new Class390("game4", "Game 4", 3);
		field4548 = new Class390("game5", "Game 5", 4);
		field4549 = new Class390("oldscape", "RuneScape 2007", 5);
	}

	public Class390(String var1, String var2, int var3) {
		this.field4550 = var1;
		this.field4551 = var3;
	}

	public int method175() {
		return this.field4551;
	}

	public static Class390[] method6653() {
		return new Class390[]{field4546, field4548, field4549, field4544, field4545, field4547};
	}
}
