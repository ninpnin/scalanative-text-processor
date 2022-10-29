package nativetext

import scala.io.Source

object NativeTextProcessor extends App {
	println("Hello from Native!")

	
	if (true) {
		val dataLocation = "dataset.txt"
		val lines = Source.fromFile(dataLocation).getLines

		var lineCount = 0
		var line = ""

		println("Start")
		while (lines.hasNext) {
			lines.next()
			lineCount += 1
		}
		println("End. Lines: " + lineCount)
	}
	var sum = 0


	println("Final sum is: " + sum)

}