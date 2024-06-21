import io.runebox.ObfInfo;
import java.util.HashSet;
import java.util.Set;

public class Class395 implements Class393 {
	@ObfInfo(name = "ak", desc = "Lpe;")
	public static final Class395 field4567;
	@ObfInfo(name = "aj", desc = "Lpe;")
	public static final Class395 field4568;
	@ObfInfo(name = "az", desc = "Lpe;")
	public static final Class395 field4570;
	@ObfInfo(name = "af", desc = "Lpe;")
	public static final Class395 field4571;
	@ObfInfo(name = "aa", desc = "Lpe;")
	public static final Class395 field4572;
	@ObfInfo(name = "at", desc = "Lpe;")
	public static final Class395 field4573;
	@ObfInfo(name = "ab", desc = "Lpe;")
	public static final Class395 field4574;
	@ObfInfo(name = "ac", desc = "Lpe;")
	public static final Class395 field4575;
	@ObfInfo(name = "ao", desc = "Lpe;")
	public static final Class395 field4576;
	@ObfInfo(name = "ah", desc = "Lpe;")
	public static final Class395 field4577;
	@ObfInfo(name = "av", desc = "Lpe;")
	public static final Class395 field4578;
	@ObfInfo(name = "aq", desc = "Lpe;")
	public static final Class395 field4579;
	@ObfInfo(name = "al", desc = "Lpe;")
	public static final Class395 field4584;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -478390221)
	public final int field4580;
	@ObfInfo(name = "ae", desc = "Ljava/util/Set;")
	public final Set field4581;

	static {
		field4567 = new Class395("", 0, new Class391[]{Class391.field4556, Class391.field4557});
		field4584 = new Class395("", 1, new Class391[]{Class391.field4553, Class391.field4556, Class391.field4557});
		field4568 = new Class395("", 2, new Class391[]{Class391.field4553, Class391.field4554, Class391.field4556});
		field4570 = new Class395("", 3, new Class391[]{Class391.field4553});
		field4571 = new Class395("", 4);
		field4572 = new Class395("", 5, new Class391[]{Class391.field4553, Class391.field4556});
		field4573 = new Class395("", 6, new Class391[]{Class391.field4556});
		field4574 = new Class395("", 8, new Class391[]{Class391.field4553, Class391.field4556});
		field4575 = new Class395("", 9, new Class391[]{Class391.field4553, Class391.field4554});
		field4576 = new Class395("", 10, new Class391[]{Class391.field4553});
		field4577 = new Class395("", 11, new Class391[]{Class391.field4553});
		field4578 = new Class395("", 12, new Class391[]{Class391.field4553, Class391.field4556});
		field4579 = new Class395("", 13, new Class391[]{Class391.field4553});
		method7414();
	}

	public Class395(String var1, int var2) {
		this.field4581 = new HashSet();
		this.field4580 = var2;
	}

	public Class395(String var1, int var2, Class391[] var3) {
		this.field4581 = new HashSet();
		this.field4580 = var2;

		for (int var5 = 0; var5 < var3.length; ++var5) {
			Class391 var6 = var3[var5];
			this.field4581.add(var6);
		}

	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field4580;
	}

	@ObfInfo(name = "az", desc = "(B)[Lpe;")
	public static Class395[] method7414() {
		return new Class395[]{field4579, field4568, field4570, field4573, field4584, field4571, field4574, field4572, field4567, field4577, field4576, field4578, field4575};
	}
}
