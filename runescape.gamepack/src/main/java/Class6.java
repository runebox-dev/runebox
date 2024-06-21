import io.runebox.ObfInfo;

@ObfInfo(name = "af")
public final class Class6 {
	@ObfInfo(desc = "(LClass20;)LClass26;")
	public static Class26 method7379(Class20 var0) {
		switch(var0.field99) {
		case 0:
			return new Class11();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "ak", desc = "(IB)I", opaque = "1")
	public static int method73(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
