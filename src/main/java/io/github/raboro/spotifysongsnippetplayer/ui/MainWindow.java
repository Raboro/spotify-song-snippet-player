package io.github.raboro.spotifysongsnippetplayer.ui;

import javax.swing.*;

/**
 * @author Marius Wörfel
 */
public class MainWindow extends JFrame {

    public MainWindow() {
        super("Spotify Song Snippet Player");
        setLookAndFeel();
        this.setSize(900, 700);
        this.setLocationRelativeTo(null); // center
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        } catch (InstantiationException e) {
            System.out.println("Instantiation issue");
        } catch (IllegalAccessException e) {
            System.out.println("Could not be accessed");
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Look and feel is not supported");
        }
    }
}
