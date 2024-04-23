package top.icewolf.GUI;

import top.icewolf.medium.GUI.GUIActionListener;
import top.icewolf.medium.GUI.GUIKeyListener;
import top.icewolf.medium.GUI.GUIMouseListener;

public class TestGUIListener {
    public static void main(String[] args) {
        final GUIActionListener guiActionListener = new GUIActionListener();
//        guiActionListener.start();

        GUIKeyListener guiKeyListener = new GUIKeyListener();
//        guiKeyListener.start();

        GUIMouseListener guiMouseListener = new GUIMouseListener();
        guiMouseListener.start();
    }
}
