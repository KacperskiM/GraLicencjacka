package pl.edu.uksw.kacperski.marcin.gralicencjacka.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import pl.edu.uksw.kacperski.marcin.gralicencjacka.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = MyGame.gameName;
		config.width = 1280;
		config.height = 720;
		config.resizable=false;
		new LwjglApplication(new MyGame(), config);
	}
}
