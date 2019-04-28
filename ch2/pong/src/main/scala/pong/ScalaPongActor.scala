package pong

import akka.actor.{Actor, Status}

import scala.concurrent.Future

class ScalaPongActor extends Actor{
  override def receive: Receive = {
    case "Ping" => sender() ! "Pong"
    case  _ => Status.Failure(new Exception("unknown message"))
  }

}