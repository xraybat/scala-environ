/**
  * Created by psc on 29/01/18.
  */

import au.com.carringbushsw.Environ._
import scala.util.{ Try, Success, Failure }

object Main extends App {
  //println("value = " + Environ.get("M2_HOME"))
  //println("value = " + Environ.get("M2_XXX"))

  Environ.get("M2_HOME") match {
    case Success(value) => println("value = " + value)
    case Failure(e) => throw e
  }

  Environ.get("M2_XXX") match {
    case Success(value) => println("value = " + value)
    case Failure(e) => throw e
  }

} // Main