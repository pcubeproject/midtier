package com.pcube.midtier.demolib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
/**
 * Created by kenya on 2019/4/9.
 */
public class DemoLibImpl {


    /** Simple example of JNA interface mapping and usage. */
    public class HelloWorld {

        // This is the standard, stable way of mapping, which supports extensive
        // customization and mapping of Java to native types.

        public interface CLibrary extends Library {
            CLibrary INSTANCE = (CLibrary)
                    Native.load((Platform.isWindows() ? "msvcrt" : "c"),
                            CLibrary.class);

            void printf(String format, Object... args);
        }

        public interface TestTorchLib extends Library {
            TestTorchLib INSTANCE = (TestTorchLib)
                    Native.load(("TestTorchLib"),
                            TestTorchLib.class);

            void destory();
            //int initialize(String model_path);
        }

        public static void main(String[] args) {
            CLibrary.INSTANCE.printf("Hello, World\n");
            for (int i=0;i < args.length;i++) {
                CLibrary.INSTANCE.printf("Argument %d: %s\n", i, args[i]);
            }
            //TestTorchLib.INSTANCE.initialize(null);
            TestTorchLib.INSTANCE.destory();
            CLibrary.INSTANCE.printf("end\n");

        }
    }
}
