package net.danlew.sharedtestmoduleexample.library

import net.danlew.sharedtestmoduleexample.library.sharedtest.FakeMessenger
import org.junit.Assert.assertEquals
import org.junit.Test

class AndroidMessengerTest {

    @Test
    fun messenger() {
        assertEquals("Hello", FakeMessenger("Hello").createMessage())
    }

}