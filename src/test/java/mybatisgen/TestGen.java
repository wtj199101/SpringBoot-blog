package mybatisgen;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;




public class TestGen {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ByteBuffer bf=ByteBuffer.wrap("赵客缦胡缨，吴钩霜雪明。银鞍照白马，飒沓如流星。\n".getBytes());
        FileChannel fc=null;
        FileOutputStream fos=null;
        String Path=null;
         fos = new FileOutputStream(Path);
         fc=fos.getChannel();
         bf.rewind();
         fc.write(bf);
        
    }

}
