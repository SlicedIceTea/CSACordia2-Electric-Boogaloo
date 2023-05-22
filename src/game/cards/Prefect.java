package src.game.cards;

//  imports
import src.game.cards.godtype.Satvrnvs;
import src.game.Player;

import java.awt.Graphics;

public class Prefect extends PersonalityCard implements Satvrnvs {
   public final CardImage IMAGE = CardImage.PREFECT;
   
   public Prefect(Player myPlayer, int winePrice) {
      super(myPlayer, 0, 0, 0, winePrice, 0, 2);
   }
   
   @Override
   public void doAction() {
      //TO DO
      //Add Production Bonus
      //Produce chosen province
      setPlayed(true);
   }
   
   @Override
   public int calculatePoints() {
      return getVictoryMultiplier() * scorePoints();
   }
   
   @Override
   public void update() {
      
   }
   
   @Override
   public void draw(Graphics g) {
      
   }
   
   @Override
   public Player getPlayer() {
      return super.getMyPlayer();
   }
}