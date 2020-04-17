import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Game{
	private List<Object>lists;
	public List<Object>getLists(){
		return lists;
	}
	public void setLists(List<Object>lists){
		this.lists=lists;
	}
	public String toString(){
		return lists.toString();
	}
	public String getRandomElement() 
    { 
        Random rand = new Random(); 
       int indx =rand.nextInt(lists.size()); 
        String rendv= lists.get(indx).toString();
        return rendv;
    } 
	public void battle() {
		
		String player1=getRandomElement(),player2=getRandomElement(),player3=getRandomElement(),player4=getRandomElement();
		System.out.println("player1->"+player1+"\tplayer2->"+player2+"\tplayer3->"+player3+"\tplayer4->"+player4);
		
		if(player1.equals("ROCK") && player2.equals("PAPER")||player1.equals("SCISSOR") && player2.equals("ROCK")||player1.equals("PAPER") && player2.equals("SCISSOR") ){
			System.out.print("player2 over player1 \t");
		}
		else if(player1.equals("PAPER") && player2.equals("ROCK")||player1.equals("ROCK") && player2.equals("SCISSOR")||player1.equals("SCISSOR") && player2.equals("PAPER") ){
		System.out.print("player1 over player2 \t");
		}
		if(player1.equals("ROCK") && player3.equals("PAPER")||player1.equals("SCISSOR") && player3.equals("ROCK")||player1.equals("PAPER") && player3.equals("SCISSOR") ){
			System.out.print("player3 over player1 \t");
		}
		else if(player1.equals("PAPER") && player3.equals("ROCK")||player1.equals("ROCK") && player3.equals("SCISSOR")||player1.equals("SCISSOR") && player3.equals("PAPER") ){
		System.out.print("player1 over player3 \t");
		}
		if(player1.equals("ROCK") && player4.equals("PAPER")||player1.equals("SCISSOR") && player4.equals("ROCK")||player1.equals("PAPER") && player4.equals("SCISSOR") ){
			System.out.print("player4 over player1\t");
		}
		else if(player1.equals("PAPER") && player4.equals("ROCK")||player1.equals("ROCK") && player4.equals("SCISSOR")||player1.equals("SCISSOR") && player4.equals("PAPER") ){
		System.out.print("player1 over player4 \t");
		}
		if(player2.equals("ROCK") && player3.equals("PAPER")||player2.equals("SCISSOR") && player3.equals("ROCK")||player2.equals("PAPER") && player3.equals("SCISSOR") ){
			System.out.print("player3 over player2 \t");
		}
		else if(player2.equals("PAPER") && player3.equals("ROCK")||player2.equals("ROCK") && player3.equals("SCISSOR")||player2.equals("SCISSOR") && player3.equals("PAPER") ){
		System.out.print("player2 over player3 \t");
		}
		if(player2.equals("ROCK") && player4.equals("PAPER")||player2.equals("SCISSOR") && player4.equals("ROCK")||player2.equals("PAPER") && player4.equals("SCISSOR") ){
			System.out.print("player4 over player2 \t");
		}
		else if(player2.equals("PAPER") && player4.equals("ROCK")||player2.equals("ROCK") && player4.equals("SCISSOR")||player2.equals("SCISSOR") && player4.equals("PAPER") ){
		System.out.print("player2 over player4 \t");
		}
		if(player3.equals("ROCK") && player4.equals("PAPER")||player3.equals("SCISSOR") && player4.equals("ROCK")||player3.equals("PAPER") && player4.equals("SCISSOR") ){
			System.out.print("player4 over player3 \t");
		}
		else if(player3.equals("PAPER") && player4.equals("ROCK")||player3.equals("ROCK") && player4.equals("SCISSOR")||player3.equals("SCISSOR") && player4.equals("PAPER") ){
		System.out.print("player3 over player4 \t");
		}
	}
}