/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivaafoundation.javatutorial;
import java.awt.*;
import java.applet.Applet;
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("A simple Applet",20,20);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
