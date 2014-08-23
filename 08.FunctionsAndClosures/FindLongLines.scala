object FindLongLines {
  def main(args: Array[String]) {
    val width = args(0).toInt
    args.drop(1).foreach(arg => LongLines.processFiles(arg, width))
  }
}
