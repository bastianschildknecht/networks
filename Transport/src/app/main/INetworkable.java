package app.main;

public interface INetworkable {
	
	public void onConnect(NetworkSim sim);
	public void onDisconnect(NetworkSim sim);
	
	public void receivePacket(byte[] packet);
	
}
