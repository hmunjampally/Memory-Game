package memory.game.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import memory.game.NumberGame;
import memory.game.view.HomePage;

public class HomePageController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event)
    {
        JButton eventListen = (JButton)event.getSource();
        if(eventListen == new HomePage().getButton1())
        {
            NumberGame game = new NumberGame(0, 0);
        }
        else if(eventListen == new HomePage().getButton2())
        {
            //todo
            
        }
        else if(eventListen == new HomePage().getButton2())
        {
            //todo
            
        }
    }
}
