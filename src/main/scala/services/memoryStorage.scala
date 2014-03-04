package services

import core.Bundle

/**
 * Created by diegoram on 3/4/14.
 */
trait Entity

trait Repository[E <: Entity]{
  def getAll : List[E]
  def saveList(xs: List[E]): Option[List[E]]
}

object memoryStorage {

  var memoryBundleBuffer = List[Bundle]()

  implicit class BundleMemoryRepository(e: Bundle) extends Repository[Bundle]{

    def saveList(xs: List[Bundle]): Option[List[Bundle]] = xs match {
      case Nil => None
      case head :: tail => {
        head :: tail foreach(bundle => memoryBundleBuffer = bundle +: memoryBundleBuffer)
        Some(head::tail)
      }
    }

    def getAll: List[Bundle] = memoryBundleBuffer
  }

}
