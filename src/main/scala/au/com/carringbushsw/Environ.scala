/**
  * Created by psc on 29/01/18.
  */

package au.com.carringbushsw.Environ

import scala.util.{ Try, Success, Failure }
import sys.process._
import java.io.File

case class EnvironGetException(private val message: String = "", private val cause: Throwable = None.orNull) extends Exception(message, cause) 

object Environ  {
  def get(variable: String): Try[String] = {
    var value = Process(Seq("bash", "-c", "echo $" + variable)).!!.trim
    if (value.length() > 0) Success(value)
    else Failure(new EnvironGetException(variable))
  }
} // Environ