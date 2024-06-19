import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class Class9 implements Class173, MouseWheelListener {
	public int field49;

	public Class9() {
		this.field49 = 0;
	}

	public void method130(Component var1) {
		var1.addMouseWheelListener(this);
	}

	public void method132(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field49 += var1.getWheelRotation();
	}

	public synchronized int method134() {
		int var2 = this.field49;
		this.field49 = 0;
		return var2;
	}
}
