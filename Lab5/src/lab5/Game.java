package lab5;


public class Game {
	
	private final static int NUMOFATTEMPT = 3;

	private String player1Name;

	private String player2Name;

	private boolean[] player1Attempt;
	
	private boolean[] player2Attempt;

	
	private int numberofTie;

	
	private String status;

	
	
	
	
	public Game() {
		
		this.player1Name = "Unknown";
		this.player2Name = "Unknown";
		this.status = "The game was initialized with unknown players";
		this.numberofTie = 0;
		this.player1Attempt = new boolean[3];
		this.player2Attempt = new boolean[3];
		
	}

	public Game(String player1Name, String player2Name) {
		
		if(player1Name == "" || player2Name == "") {
			this.player1Name = "Unknown";
			this.player2Name = "Unknown";
			this.status = "The game was initialized with player1(Unknown) and player2(Unknown)";
			this.numberofTie = 0;
			this.player1Attempt = new boolean[3];
			this.player2Attempt = new boolean[3];
		}
		else {
			this.player1Name = player1Name;
			this.player2Name = player2Name;	
			this.status = "The game was initialized with player1("+this.player1Name+") and player2("+this.player2Name+")";
			this.numberofTie = 0;
			this.player1Attempt = new boolean[3];
			this.player2Attempt = new boolean[3];
		}
		
		
	}
	
	public void setPlayer1Name(String player1Name) {
		this.player1Name = player1Name;
		this.status = "Player1 name is set";
	}
	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
		this.status = "Player2 name is set";
	}
	
	public String getPlayer1Name() {
		return this.player1Name;
	}
	public String getPlayer2Name() {
		return this.player2Name;
	}
	
	public void setPlayer1AttempttoSucess(int attemptNo) {
		if(attemptNo>=0 && attemptNo<4) {
			this.player1Attempt[attemptNo] = true;
			this.status = "Player1 score attempt number ("+attemptNo+")";	
		}
		
	}
	public void setPlayer2AttempttoSucess(int attemptNo) {
		
		if(attemptNo>=0 && attemptNo <4) {
			this.player2Attempt[attemptNo] = true;
			this.status = "Player2 score attempt number ("+attemptNo+")";
		}
		
	}
	
	public void setPlayer1AttempttoFail(int attemptNo) {
		if(attemptNo>=0 && attemptNo <4) {
			this.player1Attempt[attemptNo] = false;
			this.status = "Player1 fail to score attempt number ("+attemptNo+")";
		}	
	}
	
	public void setPlayer2AttempttoFail(int attemptNo) {
		if(attemptNo>=0 && attemptNo <4) {
			this.player2Attempt[attemptNo] = false;
			this.status = "Player2 fail to score attempt number ("+attemptNo+")";
		}
		
	
	}
	
	public int getNoofMovieTicket() {

		
	}
	
	
	

}
