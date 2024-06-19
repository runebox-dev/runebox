import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Class13 extends Canvas {
	public Component field56;

	public Class13(Component var1) {
		this.field56 = var1;
	}

	public final void update(Graphics var1) {
		this.field56.update(var1);
	}

	public final void paint(Graphics var1) {
		this.field56.paint(var1);
	}

	public static void method163(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < Client.field701; ++var5) {
			if (Client.field708[var5] + Client.field722[var5] > var0 && Client.field722[var5] < var2 + var0 && Client.field707[var5] + Client.field757[var5] > var1 && Client.field707[var5] < var3 + var1) {
				Client.field704[var5] = true;
			}
		}

	}
}
