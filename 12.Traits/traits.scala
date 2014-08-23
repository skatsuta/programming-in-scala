trait Doubling extends IntQueue {
  abstract override def put(x: Int) = super.put(2 * x)
}

trait Incrememting extends IntQueue {
  abstract override def put(x: Int) = super.put(x + 1)
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = if (x >= 0) super.put(x)
}
