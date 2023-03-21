package day_4.behavioral;

public class Command_Pattern {
	public static void main(String[] args) {
		AlphaTeam alpha=new AlphaTeam();
		BravoTeam bravo=new BravoTeam();
		CharlieTeam charlie=new CharlieTeam();
		DeltaTeam delta=new DeltaTeam();
		
		CommandRoom commandRoom=new CommandRoom();
		
		commandRoom.setCommand(1, new PointA(alpha, bravo, charlie, delta));
		commandRoom.setCommand(2, new PointB(alpha, bravo, charlie, delta));
		commandRoom.setCommand(3, new PointC(alpha, bravo, charlie, delta));
		commandRoom.setCommand(4, new PointD(alpha, bravo, charlie, delta));
		
		commandRoom.executeCommand(2);
		
	}
}
class CommandRoom{
	Command c[]=new Command[5];
	
	public CommandRoom() {
		for(int i=0;i<c.length;i++) {
			c[i]=new Command() {				
				@Override
				public void capture() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}
	
	public void executeCommand(int slot) {
		c[slot].capture();
	}
	public void setCommand(int slot,Command cc) {
		c[slot]=cc;
	}
}
abstract class Command{
	AlphaTeam alpha;
	BravoTeam bravo;
	CharlieTeam charlie;
	DeltaTeam delta;
	public abstract void capture();
}
class PointA extends Command{
	
	public PointA(AlphaTeam alpha,BravoTeam bravo,CharlieTeam charlie, DeltaTeam delta) {
		this.alpha=alpha;
		this.bravo=bravo;
		this.delta=delta;
		this.charlie=charlie;
	}
	@Override
	public void capture() {
		System.out.println("Offensive command initiated....");
		alpha.openFire();
		bravo.clearBuildings();
		delta.smokeCover();
		System.out.println("Point Captured....");
	}
}
class PointB extends Command{
	public PointB(AlphaTeam alpha,BravoTeam bravo,CharlieTeam charlie, DeltaTeam delta) {
		this.alpha=alpha;
		this.bravo=bravo;
		this.delta=delta;
		this.charlie=charlie;
	}
	@Override
	public void capture() {
		System.out.println("Covering and Securing Point B Buildings....");
		alpha.coverFire();
		bravo.secureBuildings();
		charlie.mortarRefill();
		System.out.println("Secured and Captured....");
	}
}

class PointC extends Command{
	public PointC(AlphaTeam alpha,BravoTeam bravo,CharlieTeam charlie, DeltaTeam delta) {
		this.alpha=alpha;
		this.bravo=bravo;
		this.delta=delta;
		this.charlie=charlie;
	}
	@Override
	public void capture() {
		System.out.println("Shelling the point with mortar and cover firing with smoke....");
		alpha.coverFire();
		charlie.mortarFire();;
		delta.smokeCover();
		System.out.println("Point captured with causalities....");
	}
}

class PointD extends Command{
	public PointD(AlphaTeam alpha,BravoTeam bravo,CharlieTeam charlie, DeltaTeam delta) {
		this.alpha=alpha;
		this.bravo=bravo;
		this.delta=delta;
		this.charlie=charlie;
	}
	@Override
	public void capture() {
		System.out.println("Attack started with low cavalry and called for airstrike....");
		charlie.mortarRefill();
		delta.airStrikes();
		alpha.retreat();
		System.out.println("Attack failed with high causalities....");
	}
}

class AlphaTeam{
	public void openFire() {
		System.out.println("Pick out targets with offensive push...");
	}
	public void retreat() {
		System.out.println("Fall back moving back to the checkpoint....");
	}
	public void coverFire() {
		System.out.println("Coverfire while Bravo Team clears targets.....");
	}
}

class BravoTeam{
	public void clearBuildings() {
		System.out.println("Flash Bang and clear out the buildings....");
	}
	public void secureBuildings() {
		System.out.println("Lockdown the building and clear all safe spots and create"
				+ "defensive positions.....");
	}
}

class CharlieTeam{
	public void mortarFire() {
		System.out.println("Concentrated shell fire on coordinates..");
	}
	public void mortarRefill() {
		System.out.println("Refilling shells.....");
	}
}

class DeltaTeam{
	public void airStrikes() {
		System.out.println("Apache strikes marked with laser...");
	}
	public void smokeCover() {
		System.out.println("Cover with smoke for comrades to fall back...");
	}
}