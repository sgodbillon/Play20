package models

import play.api.Json._
import play.api.json.AST._
import play.api.json.Formats._

case class User(id: Long, name: String, favThings: List[String])

object Protocol {

    implicit object UserFormat extends Format[User] {

        def writes(o: User): JsValue = JsObject(
            Map("id" -> JsNumber(o.id),
                "name" -> JsString(o.name),
                "favThings" -> JsArray(o.favThings.map(JsString(_)))
            )
        )

        def reads(json: JsValue): User = User(
            (json \ "id").as[Long],
            (json \ "name").as[String],
            (json \ "favThings").as[List[String]]
        )

    }

}

