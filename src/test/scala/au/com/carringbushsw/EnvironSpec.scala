/**
  * Created by psc on 28/04/17.
  */

package au.com.carringbushsw.Environ

import org.scalatest.FlatSpec
import org.scalatest.Assertions._

class EnvironSpec extends FlatSpec {

  "An Environ get" should "return an environment variable" in {
    assert(Environ.get("M2_HOME").isSuccess)
  }

  it should "return a failure with exception otherwise" in {
    assert(!Environ.get("M2_XXX").isSuccess)
  }
} // EnvironSpec
