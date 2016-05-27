package org.nd4j.linalg.cpu.nativecpu.ops;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * @author raver119@gmail.com
 */
@Ignore
public class NativeOpExecutionerTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void execBroadcastOp() throws Exception {
        INDArray array = Nd4j.ones(256, 1024);
        INDArray arrayRow = Nd4j.linspace(1, 1024, 1024);

        long time1 = System.nanoTime();
        array.addiRowVector(arrayRow);
        long time2 = System.nanoTime();

        System.out.println("Execution time: " + (time2 - time1));
    }

    @Test
    public void execReduceOp1() throws Exception {
        INDArray array = Nd4j.ones(256, 1024);
        INDArray arrayRow = Nd4j.linspace(1, 1024, 1024);

        long time1 = System.nanoTime();
        float sum = array.sumNumber().floatValue();
        long time2 = System.nanoTime();

        System.out.println("Execution time: " + (time2 - time1));
    }

    @Test
    public void execReduceOp2() throws Exception {
        INDArray array = Nd4j.ones(3, 1024);
        INDArray arrayRow = Nd4j.linspace(1, 1024, 1024);

        long time1 = System.nanoTime();
        float sum = array.sumNumber().floatValue();
        long time2 = System.nanoTime();

        System.out.println("Execution time: " + (time2 - time1));
    }

}