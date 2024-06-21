import io.runebox.ObfInfo;

@ObfInfo(name = "ez")
public class Class130 {
	@ObfInfo(name = "at", desc = "[F")
	public static float[] field1540;
	@ObfInfo(name = "aa", desc = "[F")
	public static float[] field1545;
	@ObfInfo(name = "az", desc = "F")
	public static final float field1542;
	@ObfInfo(name = "af", desc = "F")
	public static final float field1543;

	static {
		field1542 = Math.ulp(1.0F);
		field1543 = 2.0F * field1542;
		field1545 = new float[4];
		field1540 = new float[5];
	}
}
