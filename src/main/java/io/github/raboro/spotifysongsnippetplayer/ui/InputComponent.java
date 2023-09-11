package io.github.raboro.spotifysongsnippetplayer.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Marius Wörfel
 */
class InputComponent extends JPanel {

    private final JPanel innerPanel;

    InputComponent() {
        super(new GridBagLayout());
        add(createDescription());
        innerPanel = new JPanel();
        constructInnerPanel();
        final GridBagConstraints gbc = constructGridBagConstraints();
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(innerPanel, gbc);
        gbc.gridy = 2;
        add(new JButton("Submit"), gbc);
    }

    private Component createDescription() {
        final JLabel description = new JLabel("Insert time with HH:MM:SS.");
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        return description;
    }

    private void constructInnerPanel() {
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.X_AXIS));
        innerPanel.add(createTextField("Start of Snippet"));
        innerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        innerPanel.add(createTextField("End of Snippet"));
    }

    private Component createTextField(String text) {
        final JTextField field = new JTextField(10);
        field.setText(text);
        field.setMaximumSize(new Dimension(200, 20));
        return field;
    }

    private GridBagConstraints constructGridBagConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        return gbc;
    }
}
