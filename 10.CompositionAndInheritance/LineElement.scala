class LineElement(s: String) extends Element {
  def contents = Array(s)
  override def width = s.length
  override def height = 1
}
