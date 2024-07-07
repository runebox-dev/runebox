import io.runebox.ObfInfo;
import java.util.HashSet;
import java.util.Set;

@ObfInfo(name = "pl")
public class Class402 implements Class393 {
	@ObfInfo(name = "ap", desc = "Lpl;")
	public static final Class402 field4627;
	@ObfInfo(name = "aq", desc = "Lpl;")
	public static final Class402 field4628;
	@ObfInfo(name = "ag", desc = "Lpl;")
	public static final Class402 field4629;
	@ObfInfo(name = "ak", desc = "Lpl;")
	public static final Class402 field4630;
	@ObfInfo(name = "ad", desc = "Lpl;")
	public static final Class402 field4631;
	@ObfInfo(name = "an", desc = "Lpl;")
	public static final Class402 field4632;
	@ObfInfo(name = "ab", desc = "Lpl;")
	public static final Class402 field4634;
	@ObfInfo(name = "ai", desc = "Lpl;")
	public static final Class402 field4636;
	@ObfInfo(name = "ae", desc = "Lpl;")
	public static final Class402 field4637;
	@ObfInfo(name = "au", desc = "Lpl;")
	public static final Class402 field4638;
	@ObfInfo(name = "ah", desc = "Lpl;")
	public static final Class402 field4639;
	@ObfInfo(name = "av", desc = "Lpl;")
	public static final Class402 field4642;
	@ObfInfo(name = "aj", desc = "Lpl;")
	public static final Class402 field4643;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -855908523)
	public final int field4640;
	@ObfInfo(name = "ax", desc = "Ljava/util/Set;")
	public final Set field4641;

	static {
		field4628 = new Class402("", 0, new Class398[]{Class398.field4615, Class398.field4617});
		field4631 = new Class402("", 1, new Class398[]{Class398.field4616, Class398.field4615, Class398.field4617});
		field4629 = new Class402("", 2, new Class398[]{Class398.field4616, Class398.field4614, Class398.field4615});
		field4630 = new Class402("", 3, new Class398[]{Class398.field4616});
		field4627 = new Class402("", 4);
		field4632 = new Class402("", 5, new Class398[]{Class398.field4616, Class398.field4615});
		field4643 = new Class402("", 6, new Class398[]{Class398.field4615});
		field4642 = new Class402("", 8, new Class398[]{Class398.field4616, Class398.field4615});
		field4634 = new Class402("", 9, new Class398[]{Class398.field4616, Class398.field4614});
		field4636 = new Class402("", 10, new Class398[]{Class398.field4616});
		field4637 = new Class402("", 11, new Class398[]{Class398.field4616});
		field4638 = new Class402("", 12, new Class398[]{Class398.field4616, Class398.field4615});
		field4639 = new Class402("", 13, new Class398[]{Class398.field4616});
		method7470();
	}

	public Class402(String var1, int var2) {
		this.field4641 = new HashSet();
		this.field4640 = var2;
	}

	public Class402(String var1, int var2, Class398[] var3) {
		this.field4641 = new HashSet();
		this.field4640 = var2;

		for (int var5 = 0; var5 < var3.length; ++var5) {
			Class398 var6 = var3[var5];
			this.field4641.add(var6);
		}

	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field4640;
	}

	@ObfInfo(name = "ag", desc = "(B)[Lpl;")
	public static Class402[] method7470() {
		return new Class402[]{field4636, field4643, field4634, field4642, field4637, field4628, field4631, field4630, field4632, field4629, field4639, field4627, field4638};
	}

	@ObfInfo(name = "an", desc = "(Lok;Ljava/lang/String;Ljava/lang/String;I)Lvv;", opaque = "1458197717")
	public static Class568 method7469(Class375 var0, String var1, String var2) {
		if (!var0.method7137(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method7150(var1);
			int var5 = var0.method7209(var4, var2);
			Class568 var6;
			if (!Class554.method3253(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = Class554.method3374();
			}

			return var6;
		}
	}
}
