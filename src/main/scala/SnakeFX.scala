// all the imports we're going to need in the entire app
// (auto-import helps a lot, but adding them here in case of confusion)
import scalafx.application.{JFXApp3, Platform}
import scalafx.beans.property.{IntegerProperty, ObjectProperty}
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

import scala.concurrent.Future
import scala.util.Random

object SnakeFx extends JFXApp3 {

  val initialSnake: List[(Double, Double)] = List(
    (250, 200),
    (225, 200),
    (200, 200)
  )

  case class State(snake: List[(Double, Double)], food: (Double, Double)) {
//    update the new head of the snake, given the direction
//    update the rest of the snake by placing the last n-1 squares at the positions of the first n-1 squares
//    check if we’re out of the scene boundaries OR eating our own tail;
//    reset the state in this case
//    check if the snake is just eating the food;
//    re-generate food coordinates in that case
    def newState(dir: Int): State = {
  val (x, y) = snake.head
  val (newx, newy) = dir match {
    case 1 => (x, y - 25) // up
    case 2 => (x, y + 25) // down
    case 3 => (x - 25, y) // left
    case 4 => (x + 25, y) // right
    case _ => (x, y)

      val newSnake: List[(Double, Double)] =
        if (newx < 0 || newx >= 800 || newy < 0 || newy >= 800 || snake.tail.contains((newx, newy)))
          initialSnake
        else ???
  }


  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      width = 800
      height = 800
      scene = new Scene {
        fill = IndianRed
        // added just now
        content = new Rectangle {
          x = 50
          y = 75
          width = 20
          height = 20
          fill = DarkRed
        }
      }
    }
  }
  def square(xr: Double, yr: Double, color: Color) = new Rectangle {
    x = xr
    y = yr
    width = 25
    height = 25
    fill = color
  }
}
