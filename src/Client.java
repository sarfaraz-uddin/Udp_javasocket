import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args){
        //instead of using the try catch we can throw ioexception at psvm

        try {
            DatagramSocket socket=new DatagramSocket(421);
            byte[] data=new byte[1024]; //the data which comes from the server is in the form of bytes so it is received here
            DatagramPacket packet=new DatagramPacket(data,data.length);
            socket.receive(packet);
            String message=new String(packet.getData(),0,packet.getLength());
            System.out.println(message);
            socket.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
