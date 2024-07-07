import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfInfo(name = "aw")
public final class Class23 implements Class230, MouseWheelListener {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 747311249)
	public int field113;

	public Class23() {
		this.field113 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Ljava/awt/Component;B)V")
	public void method307(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfInfo(name = "ad", desc = "(Ljava/awt/Component;I)V")
	public void method308(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field113 += var1.getWheelRotation();
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public synchronized int method310() {
		int var2 = this.field113;
		this.field113 = 0;
		return var2;
	}
}
