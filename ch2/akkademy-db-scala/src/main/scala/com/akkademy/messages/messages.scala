package com.akkademy.messages

case class SetRequest(key:String,value:Object)
case class GetRequest(key: String)
case class KeyNotFoundException(key:String) extends Exception
case class SetIfNotExists(key:String,value:Object)
case class Delete(key:String)