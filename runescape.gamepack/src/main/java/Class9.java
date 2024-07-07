import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfInfo(name = "ai")
public final class Class9 implements Class173, MouseWheelListener {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -163388389)
	public int field49;

	public Class9() {
		this.field49 = 0;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/awt/Component;I)V")
	public void method130(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfInfo(name = "al", desc = "(Ljava/awt/Component;I)V")
	public void method132(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field49 += var1.getWheelRotation();
	}

	@ObfInfo(name = "aj", desc = "(B)I")
	public synchronized int method134() {
		int var2 = this.field49;
		this.field49 = 0;
		return var2;
	}
}
