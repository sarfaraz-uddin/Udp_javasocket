import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //instead of using the try catch we can throw ioexception at psvm
        try {
            DatagramSocket socket=new DatagramSocket();
            String message="Message aayo ta!";
            InetAddress address=InetAddress.getByName("localhost");
            DatagramPacket packet=new DatagramPacket(message.getBytes(),message.length(),address,421);
            //sending message
            socket.send(packet);
            socket.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}