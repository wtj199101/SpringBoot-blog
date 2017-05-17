package mybatisgen;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ServiceSocketClientChannel {
    public static void main(String[] args) throws Exception {
        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(false);
        sc.connect(new InetSocketAddress("127.0.0.1", 9999));
        try {
            if (sc.finishConnect()) {
                String str = "你好，我是客户端";
                System.out.println("准备写：" + str);
                ByteBuffer bf = ByteBuffer.allocate(100);
                bf.put(str.getBytes());
                sc.write(bf);
                // 开始读取数据
                bf.clear();
                int num = -1;
                while ((num = sc.read(bf)) != -1) {
                    if (num == 0) {
                        TimeUnit.SECONDS.sleep(1L);
                        continue;
                    }
                    bf.flip();
                    
                  System.out.println(new String(bf.array(),0,num,"utf-8"));  
                    bf.clear();
                }
                System.out.println("f服务器="+sc.getRemoteAddress());
            } else {
                System.out.println("服务器连接失败");
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
