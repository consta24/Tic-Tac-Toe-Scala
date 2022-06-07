import Main.{makeBoard, next, show}

object Test extends App {

  val emptyBoard =
    """.....
      |.....
      |.....
      |.....
      |.....""".stripMargin

  show(makeBoard(emptyBoard))
  next(Two)(makeBoard(emptyBoard))

  var roundCount = 0
  while (true) {
    if (roundCount % 2 == 0)
      print("Player One Turn")
    else
      print("Player Two Turn")
    roundCount += 1
    if (roundCount == 25)
      print("Game Over")
  }
}