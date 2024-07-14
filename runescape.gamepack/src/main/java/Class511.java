import io.runebox.ObfInfo;

@ObfInfo(name = "tq")
public abstract class Class511 {
	@ObfInfo(name = "ai", desc = "D")
	public double field5107;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1131756953)
	public int field5106;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -932997329)
	public int field5108;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -386333095)
	public int field5109;

	public Class511(int var1, int var2) {
		this.field5106 = 0;
		this.field5108 = 0;
		this.field5107 = 0.0D;
		this.field5109 = 0;
		this.field5106 = var1;
		this.field5108 = 0;
		this.field5109 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5107 = method8475(this.field5108, this.field5106, this.field5109);
	}

	@ObfInfo(name = "ai", desc = "(I)V", opaque = "2140407549")
	public void method9006() {
		if (this.field5108 < this.field5106) {
			++this.field5108;
			this.field5107 = method8475(this.field5108, this.field5106, this.field5109);
		}

	}

	@ObfInfo(name = "ae", desc = "(I)D")
	public double method9003() {
		return this.field5107;
	}

	@ObfInfo(owner = "rw", name = "au", desc = "(IIIB)D", opaque = "4")
	public static double method8475(int var0, int var1, int var2) {
		double var4 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var4 > 0.0D && var4 < 1.0D) {
			double var6;
			double var8;
			switch(var2) {
			case 0:
				return var4;
			case 1:
				return 1.0D - Math.cos(var4 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var4 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var4 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var4 * var4;
			case 5:
				return 1.0D - (1.0D - var4) * (1.0D - var4);
			case 6:
				return var4 < 0.5D ? var4 * 2.0D * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var4 * var4 * var4;
			case 8:
				return 1.0D - Math.pow(1.0D - var4, 3.0D);
			case 9:
				return var4 < 0.5D ? var4 * 4.0D * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 3.0D) / 2.0D;
			case 10:
				return var4 * var4 * var4 * var4;
			case 11:
				return 1.0D - Math.pow(1.0D - var4, 4.0D);
			case 12:
				return var4 < 0.5D ? var4 * 8.0D * var4 * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var4 * var4 * var4 * var4 * var4;
			case 14:
				return 1.0D - Math.pow(1.0D - var4, 5.0D);
			case 15:
				return var4 < 0.5D ? var4 * 8.0D * var4 * var4 * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, var4 * 10.0D - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var4 * -10.0D);
			case 18:
				return var4 < 0.5D ? Math.pow(2.0D, var4 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var4 * -20.0D + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var4, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var4 - 1.0D, 2.0D));
			case 21:
				return var4 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var4 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var4 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return var4 * 2.70158D * var4 * var4 - var4 * 1.70158D * var4;
			case 23:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var4 - 1.0D, 3.0D) + 1.70158D * Math.pow(var4 - 1.0D, 2.0D);
			case 24:
				var6 = 1.70158D;
				var8 = 2.5949095D;
				return var4 < 0.5D ? Math.pow(var4 * 2.0D, 2.0D) * (var4 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var4 * 2.0D - 2.0D, 2.0D) * ((var4 * 2.0D - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				var6 = 2.0943951023931953D;
				return -Math.pow(2.0D, var4 * 10.0D - 10.0D) * Math.sin((var4 * 10.0D - 10.75D) * 2.0943951023931953D);
			case 26:
				var6 = 2.0943951023931953D;
				return Math.pow(2.0D, var4 * -10.0D) * Math.sin((var4 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var6 = 1.3962634015954636D;
				var8 = Math.sin((var4 * 20.0D - 11.125D) * 1.3962634015954636D);
				return var4 < 0.5D ? -(Math.pow(2.0D, var4 * 20.0D - 10.0D) * var8) / 2.0D : Math.pow(2.0D, var4 * -20.0D + 10.0D) * var8 / 2.0D + 1.0D;
			default:
				return var4;
			}
		} else {
			return var4 <= 0.0D ? 0.0D : 1.0D;
		}
	}
}
