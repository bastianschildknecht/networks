package app.main;

import java.util.ArrayList;
import java.util.List;

public class NetworkClient implements INetworkable {
	
	private List<byte[]> buffer;
	
	public NetworkClient() {
		buffer = new ArrayList<byte[]>();
	}
	
	@Override
	public void receivePacket(byte[] packet) {
		buffer.add(packet);
		
	}

	@Override
	public void onConnect(NetworkSim sim) {
		
	}

	@Override
	public void onDisconnect(NetworkSim sim) {
		
	}

}
