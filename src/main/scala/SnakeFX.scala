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
  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      width = 800
      height = 800
      scene = new Scene {
        fill = LightGreen
        // added just now
        content = new Rectangle {
          x = 50
          y = 75
          width = 25
          height = 25
          fill = DarkGreen
        }
      }
    }
  }
}
