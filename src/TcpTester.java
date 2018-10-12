import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Partho on 10/12/2018.
 */
public class TcpTester {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: tcp-tester.sh <host> <port>");
            System.exit(-1);
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);

        System.out.println("Connecting to Host:" + host + " on Port: " + port);

        Socket socket = new Socket(host, port);

        System.out.println("Connected");

        OutputStream outputStream = socket.getOutputStream();

        System.out.println("Sending HELLO");
        outputStream.write("HELLO".getBytes());

        System.out.println("HELLO Sent");
        socket.close();

        System.out.println("Socket Closed");
    }
}
