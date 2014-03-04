package core

import akka.actor.Actor

/**
 * Created by diegoram on 3/4/14.
 */
object Bundles{
  object GetAll
  case class SaveList(xs: List[Bundle])

}

class Bundles extends Actor{
  def receive: Receive = {
    case Bundles.GetAll =>
    case Bundles.SaveList(xs) =>
  }
}