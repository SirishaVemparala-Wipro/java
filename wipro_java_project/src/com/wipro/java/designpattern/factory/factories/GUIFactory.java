package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.buttons.Button;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}