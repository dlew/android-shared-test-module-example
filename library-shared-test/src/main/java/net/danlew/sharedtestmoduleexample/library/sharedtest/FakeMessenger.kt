package net.danlew.sharedtestmoduleexample.library.sharedtest

import net.danlew.sharedtestmoduleexample.library.Messenger

class FakeMessenger(private val message: String) : Messenger {

    override fun createMessage() = message

}