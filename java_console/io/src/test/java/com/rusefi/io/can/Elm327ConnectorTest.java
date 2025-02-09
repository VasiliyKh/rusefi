package com.rusefi.io.can;

import com.rusefi.io.IoStream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Elm327ConnectorTest {
    @Test
    public void testBytesToString() {
        assertEquals("30 46 0D ",
                IoStream.printHexBinary(Elm327Connector.byteToString(new byte[]{0xF}, new byte[]{}, 0, 0))
        );


        assertEquals("31 30 30 42 30 30 30 35 36 42 30 30 30 30 35 30 0D ",
                IoStream.printHexBinary(Elm327Connector.byteToString(new byte[]{16, 11}, new byte[]{0, 5, 107, 0, 0, 80, 95, 105, -81, -96, 112}, 0, 6))
        );

    }
}
