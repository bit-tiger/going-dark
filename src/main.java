import static org.lwjgl.glfw.GLFW.*;

public class main {
	
	public main () {
		if (glfwInit () != true) {
			System.err.println("glfw failed to initalize");
			System.exit(1);
		}

		long win = glfwCreateWindow (600, 500, "test", 0, 0);

		glfwShowWindow(win);

		while (glfwWindowShouldClose (win) != true) {
			glfwPollEvents ();
		}
		glfwTerminate();
	}
	public static void main(String[] args) {
		new main ();
	}
}