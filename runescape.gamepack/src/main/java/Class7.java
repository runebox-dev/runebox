import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Class7 implements KeyListener, FocusListener {
	@ObfInfo(name = "az", desc = "[Lbi;")
	public Class35[] field32;
	@ObfInfo(name = "af", desc = "[Z")
	public boolean[] field35;
	@ObfInfo(name = "aj", desc = "Ljava/util/Collection;")
	public Collection field33;
	@ObfInfo(name = "al", desc = "Ljava/util/Collection;")
	public Collection field34;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -39112623)
	public volatile int field38;

	public Class7() {
		this.field32 = new Class35[3];
		this.field35 = new boolean[112];
		this.field38 = 0;
		this.field34 = new ArrayList(100);
		this.field33 = new ArrayList(100);
	}

	@ObfInfo(name = "ak", desc = "(Lbi;II)V")
	public void method75(Class35 var1, int var2) {
		this.field32[var2] = var1;
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method74() {
		return this.field38;
	}

	@ObfInfo(name = "aj", desc = "(Ljava/awt/Component;B)V")
	public void method79(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfInfo(name = "az", desc = "(Ljava/awt/Component;B)V")
	public synchronized void method84(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field34.add(new Class38(4, 0));
		}
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "842468444")
	public void method94() {
		++this.field38;
		this.method77();
		Iterator var2 = this.field33.iterator();

		while (var2.hasNext()) {
			Class38 var3 = (Class38)var2.next();

			for (int var4 = 0; var4 < this.field32.length && !var3.method784(this.field32[var4]); ++var4) {
			}
		}

		this.field33.clear();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label26: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class41.field296.length;
				if (var2 < var4) {
					var2 = Class41.method9254(var2);
					if (Class41.method6495(var2)) {
						var2 = -1;
					}
					break label26;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.field35[var2]) {
				this.field38 = 0;
			}

			this.field35[var2] = true;
			this.field34.add(new Class38(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label18: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class41.field296.length;
				if (var2 < var4) {
					var2 = Class41.method9254(var2) & -129;
					break label18;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field35[var2] = false;
			this.field34.add(new Class38(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && Class405.method1082(var2)) {
			this.field34.add(new Class38(3, var2));
		}

		var1.consume();
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	public synchronized void method77() {
		Collection var2 = this.field33;
		this.field33 = this.field34;
		this.field34 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field34.add(new Class38(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field35[var2]) {
				this.field35[var2] = false;
				this.field34.add(new Class38(2, var2));
			}
		}

		this.field34.add(new Class38(4, 0));
	}

	@ObfInfo(name = "mn", desc = "(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	public static void method93(String var0, String var1, int var2, int var3, int var4, int var5) {
		Client.method3958(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
