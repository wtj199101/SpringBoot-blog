package mybatisgen;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ServerSocketChanneltTest {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel ssc = null;
        ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);
        ssc.bind(new InetSocketAddress("127.0.0.1", 9999));
        SocketChannel sc = null;
        try {
            while (true) {
                sc = ssc.accept();
                if (sc == null) {
                    TimeUnit.SECONDS.sleep(1);
                    continue;
                }
                System.out.println("准备读------");
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                byteBuffer.clear();
                sc.read(byteBuffer);
                System.out.println(byteBuffer);
                byteBuffer.flip();
                System.out.println(Arrays.toString(byteBuffer.array()));
                // 往客户端写数据
                SocketAddress remoteAddress = sc.getRemoteAddress();
                if (remoteAddress != null) {

                    System.out.println("remoteAddress=" + remoteAddress);
                    byteBuffer.clear();
                    byteBuffer.putInt(127);
                    sc.write(byteBuffer);
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
            if (ssc != null) {
                ssc.close();
            }
        }

    }
}
