package org.acme.commandmode

import io.quarkus.runtime.Quarkus

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class HelloCommando: QuarkusApplication {

    override fun run(vararg args: String?): Int {
        val name =  if (args.isNotEmpty()) args.joinToString(",") else "commando"
        println(name)
        Quarkus.waitForExit()
        return 0
    }

}
