package io.github.raboro.spotifysongsnippetplayer.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Marius Wörfel
 */
public class MainWindow extends JFrame {

    private static final Logger LOGGER = LogManager.getLogger(MainWindow.class);
    private final JPanel mainPanel;

    public MainWindow() {
        super("Spotify Song Snippet Player");
        setLookAndFeel();
        this.setSize(900, 700);
        this.setLocationRelativeTo(null); // center
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPanel = new JPanel(new BorderLayout());
        this.add(mainPanel);
        addContent();
        this.setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            LOGGER.error("Class was not found");
        } catch (InstantiationException e) {
            LOGGER.error("Instantiation issue");
        } catch (IllegalAccessException e) {
            LOGGER.error("Could not be accessed");
        } catch (UnsupportedLookAndFeelException e) {
            LOGGER.error("Look and feel is not supported");
        }
    }

    private void addContent() {
        mainPanel.add(constructSettingsElement(), BorderLayout.NORTH);
        mainPanel.add(new InputComponent(), BorderLayout.CENTER);
    }

    private Component constructSettingsElement() {
        final JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(new SettingsLabel(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LOGGER.info(e);
            }
        }));
        return panel;
    }
}
