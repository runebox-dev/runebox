import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(name = "ar")
public class Class18 implements KeyListener, FocusListener {
	@ObfInfo(name = "ak", desc = "[Lbm;")
	public Class39[] field85;
	@ObfInfo(name = "ap", desc = "[Z")
	public boolean[] field89;
	@ObfInfo(name = "ad", desc = "Ljava/util/Collection;")
	public Collection field83;
	@ObfInfo(name = "ag", desc = "Ljava/util/Collection;")
	public Collection field84;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 331983769)
	public volatile int field87;

	public Class18() {
		this.field85 = new Class39[3];
		this.field89 = new boolean[112];
		this.field87 = 0;
		this.field83 = new ArrayList(100);
		this.field84 = new ArrayList(100);
	}

	@ObfInfo(name = "aq", desc = "(Lbm;II)V")
	public void method228(Class39 var1, int var2) {
		this.field85[var2] = var1;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method229() {
		return this.field87;
	}

	@ObfInfo(name = "ag", desc = "(Ljava/awt/Component;B)V")
	public void method252(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/awt/Component;I)V")
	public synchronized void method231(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field83.add(new Class33(4, 0));
		}
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaque = "-1577642894")
	public void method262() {
		++this.field87;
		this.method233();
		Iterator var2 = this.field84.iterator();

		while (var2.hasNext()) {
			Class33 var3 = (Class33)var2.next();

			for (int var4 = 0; var4 < this.field85.length && !var3.method445(this.field85[var4]); ++var4) {
			}
		}

		this.field84.clear();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label30: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class31.field155.length;
				if (var2 < var4) {
					int var5 = Class31.field155[var2];
					var2 = var5;
					boolean var6 = 0 != (var5 & 128);
					if (var6) {
						var2 = -1;
					}
					break label30;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.field89[var2]) {
				this.field87 = 0;
			}

			this.field89[var2] = true;
			this.field83.add(new Class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label18: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class31.field155.length;
				if (var2 < var4) {
					int var5 = Class31.field155[var2];
					var2 = var5 & -129;
					break label18;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field89[var2] = false;
			this.field83.add(new Class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && Class411.method6424(var2)) {
			this.field83.add(new Class33(3, var2));
		}

		var1.consume();
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public synchronized void method233() {
		Collection var2 = this.field84;
		this.field84 = this.field83;
		this.field83 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field83.add(new Class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field89[var2]) {
				this.field89[var2] = false;
				this.field83.add(new Class33(2, var2));
			}
		}

		this.field83.add(new Class33(4, 0));
	}
}
