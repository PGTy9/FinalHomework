/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.performanceExamine;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author follow
 */
public class ShowGifPanel extends JPanel{
    private Image[] images = new Image[2];
    int currentImage=0;
    int totalImages=2;
    private String message;
    public ShowGifPanel(String message){
        JFrame frame = new JFrame("工作未达标");
        this.message = message;
        for(int i = 0; i < 2; i++){
            try {
                String name = "./" + (i + 1) + ".png";
                images[i] = ImageIO.read(ShowGifPanel.class.getResourceAsStream(name));
            } catch (IOException ex) {
                Logger.getLogger(ShowGifPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawString(message, 120, 120);
        g.drawImage(images[currentImage],150,150,this);
        currentImage=++currentImage%totalImages;
        try{
             Thread.sleep(50);
        }catch(InterruptedException e){
            
        }
        repaint();
    }
    
    public static void main(String[] args) throws IOException {
        ShowGifPanel panel = new ShowGifPanel("123"); 
    }
}
