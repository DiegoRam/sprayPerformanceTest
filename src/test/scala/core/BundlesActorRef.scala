package core

import akka.testkit.{ImplicitSender, TestKit}
import akka.actor.ActorSystem
import org.specs2.mutable.SpecificationLike
import java.util.UUID

/**
 * Created by diegoram on 3/4/14.
 */
class BundlesActorRef extends TestKit(ActorSystem()) with SpecificationLike with CoreActors with Core with ImplicitSender{

  import Bundles._

  def mkBundle = Bundle(UUID.randomUUID().toString, "new bundle", 10.43)

  sequential

  "Bundle Actor should" >> {
    "retrive a list of bundles" in {
      pending
    }

    "save a list of bundles" in {
      pending
    }
  }

}
