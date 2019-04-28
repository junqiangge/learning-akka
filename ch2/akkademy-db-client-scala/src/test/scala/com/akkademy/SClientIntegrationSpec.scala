package com.akkademy

import com.akkademy.messages.KeyNotFoundException
import org.scalatest.{FunSpecLike, Matchers}

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

class SClientIntegrationSpec extends FunSpecLike with Matchers {
  val client = new SClient("127.0.0.1:2552")

  describe("akkademyDbClient") {
    import scala.concurrent.ExecutionContext.Implicits.global
    it("should set a value"){
      client.set("123", new Integer(123))
      val futureResult = client.get("123")
      val result = Await.result(futureResult, 10 seconds)
      result should equal(123)
    }
    it("should can not set value while a exit key"){
      val f=client.setifnotexist("123", new Integer(123)).recover{
        case t:KeyNotFoundException=> "default"
      }
      val result = Await.result(f, 10 second)

      result should equal("default")
    }

  }
}

