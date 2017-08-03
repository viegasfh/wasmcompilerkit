package me.tomassetti.wasmkit

import me.tomassetti.wasmkit.serialization.BytesReader
import org.junit.Assert.assertEquals
import org.junit.Test as test

class BytesReaderTest {

    @test
    fun decode624485() {
        val bytes = byteArrayOf(0xE5.toByte(), 0x8E.toByte(), 0x26)
        assertEquals(624485L, BytesReader(bytes).readU32())
    }

    @test
    fun decodeMinus624485() {
        val bytes = byteArrayOf(0x9B.toByte(), 0xF1.toByte(), 0x59)
        assertEquals(-624485L, BytesReader(bytes).readS32())
    }

}