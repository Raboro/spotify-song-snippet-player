package io.github.raboro.spotifysongsnippetplayer.ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;

/**
 * @author Marius Wörfel
 */
class SettingsLabel extends JLabel {

    SettingsLabel(MouseAdapter adapter) {
        super(new ImageIcon("assets/settingsIcon.png"));
        setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 10));
        addMouseListener(adapter);
    }
}
