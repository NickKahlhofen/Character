/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Nick
 */
class CharacterEnvironment extends Environment {
    
    private Squirtle squirtleBig, squirtleSmall;

    public CharacterEnvironment() {
        squirtleBig = new Squirtle(100, 100, 400, 400);
        squirtleSmall = new Squirtle(600, 100, 200, 200);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) { 
        if (squirtleBig != null) {
            squirtleBig.draw(graphics);
        }
        if (squirtleSmall != null) {
            squirtleSmall.draw(graphics);
        }
    }
   
   
    
}
