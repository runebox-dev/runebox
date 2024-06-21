import io.runebox.ObfInfo;

@ObfInfo(name = "nu")
public class Class359 {
	@ObfInfo(desc = "(III)I")
	public static int method5914(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}
}
