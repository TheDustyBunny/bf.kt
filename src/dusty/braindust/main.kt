package dusty.braindust

import java.io.FileNotFoundException
import java.io.FileReader

@kotlin.ExperimentalUnsignedTypes
fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        try {
            Braindust.interpret(FileReader(args[0]).readText())
        } catch(e: FileNotFoundException) {
            println("A file must be provided: Make sure you spell the name of your file correctly.")
        }
    } else {
        Braindust.repl()
    }
}
