package nativetext

import scala.io.Source

object NativeTextProcessor {
  def main(args: Array[String]) = {
    val files = if (args.length == 0) "no files" else args.toList.reduceLeft(_ + ", " + _)
    println(s"Files: $files")

    val lines = args.flatMap(f => Source.fromFile(f).getLines)
    val words = lines.flatMap(_.split(" "))
    
    val output = s"Total number of words: ${words.length}"
    println(output)
  }
}