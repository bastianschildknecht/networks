package app.main;

public class Main {

	public static void main(String[] args) {
		NetworkSim net = new NetworkSim();
		
		NetworkClient sender = new NetworkClient();
		NetworkClient receiver = new NetworkClient();
		
		net.connect(sender);
		net.connect(receiver);

	}

}
