package text

import scala.io.Source

object TextProcessor extends App {
	println("Hello from JVM!")

	if (true) {
		val dataLocation = "dataset.txt"
		val lines = Source.fromFile(dataLocation).getLines

		var lineCount = 0
		
		println("Start")
		while (lines.hasNext) {
			lines.next()
			lineCount += 1
		}
		println("End. Lines: " + lineCount)
	}

	var index = 0

	var sum = 0

	println("Final sum is: " + sum)
}