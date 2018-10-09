import java.io.*;

class CS440Test {

	public static void main(String[] args) throws IOException
	{
		GreetClient client = new GreetClient();
		client.startConnection("192.168.99.1", 50001);
		String res = client.sendMessage("D1300B04C1DF");
		System.out.println(res);
	}
}
