import io.runebox.ObfInfo;

@ObfInfo(name = "sy")
public class Class493 {
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1340799213)
	public int field5027;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1708643547)
	public int field5028;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 982727179)
	public int field5029;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 271674167)
	public int field5030;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1448669761)
	public int field5031;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1940473067)
	public int field5032;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -161342641)
	public int field5033;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 956929989)
	public int field5034;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1408313799)
	public int field5035;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1250608515)
	public int field5036;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1621222091)
	public int field5037;

	public Class493() {
		this.field5036 = -1;
		this.field5028 = -1;
		this.field5029 = -1;
		this.field5030 = -1;
		this.field5027 = -1;
		this.field5032 = -1;
		this.field5033 = -1;
		this.field5034 = -1;
		this.field5031 = -1;
		this.field5035 = -1;
		this.field5037 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lok;B)V", opaque = "1")
	public void method8831(Class375 var1) {
		byte[] var3 = var1.method7139(Class491.field5020.field5021);
		Class562 var4 = new Class562(var3);

		while (true) {
			int var5 = var4.method9902();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.method9830();
				break;
			case 2:
				this.field5036 = var4.method9871();
				this.field5028 = var4.method9871();
				this.field5029 = var4.method9871();
				this.field5030 = var4.method9871();
				this.field5027 = var4.method9871();
				this.field5032 = var4.method9871();
				this.field5033 = var4.method9871();
				this.field5034 = var4.method9871();
				this.field5031 = var4.method9871();
				this.field5035 = var4.method9871();
				this.field5037 = var4.method9871();
			}
		}
	}
}
