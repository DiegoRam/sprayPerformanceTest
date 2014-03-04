package core

import org.specs2.mutable.Specification
import java.util.UUID
/**
 * Created by diegoram on 3/4/14.
 */
class BundleMemoryStorageTest extends Specification{

  import services.memoryStorage.BundleMemoryRepository

  def mkBundle = Bundle(UUID.randomUUID().toString, "description", 0)

  sequential

  "save a list of bundle elements" in {
    val list = (for {
      i <- 1 to 100
      element = mkBundle
    } yield(element)).toList

    mkBundle.saveList(list)
    success

  }

  "Bundle Memory Storage should" >> {
    "retrieve all elements" in {
      mkBundle.getAll.size should beEqualTo(100)
    }

  }

}
