import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;
import static org.junit.Assert.*;

import java.lang.*;
public class Untitled{
    public static void main(String[] vargs){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(() -> {
            Thread.sleep(100);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            return null;
        });
         
        assertEquals(3, executor.getPoolSize());
        assertEquals(0, executor.getQueue().size());
    }
}