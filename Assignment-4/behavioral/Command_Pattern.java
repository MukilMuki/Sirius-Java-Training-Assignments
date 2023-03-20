package day_4.behavioral;

public class Command_Pattern {
	public static void main(String[] args) {
		TV tv=new TV();
		SetTopBox setTopBox=new SetTopBox();
		VGame vGame=new VGame();
		SoundSystem soundSystem=new SoundSystem();
		
		GenieRemote mygenie=new GenieRemote();
		
		mygenie.setCommand(1, new NewsCommand(tv, setTopBox, soundSystem, vGame));
		mygenie.setCommand(2, new SerialCommand(tv, setTopBox, soundSystem, vGame));
		mygenie.setCommand(3, new VGameCommandArchery(tv, setTopBox, soundSystem, vGame));
		mygenie.setCommand(4, new VGameCommandTT(tv, setTopBox, soundSystem, vGame));
		
		mygenie.executeCommand(1);
		
	}
}
class GenieRemote{
	Command c[]=new Command[5];
	
	public GenieRemote() {
		for(int i=0;i<c.length;i++) {
			c[i]=new Command() {				
				@Override
				public void execute() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}
	
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	public void setCommand(int slot,Command cc) {
		c[slot]=cc;
	}
}
abstract class Command{
	TV tv;SetTopBox setTopBox;SoundSystem soundSystem;VGame vGame;
	public abstract void execute();
}
class NewsCommand extends Command{
	
	public NewsCommand(TV tv,SetTopBox setTopBox,SoundSystem soundSystem,VGame vGame) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.soundSystem=soundSystem;
		this.vGame=vGame;
	}
	@Override
	public void execute() {
		System.out.println("news command initiated....");
		tv.av1Mode();
		setTopBox.newsChannel();
		soundSystem.lowVolume();
		System.out.println("news channel started....");
	}
}
class SerialCommand extends Command{
	public SerialCommand(TV tv,SetTopBox setTopBox,SoundSystem soundSystem,VGame vGame) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.soundSystem=soundSystem;
		this.vGame=vGame;
	}
	@Override
	public void execute() {
		System.out.println("serial command initiated....");
		tv.av1Mode();
		setTopBox.serialChannel();
		soundSystem.highVolume();
		System.out.println("serial channel started....");
	}
}
class VGameCommandTT extends Command{
	public VGameCommandTT(TV tv,SetTopBox setTopBox,SoundSystem soundSystem,VGame vGame) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.soundSystem=soundSystem;
		this.vGame=vGame;
	}
	@Override
	public void execute() {
		System.out.println("vgame tt command initiated....");
		tv.av2Mode();
		vGame.ttGame();
		soundSystem.lowVolume();
		System.out.println("vgame tt game started....");
	}
}
class VGameCommandArchery extends Command{
	public VGameCommandArchery(TV tv,SetTopBox setTopBox,SoundSystem soundSystem,VGame vGame) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.soundSystem=soundSystem;
		this.vGame=vGame;
	}
	@Override
	public void execute() {
		System.out.println("vgame archery command initiated....");
		tv.av2Mode();
		vGame.archeryGame();;
		soundSystem.lowVolume();
		System.out.println("vgame archery game started....");
	}
}
class TV{
	public void tvOn() {
		System.out.println("switch on tv...");
	}
	public void av1Mode() {
		System.out.println("av1 mode....");
	}
	public void av2Mode() {
		System.out.println("av2 mode.....");
	}
}
class SoundSystem{
	public void lowVolume() {
		System.out.println("low volume...");
	}
	public void highVolume() {
		System.out.println("high volume...");
	}
}
class VGame{
	public void ttGame() {
		System.out.println("tt game...");
	}
	public void archeryGame() {
		System.out.println("archery game.....");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel....");
	}
	public void serialChannel() {
		System.out.println("serial channel.....");
	}
}